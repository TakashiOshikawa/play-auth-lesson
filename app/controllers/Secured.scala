package controllers

import play.api.mvc._

/**
 * Created by oshikawatakashi on 2015/06/10.
 */
trait Secured {

  //ユーザ判別用の値取得関数
  private def user_id(request: RequestHeader) = request.session.get("user_id")

  //未認証時のリダイレクト先
  private def onUnauthorized(request: RequestHeader) = Results.Redirect(routes.Subapp.login)

  //Actionに認証を噛ませてラップ
  def isAuthenticated(f: => String => Request[AnyContent] => Result) = Security.Authenticated(user_id, onUnauthorized) { user =>
    Action(request => f(user)(request))
  }

}
