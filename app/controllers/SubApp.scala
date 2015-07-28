package controllers

import models.DAO.TaskDAO
import models._
import play.api.data.Forms._
import play.api.data._
import play.api.mvc._
import views._


/**
 * Created by oshikawatakashi on 2015/06/09.
 */
object Subapp extends Controller with Secured {

  //ログインフォーム
  val loginForm = Form(
    tuple(
      "user_id" -> nonEmptyText,
      "password" -> nonEmptyText
    ) verifying ("Invalid user_id or password", result => result match {
      case (user_id, password) => User.authenticate(user_id, password).isDefined
    })
  )

  //トップページ
  def index = isAuthenticated { user_id => _ =>
    Ok("Login OK Google")
  }

  def okPage = Action {
    Ok("login Successed!!")
  }

  def testPage = Action {
    Ok(views.html.testpage())
  }

  //ログインページ
  def login = Action { request =>
    val user_id = request.session.get("user_id").getOrElse(" non User ID")
    TaskDAO setupDB
//    TaskDAO insertUser
    val res = TaskDAO.findAll
//    Ok( res.getClass.toString )
    Ok( res.toString )
//    Ok("OK" + user_id)
  }

  //ユーザ認証
  def authenticate = Action { implicit request =>
    loginForm.bindFromRequest.fold(
      formWithError => BadRequest(html.testpage()),
      user => Redirect(routes.Subapp.login()).withSession("user_id" -> user._1)
    )
  }

  //ログアウト
  def logout = Action {
    Redirect(routes.Subapp.login()).withNewSession.flashing(
      "success" -> "You've been logged out"
    )
  }

  //登録フォーム
  val signUpForm = Form(
   tuple(
     "user_id" -> nonEmptyText.verifying(
       "Already exist User",
       user_id => User.findByUserId(user_id).isEmpty
     ),
     "password" -> nonEmptyText,
     "nick_name" -> nonEmptyText
   )
  )

  //ユーザ登録
  def register = Action { implicit request =>
    signUpForm.bindFromRequest.fold(
      errors => BadRequest(html.testpage()),
      form => {
        val user = User(form._1, form._2, form._3)
        User.create(user)
        Redirect(routes.Subapp.okPage())
      }
    )
  }

}







//Form(
//ObjectMapping2(
//<function2>,<function1>,
//(user_id,FieldMapping
//(,List
//(Constraint
//(Some
//(constraint.required),WrappedArray())))),
//(password,FieldMapping
//(,List
//(Constraint
//(Some
//(constraint.required),WrappedArray())))),,List(Constraint(None,List()))),Map(user_id -> okamoto, password -> kaka, action -> ),List(FormError(,List(Invalid user_id or password),WrappedArray())),None)