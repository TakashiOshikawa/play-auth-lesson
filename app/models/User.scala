package models

import play.api.db.DB
import play.api.Play.current
import anorm._
import anorm.SqlParser._

/**
 * Created by oshikawatakashi on 2015/06/10.
 */

case class User(user_id: String, password: String, nick_name: String)

object User {

  //レコードをパースするために定義
  val simple = {
      get[String]("prov_user.user_id") ~
      get[String]("prov_user.password") ~
      get[String]("prov_user.nick_name") map {
      case user_id ~ password ~ nick_name => User(user_id, password, nick_name)
    }
  }

  //ユーザIDで検索
  def findByUserId(user_id: String): Option[User] = {
    DB.withConnection { implicit c =>
      SQL("SELECT * FROM prov_user WHERE user_id = {user_id}").on(
        'user_id -> user_id
      ).as(User.simple.singleOpt)
    }
  }

  //ニックネーム検索
  def findByNickname(nick_name: String): Option[User] = {
    DB.withConnection{ implicit c =>
      SQL("SELECT * FROM prov_user WHERE nick_name = {nick_name}").on(
        'nick_name -> nick_name
      ).as(User.simple.singleOpt)
    }
  }

  //全員取得
  def findAll: Seq[User] = {
    DB.withConnection{ implicit c =>
      SQL("SELECT * FROM prov_user").as(User.simple *)
    }
  }

  //ユーザ認証
  def authenticate(user_id: String, password: String): Option[User] = {
    DB.withConnection { implicit c =>
      SQL(
        """
           SELECT * FROM prov_user
           WHERE user_id = {user_id}
           AND password = {password}
        """
      ).on(
        'user_id -> user_id,
        'password -> password
      ).as(User.simple.singleOpt)
    }
  }

  //ユーザ作成
  def create(user: User): User = {
    DB.withConnection { implicit c =>
      SQL(
        """
           INSERT INTO prov_user (
             user_id, password, nick_name
           )
           VALUES (
             {user_id}, {password}, {nick_name}
           )
        """
      ).on(
        'user_id -> user.user_id,
        'password -> user.password,
        'nick_name -> user.nick_name
      ).executeUpdate()

      user
    }
  }

}
















