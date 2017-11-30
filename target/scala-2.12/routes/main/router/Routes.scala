
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/EventoProjeto/conf/routes
// @DATE:Thu Nov 30 01:30:30 BRST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:21
  CountController_3: controllers.CountController,
  // @LINE:23
  AsyncController_2: controllers.AsyncController,
  // @LINE:26
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:21
    CountController_3: controllers.CountController,
    // @LINE:23
    AsyncController_2: controllers.AsyncController,
    // @LINE:26
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, CountController_3, AsyncController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eventos""", """controllers.HomeController.cadastroDeEvento"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sobre""", """controllers.HomeController.sobre"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eventos/novo""", """controllers.HomeController.cadastroDeNovoEvento"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eventos/lista""", """controllers.HomeController.listaTudo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_cadastroDeEvento1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eventos")))
  )
  private[this] lazy val controllers_HomeController_cadastroDeEvento1_invoker = createInvoker(
    HomeController_0.cadastroDeEvento,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "cadastroDeEvento",
      Nil,
      "GET",
      this.prefix + """eventos""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_sobre2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sobre")))
  )
  private[this] lazy val controllers_HomeController_sobre2_invoker = createInvoker(
    HomeController_0.sobre,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "sobre",
      Nil,
      "GET",
      this.prefix + """sobre""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_cadastroDeNovoEvento3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eventos/novo")))
  )
  private[this] lazy val controllers_HomeController_cadastroDeNovoEvento3_invoker = createInvoker(
    HomeController_0.cadastroDeNovoEvento,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "cadastroDeNovoEvento",
      Nil,
      "POST",
      this.prefix + """eventos/novo""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_listaTudo4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eventos/lista")))
  )
  private[this] lazy val controllers_HomeController_listaTudo4_invoker = createInvoker(
    HomeController_0.listaTudo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "listaTudo",
      Nil,
      "GET",
      this.prefix + """eventos/lista""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_CountController_count5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count5_invoker = createInvoker(
    CountController_3.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_AsyncController_message6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message6_invoker = createInvoker(
    AsyncController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_cadastroDeEvento1_route(params) =>
      call { 
        controllers_HomeController_cadastroDeEvento1_invoker.call(HomeController_0.cadastroDeEvento)
      }
  
    // @LINE:8
    case controllers_HomeController_sobre2_route(params) =>
      call { 
        controllers_HomeController_sobre2_invoker.call(HomeController_0.sobre)
      }
  
    // @LINE:13
    case controllers_HomeController_cadastroDeNovoEvento3_route(params) =>
      call { 
        controllers_HomeController_cadastroDeNovoEvento3_invoker.call(HomeController_0.cadastroDeNovoEvento)
      }
  
    // @LINE:16
    case controllers_HomeController_listaTudo4_route(params) =>
      call { 
        controllers_HomeController_listaTudo4_invoker.call(HomeController_0.listaTudo)
      }
  
    // @LINE:21
    case controllers_CountController_count5_route(params) =>
      call { 
        controllers_CountController_count5_invoker.call(CountController_3.count)
      }
  
    // @LINE:23
    case controllers_AsyncController_message6_route(params) =>
      call { 
        controllers_AsyncController_message6_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:26
    case controllers_Assets_versioned7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
