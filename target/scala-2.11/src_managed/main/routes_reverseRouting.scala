// @SOURCE:/Users/oshikawatakashi/various/play-auth-lesson/conf/routes
// @HASH:853b2d6a9365fc9c4430b2e28a5d7fd5c7e8446a
// @DATE:Wed Jul 01 22:24:48 JST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReverseSubapp {


// @LINE:20
def okPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "play-auth/sub/success")
}
                        

// @LINE:22
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "play-auth/sub/logout")
}
                        

// @LINE:21
def register(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "play-auth/sub/register")
}
                        

// @LINE:18
def testPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "play-auth/sub/test")
}
                        

// @LINE:19
def authenticate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "play-auth/sub/authenticate")
}
                        

// @LINE:15
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "play-auth/sub/index")
}
                        

// @LINE:17
// @LINE:16
def login(): Call = {
   () match {
// @LINE:16
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "play-auth/sub/login")
                                         
   }
}
                                                

}
                          

// @LINE:12
class ReverseAssets {


// @LINE:12
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "play-auth/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def initTasks(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "play-auth/data/tasks")
}
                        

// @LINE:7
// @LINE:6
def index(): Call = {
   () match {
// @LINE:6
case ()  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "play-auth/index")
                                         
   }
}
                                                

// @LINE:8
def formSample(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "play-auth/form_sample")
}
                        

}
                          
}
                  


// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReverseSubapp {


// @LINE:20
def okPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Subapp.okPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play-auth/sub/success"})
      }
   """
)
                        

// @LINE:22
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Subapp.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play-auth/sub/logout"})
      }
   """
)
                        

// @LINE:21
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Subapp.register",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "play-auth/sub/register"})
      }
   """
)
                        

// @LINE:18
def testPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Subapp.testPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play-auth/sub/test"})
      }
   """
)
                        

// @LINE:19
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Subapp.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "play-auth/sub/authenticate"})
      }
   """
)
                        

// @LINE:15
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Subapp.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play-auth/sub/index"})
      }
   """
)
                        

// @LINE:17
// @LINE:16
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Subapp.login",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play-auth/sub/login"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "play-auth/sub/login"})
      }
      }
   """
)
                        

}
              

// @LINE:12
class ReverseAssets {


// @LINE:12
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play-auth/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def initTasks : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.initTasks",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "play-auth/data/tasks"})
      }
   """
)
                        

// @LINE:7
// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "play-auth/index"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "play-auth/index"})
      }
      }
   """
)
                        

// @LINE:8
def formSample : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.formSample",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "play-auth/form_sample"})
      }
   """
)
                        

}
              
}
        


// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
class ReverseSubapp {


// @LINE:20
def okPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Subapp.okPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "okPage", Seq(), "GET", """""", _prefix + """play-auth/sub/success""")
)
                      

// @LINE:22
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Subapp.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "logout", Seq(), "GET", """""", _prefix + """play-auth/sub/logout""")
)
                      

// @LINE:21
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Subapp.register(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "register", Seq(), "POST", """""", _prefix + """play-auth/sub/register""")
)
                      

// @LINE:18
def testPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Subapp.testPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "testPage", Seq(), "GET", """""", _prefix + """play-auth/sub/test""")
)
                      

// @LINE:19
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Subapp.authenticate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "authenticate", Seq(), "POST", """""", _prefix + """play-auth/sub/authenticate""")
)
                      

// @LINE:15
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Subapp.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "index", Seq(), "GET", """ SubApp page""", _prefix + """play-auth/sub/index""")
)
                      

// @LINE:16
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Subapp.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Subapp", "login", Seq(), "GET", """""", _prefix + """play-auth/sub/login""")
)
                      

}
                          

// @LINE:12
class ReverseAssets {


// @LINE:12
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """play-auth/assets/$file<.+>""")
)
                      

}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def initTasks(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.initTasks(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "initTasks", Seq(), "POST", """""", _prefix + """play-auth/data/tasks""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """play-auth/index""")
)
                      

// @LINE:8
def formSample(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.formSample(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "formSample", Seq(), "POST", """""", _prefix + """play-auth/form_sample""")
)
                      

}
                          
}
        
    