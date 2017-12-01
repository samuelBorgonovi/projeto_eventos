
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/eventos/conf/routes
// @DATE:Thu Nov 30 22:17:57 BRST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:23
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def cadastroDeNovoEvento(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "eventos/novo")
    }
  
    // @LINE:16
    def listaTudo(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "eventos/lista")
    }
  
    // @LINE:8
    def sobre(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "sobre")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def cadastroDeEvento(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "eventos")
    }
  
  }

  // @LINE:26
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:21
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }


}
