
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/EventoProjeto/conf/routes
// @DATE:Thu Nov 30 01:30:30 BRST 2017


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
