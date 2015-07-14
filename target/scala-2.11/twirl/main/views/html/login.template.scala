
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head lang="ja">
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
    <p>OKJA</p>
</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 22:14:16 JST 2015
                  SOURCE: /Users/oshikawatakashi/various/play-auth-lesson/app/views/login.scala.html
                  HASH: 44aa90d108a3d8b725abb1fbb9dd1fc240669433
                  MATRIX: 580->0
                  LINES: 22->1
                  -- GENERATED --
              */
          