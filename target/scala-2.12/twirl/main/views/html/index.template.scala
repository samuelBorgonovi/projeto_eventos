
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.19*/("""


"""),_display_(/*5.2*/main("Welcome to Play")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""

    """),format.raw/*7.5*/("""<!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">acEventos</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href=""""),_display_(/*17.42*/routes/*17.48*/.HomeController.index()),format.raw/*17.71*/("""">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href=""""),_display_(/*20.42*/routes/*20.48*/.HomeController.cadastroDeEvento()),format.raw/*20.82*/("""">Cadastrar</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href=""""),_display_(/*23.42*/routes/*23.48*/.HomeController.listaTudo()),format.raw/*23.75*/("""">Eventos</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href=""""),_display_(/*26.42*/routes/*26.48*/.HomeController.sobre()),format.raw/*26.71*/("""">Sobre</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  
      <!-- Page Content -->
      <div class="container">
  
        <!-- Page Heading -->
        <br>
        
        <div class="card h-100">
          <a href="#"><img class="card-body" align="middle" src=""""),_display_(/*40.67*/routes/*40.73*/.Assets.versioned("images/imagem1.png")),format.raw/*40.112*/(""""
           alt=""></a>
        </div>
        
        <!-- /.row -->
  
        <!-- Pagination -->
        <ul class="pagination justify-content-center">
          <li class="page-item">
            <a class="page-link" href="#" aria-label="Previous">
              <span aria-hidden="true">&laquo;</span>
              <span class="sr-only">Previous</span>
            </a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#">1</a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#">2</a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#">3</a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#" aria-label="Next">
              <span aria-hidden="true">&raquo;</span>
              <span class="sr-only">Next</span>
            </a>
          </li>
        </ul>
  
      </div>
      <!-- /.container -->
  
      <!-- Footer -->
      <footer class="py-5 bg-dark">
        <div class="container">
          <p class="m-0 text-center text-white">Copyright &copy; acEventos 2017</p>
        </div>
        <!-- /.container -->
      </footer>
  
      <!-- Bootstrap core JavaScript -->
      <script src=""""),_display_(/*83.21*/routes/*83.27*/.Assets.versioned("javascripts/jquery.js")),format.raw/*83.69*/(""""></script>
      <script src=""""),_display_(/*84.21*/routes/*84.27*/.Assets.versioned("javascripts/bootstrap_bundle.js")),format.raw/*84.79*/(""""></script>
""")))}),format.raw/*85.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 30 22:17:58 BRST 2017
                  SOURCE: C:/eventos/app/views/index.scala.html
                  HASH: 4ec420cd572bd296ed56439b1fb7b438e8388a9d
                  MATRIX: 948->2|1060->19|1089->23|1120->46|1159->48|1191->54|1853->689|1868->695|1912->718|2043->822|2058->828|2113->862|2249->971|2264->977|2312->1004|2446->1111|2461->1117|2505->1140|2832->1440|2847->1446|2908->1485|4208->2758|4223->2764|4286->2806|4345->2838|4360->2844|4433->2896|4476->2909
                  LINES: 28->2|33->2|36->5|36->5|36->5|38->7|48->17|48->17|48->17|51->20|51->20|51->20|54->23|54->23|54->23|57->26|57->26|57->26|71->40|71->40|71->40|114->83|114->83|114->83|115->84|115->84|115->84|116->85
                  -- GENERATED --
              */
          