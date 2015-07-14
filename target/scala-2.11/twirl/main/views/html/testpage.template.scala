
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
object testpage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="ja">

<!-- head start -->
<head>
    <meta charset="utf-8">
    <title>ToDolight</title>
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href=""""),_display_(/*9.51*/routes/*9.57*/.Assets.at("stylesheets/materialize.min.css")),format.raw/*9.102*/(""""  media="screen,projection"/>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*10.51*/routes/*10.57*/.Assets.at("stylesheets/start.css")),format.raw/*10.92*/("""">

    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <script type="text/javascript" src="../js/fastclick.js"></script>
</head>
<!-- head end -->

<!-- body start -->
<body>

<!-- navbar -->
<nav class="blue-grey darken-3 z-depth-2 waves-effect waves-light">
    <div class="nav-wrapper">
        <a href="#" class="brand-logo left">　ToDolight</a>
        <ul id="nav-mobile" class="right">
            <li><a onclick="changeCard()" class="cardChangeButton">Sign up</a></li>
        </ul>
    </div>
</nav>

<!-- container start -->
<div class="container">

    <div class="row"></div><div class="row"></div>


    <!-- icon -->
    <div class="row">
        <div class="col offset-s4 offset-m5">
            <span class="blue-grey-text text-darken-3"><i class="large mdi-action-alarm-on"></i></span>
        </div>
    </div>

    <!-- sub titile -->
    <div class="row center">
        <h4 class="col s12 m12 blue-grey-text text-darken-3">いつか心からやりたくなる</h4>
    </div>


    <!-- move card start -->
    <ul id="move-card">

        <li>
            <!-- Log in card start -->
            <div class="row login">
                <div class="col s12 offset-m2 m8">
                    <div class="col s12 m12 card blue-grey darken-1 z-depth-2 waves-effect">

                        <!-- form start -->
                        <form action="http://localhost:9000/play-auth/sub/authenticate" method="POST">
                            <div class="card-content white-text">

                                <div class="row">
                                    <!-- User Name -->
                                    <div class="input-field col s12 m12">
                                        <i class="mdi-action-account-circle prefix"></i>
                                        <input id="icon_prefix" type="text" class="validate" name="user_id" value="">
                                        <label for="icon_prefix">ユーザーID</label>
                                    </div>
                                    <!-- Password -->
                                    <div class="input-field col s12 m12">
                                        <i class="mdi-communication-vpn-key prefix"></i>
                                        <input id="password" type="password" class="validate" name="password" value="">
                                        <label for="password">パスワード</label>
                                    </div>
                                </div>

                            </div>
                            <!-- submit button -->
                            <div class="card-action right">
                                <button class="btn waves-effect waves-light" type="submit" name="action">Log in
                                    <i class="mdi-content-send right"></i>
                                </button>
                            </div>
                        </form>
                        <!-- form end -->
                    </div>
                </div>
            </div>
            <!-- Log in card end -->
        </li>


        <li>
            <!-- Sign up card start -->
            <div class="row signup">
                <div class="col s12 offset-m2 m8">
                    <div class="col s12 m12 card blue-grey darken-1 z-depth-2 waves-effect">

                        <!-- form start -->
                        <form action="http://localhost:9000/play-auth/sub/register" method="POST">
                            <div class="card-content white-text">

                                <div class="row">
                                    <!-- User Name -->
                                    <div class="input-field col s12 m12">
                                        <i class="mdi-action-account-circle prefix"></i>
                                        <input id="icon_prefix2" type="text" class="validate" name="user_id" value="">
                                        <label for="icon_prefix2">ユーザーID</label>
                                    </div>
                                    <div class="input-field col s12 m12">
                                        <i class="mdi-action-account-circle prefix"></i>
                                        <input id="icon_prefix2" type="text" class="validate" name="nick_name" value="">
                                        <label for="icon_prefix2">ニックネーム</label>
                                    </div>
                                    <!-- Password -->
                                    <div class="input-field col s12 m12">
                                        <i class="mdi-communication-vpn-key prefix"></i>
                                        <input id="password2" type="password" class="validate" name="password" value="">
                                        <label for="password2">パスワード</label>
                                    </div>
                                </div>

                            </div>
                            <!-- submit button -->
                            <div class="card-action right">
                                <button class="btn waves-effect waves-light" type="submit" name="action">Sign up
                                    <i class="mdi-content-send right"></i>
                                </button>
                            </div>
                        </form>
                        <!-- form end -->
                    </div>
                </div>
            </div>
            <!-- Sign up  card end -->
        </li>


    </ul>
    <!-- move card end -->


</div>
<!-- container end -->

<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
// <script type="text/javascript" src="../js/materialize.min.js"></script>
<script type="text/javascript" src=""""),_display_(/*150.38*/routes/*150.44*/.Assets.at("javascripts/materialize.js")),format.raw/*150.84*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*151.38*/routes/*151.44*/.Assets.at("javascripts/start.js")),format.raw/*151.78*/(""""></script>
</body>
<!-- body end -->

</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jul 07 22:14:16 JST 2015
                  SOURCE: /Users/oshikawatakashi/various/play-auth-lesson/app/views/testpage.scala.html
                  HASH: 6f7173d70e8f126b3388c4eb37ff6ca4d5985df1
                  MATRIX: 583->0|810->201|824->207|890->252|998->333|1013->339|1069->374|7096->6373|7112->6379|7174->6419|7251->6468|7267->6474|7323->6508
                  LINES: 22->1|30->9|30->9|30->9|31->10|31->10|31->10|171->150|171->150|171->150|172->151|172->151|172->151
                  -- GENERATED --
              */
          