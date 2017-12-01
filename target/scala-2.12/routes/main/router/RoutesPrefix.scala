
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/eventos/conf/routes
// @DATE:Thu Nov 30 22:17:57 BRST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
