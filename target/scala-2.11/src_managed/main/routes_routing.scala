// @SOURCE:/Users/oshikawatakashi/various/play-auth-lesson/conf/routes
// @HASH:853b2d6a9365fc9c4430b2e28a5d7fd5c7e8446a
// @DATE:Wed Jul 01 22:24:48 JST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play-auth/index"))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """play-auth/index"""))
        

// @LINE:7
private[this] lazy val controllers_Application_index1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play-auth/index"))))
private[this] lazy val controllers_Application_index1_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"POST", """""", Routes.prefix + """play-auth/index"""))
        

// @LINE:8
private[this] lazy val controllers_Application_formSample2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play-auth/form_sample"))))
private[this] lazy val controllers_Application_formSample2_invoker = createInvoker(
controllers.Application.formSample,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "formSample", Nil,"POST", """""", Routes.prefix + """play-auth/form_sample"""))
        

// @LINE:9
private[this] lazy val controllers_Application_initTasks3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play-auth/data/tasks"))))
private[this] lazy val controllers_Application_initTasks3_invoker = createInvoker(
controllers.Application.initTasks,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "initTasks", Nil,"POST", """""", Routes.prefix + """play-auth/data/tasks"""))
        

// @LINE:12
private[this] lazy val controllers_Assets_at4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play-auth/assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """play-auth/assets/$file<.+>"""))
        

// @LINE:15
private[this] lazy val controllers_Subapp_index5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play-auth/sub/index"))))
private[this] lazy val controllers_Subapp_index5_invoker = createInvoker(
controllers.Subapp.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "index", Nil,"GET", """ SubApp page""", Routes.prefix + """play-auth/sub/index"""))
        

// @LINE:16
private[this] lazy val controllers_Subapp_login6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play-auth/sub/login"))))
private[this] lazy val controllers_Subapp_login6_invoker = createInvoker(
controllers.Subapp.login,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "login", Nil,"GET", """""", Routes.prefix + """play-auth/sub/login"""))
        

// @LINE:17
private[this] lazy val controllers_Subapp_login7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play-auth/sub/login"))))
private[this] lazy val controllers_Subapp_login7_invoker = createInvoker(
controllers.Subapp.login,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "login", Nil,"POST", """""", Routes.prefix + """play-auth/sub/login"""))
        

// @LINE:18
private[this] lazy val controllers_Subapp_testPage8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play-auth/sub/test"))))
private[this] lazy val controllers_Subapp_testPage8_invoker = createInvoker(
controllers.Subapp.testPage,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "testPage", Nil,"GET", """""", Routes.prefix + """play-auth/sub/test"""))
        

// @LINE:19
private[this] lazy val controllers_Subapp_authenticate9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play-auth/sub/authenticate"))))
private[this] lazy val controllers_Subapp_authenticate9_invoker = createInvoker(
controllers.Subapp.authenticate,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "authenticate", Nil,"POST", """""", Routes.prefix + """play-auth/sub/authenticate"""))
        

// @LINE:20
private[this] lazy val controllers_Subapp_okPage10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play-auth/sub/success"))))
private[this] lazy val controllers_Subapp_okPage10_invoker = createInvoker(
controllers.Subapp.okPage,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "okPage", Nil,"GET", """""", Routes.prefix + """play-auth/sub/success"""))
        

// @LINE:21
private[this] lazy val controllers_Subapp_register11_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play-auth/sub/register"))))
private[this] lazy val controllers_Subapp_register11_invoker = createInvoker(
controllers.Subapp.register,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "register", Nil,"POST", """""", Routes.prefix + """play-auth/sub/register"""))
        

// @LINE:22
private[this] lazy val controllers_Subapp_logout12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("play-auth/sub/logout"))))
private[this] lazy val controllers_Subapp_logout12_invoker = createInvoker(
controllers.Subapp.logout,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "logout", Nil,"GET", """""", Routes.prefix + """play-auth/sub/logout"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play-auth/index""","""controllers.Application.index"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play-auth/index""","""controllers.Application.index"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play-auth/form_sample""","""controllers.Application.formSample"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play-auth/data/tasks""","""controllers.Application.initTasks"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play-auth/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play-auth/sub/index""","""controllers.Subapp.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play-auth/sub/login""","""controllers.Subapp.login"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play-auth/sub/login""","""controllers.Subapp.login"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play-auth/sub/test""","""controllers.Subapp.testPage"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play-auth/sub/authenticate""","""controllers.Subapp.authenticate"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play-auth/sub/success""","""controllers.Subapp.okPage"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play-auth/sub/register""","""controllers.Subapp.register"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """play-auth/sub/logout""","""controllers.Subapp.logout""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:7
case controllers_Application_index1_route(params) => {
   call { 
        controllers_Application_index1_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:8
case controllers_Application_formSample2_route(params) => {
   call { 
        controllers_Application_formSample2_invoker.call(controllers.Application.formSample)
   }
}
        

// @LINE:9
case controllers_Application_initTasks3_route(params) => {
   call { 
        controllers_Application_initTasks3_invoker.call(controllers.Application.initTasks)
   }
}
        

// @LINE:12
case controllers_Assets_at4_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:15
case controllers_Subapp_index5_route(params) => {
   call { 
        controllers_Subapp_index5_invoker.call(controllers.Subapp.index)
   }
}
        

// @LINE:16
case controllers_Subapp_login6_route(params) => {
   call { 
        controllers_Subapp_login6_invoker.call(controllers.Subapp.login)
   }
}
        

// @LINE:17
case controllers_Subapp_login7_route(params) => {
   call { 
        controllers_Subapp_login7_invoker.call(controllers.Subapp.login)
   }
}
        

// @LINE:18
case controllers_Subapp_testPage8_route(params) => {
   call { 
        controllers_Subapp_testPage8_invoker.call(controllers.Subapp.testPage)
   }
}
        

// @LINE:19
case controllers_Subapp_authenticate9_route(params) => {
   call { 
        controllers_Subapp_authenticate9_invoker.call(controllers.Subapp.authenticate)
   }
}
        

// @LINE:20
case controllers_Subapp_okPage10_route(params) => {
   call { 
        controllers_Subapp_okPage10_invoker.call(controllers.Subapp.okPage)
   }
}
        

// @LINE:21
case controllers_Subapp_register11_route(params) => {
   call { 
        controllers_Subapp_register11_invoker.call(controllers.Subapp.register)
   }
}
        

// @LINE:22
case controllers_Subapp_logout12_route(params) => {
   call { 
        controllers_Subapp_logout12_invoker.call(controllers.Subapp.logout)
   }
}
        
}

}
     