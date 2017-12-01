
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

object listagem extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Evento],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(Evento : List[Evento]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.25*/("""


"""),_display_(/*5.2*/main("Listagem")/*5.18*/ {_display_(Seq[Any](format.raw/*5.20*/("""

    """),format.raw/*7.5*/("""<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
        <div class="container">
          <a class="navbar-brand" href="#">acEventos</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
              <li class="nav-item active">
                <a class="nav-link" href=""""),_display_(/*16.44*/routes/*16.50*/.HomeController.index()),format.raw/*16.73*/("""">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href=""""),_display_(/*19.44*/routes/*19.50*/.HomeController.cadastroDeEvento()),format.raw/*19.84*/("""">Cadastrar</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href=""""),_display_(/*22.44*/routes/*22.50*/.HomeController.listaTudo()),format.raw/*22.77*/("""">Eventos</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href=""""),_display_(/*25.44*/routes/*25.50*/.HomeController.sobre()),format.raw/*25.73*/("""">Sobre</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>

      <br>
      <h4>Confira a lista de todos os eventos.</h4>
      <hr>

    <table class="table">     
            <tr>    
                <th scope="row">Nome</th>
                <th scope="row">Descrição</th>
                <th scope="row">Organizador</th>
                <th scope="row">Preço</th>
                <th scope="row">Data</th>
            </tr>
        """),_display_(/*44.10*/for(item <- Evento) yield /*44.29*/{_display_(Seq[Any](format.raw/*44.30*/("""
            """),format.raw/*45.13*/("""<tr><td>"""),_display_(/*45.22*/item/*45.26*/.nome),format.raw/*45.31*/("""</td><td>"""),_display_(/*45.41*/item/*45.45*/.descricao),format.raw/*45.55*/("""</td><td>"""),_display_(/*45.65*/item/*45.69*/.organizador),format.raw/*45.81*/("""</td>
                <td>"""),_display_(/*46.22*/item/*46.26*/.preco),format.raw/*46.32*/("""</td><td>"""),_display_(/*46.42*/item/*46.46*/.dataEvento),format.raw/*46.57*/("""</td></tr>
        """)))}),format.raw/*47.10*/("""
    """),format.raw/*48.5*/("""</table>

       
 
""")))}),format.raw/*52.2*/("""
"""))
      }
    }
  }

  def render(Evento:List[Evento]): play.twirl.api.HtmlFormat.Appendable = apply(Evento)

  def f:((List[Evento]) => play.twirl.api.HtmlFormat.Appendable) = (Evento) => apply(Evento)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 30 22:17:58 BRST 2017
                  SOURCE: C:/eventos/app/views/listagem.scala.html
                  HASH: 1003ef7ff281b59c55ad819346225812ee1608bc
                  MATRIX: 957->2|1075->25|1104->29|1128->45|1167->47|1199->53|1855->682|1870->688|1914->711|2051->821|2066->827|2121->861|2263->976|2278->982|2326->1009|2466->1122|2481->1128|2525->1151|3025->1624|3060->1643|3099->1644|3140->1657|3176->1666|3189->1670|3215->1675|3252->1685|3265->1689|3296->1699|3333->1709|3346->1713|3379->1725|3433->1752|3446->1756|3473->1762|3510->1772|3523->1776|3555->1787|3606->1807|3638->1812|3689->1833
                  LINES: 28->2|33->2|36->5|36->5|36->5|38->7|47->16|47->16|47->16|50->19|50->19|50->19|53->22|53->22|53->22|56->25|56->25|56->25|75->44|75->44|75->44|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|77->46|78->47|79->48|83->52
                  -- GENERATED --
              */
          