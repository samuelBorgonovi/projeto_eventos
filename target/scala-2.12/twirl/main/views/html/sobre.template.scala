
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

object sobre extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""


"""),_display_(/*4.2*/main("Welcome to Play")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""

    """),format.raw/*6.5*/("""<!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">acEventos</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href=""""),_display_(/*16.42*/routes/*16.48*/.HomeController.index()),format.raw/*16.71*/("""">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href=""""),_display_(/*19.42*/routes/*19.48*/.HomeController.cadastroDeEvento()),format.raw/*19.82*/("""">Cadastrar</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href=""""),_display_(/*22.42*/routes/*22.48*/.HomeController.listaTudo()),format.raw/*22.75*/("""">Eventos</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href=""""),_display_(/*25.44*/routes/*25.50*/.HomeController.sobre()),format.raw/*25.73*/("""">Sobre</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  
    <br>
    <h4>Saiba mais sobre nosso projeto.</h4>
    <hr>
    <br>
    <p>O acEventos é uma ferramenta para facilitar a busca de lugares para entretenimento e diversão.</p>

      <!-- /.container -->
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        
        
      <!-- Footer -->
      <footer class="py-5 bg-dark">
        <div class="container">
          <p class="m-0 text-center text-white">Copyright &copy; Desenvolvido por Dhemerson Araújo e Samuel Borgonovi - 2017</p>
        </div>
        <!-- /.container -->
      </footer>
  
      <!-- Bootstrap core JavaScript -->
      <script src=""""),_display_(/*62.21*/routes/*62.27*/.Assets.versioned("javascripts/jquery.js")),format.raw/*62.69*/(""""></script>
      <script src=""""),_display_(/*63.21*/routes/*63.27*/.Assets.versioned("javascripts/bootstrap_bundle.js")),format.raw/*63.79*/(""""></script>
""")))}))
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
                  SOURCE: C:/eventos/app/views/sobre.scala.html
                  HASH: 67de07c51c98cc23b54e77105ff154d487504b28
                  MATRIX: 948->1|1060->18|1089->22|1120->45|1159->47|1191->53|1853->688|1868->694|1912->717|2043->821|2058->827|2113->861|2249->970|2264->976|2312->1003|2448->1112|2463->1118|2507->1141|3345->1952|3360->1958|3423->2000|3482->2032|3497->2038|3570->2090
                  LINES: 28->1|33->1|36->4|36->4|36->4|38->6|48->16|48->16|48->16|51->19|51->19|51->19|54->22|54->22|54->22|57->25|57->25|57->25|94->62|94->62|94->62|95->63|95->63|95->63
                  -- GENERATED --
              */
          