
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

object cadastroDeEvento extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Form[Evento],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(message: String)(formEvento : Form[Evento]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._
/*6.2*/import b4.vertical.fieldConstructor


Seq[Any](format.raw/*3.46*/("""

"""),format.raw/*7.1*/("""

"""),_display_(/*9.2*/main("Cadastro de Eventos")/*9.29*/ {_display_(Seq[Any](format.raw/*9.31*/("""

	"""),format.raw/*11.2*/("""<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
        <div class="container">
          <a class="navbar-brand" href="#">acEventos</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
              <li class="nav-item active">
                <a class="nav-link" href=""""),_display_(/*20.44*/routes/*20.50*/.HomeController.index()),format.raw/*20.73*/("""">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href=""""),_display_(/*23.44*/routes/*23.50*/.HomeController.cadastroDeEvento()),format.raw/*23.84*/("""">Cadastrar</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href=""""),_display_(/*26.44*/routes/*26.50*/.HomeController.listaTudo()),format.raw/*26.77*/("""">Eventos</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href=""""),_display_(/*29.44*/routes/*29.50*/.HomeController.sobre()),format.raw/*29.73*/("""">Sobre</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>

 """),format.raw/*36.19*/("""
	  	"""),format.raw/*37.5*/("""<br>
		<h4>Cadastre seu evento aqui.</h4>
		<hr>
		"""),_display_(/*40.4*/b4/*40.6*/.form(CSRF(routes.HomeController.cadastroDeNovoEvento))/*40.61*/{_display_(Seq[Any](format.raw/*40.62*/("""

			"""),_display_(/*42.5*/b4/*42.7*/.text(formEvento("nome"),'_label -> "Nome")),format.raw/*42.50*/("""
			"""),_display_(/*43.5*/b4/*43.7*/.text(formEvento("descricao"),'_label -> "Descrição")),format.raw/*43.60*/("""
			"""),_display_(/*44.5*/b4/*44.7*/.text(formEvento("organizador"),'_label -> "Organizador")),format.raw/*44.64*/("""
			"""),_display_(/*45.5*/b4/*45.7*/.number(formEvento("preco"),'_label -> "Preço")),format.raw/*45.54*/("""
			"""),_display_(/*46.5*/b4/*46.7*/.date(formEvento("dataEvento"),'_label -> "Data")),format.raw/*46.56*/("""
			"""),_display_(/*47.5*/b4/*47.7*/.submit('class -> "btn btn-primary")/*47.43*/{_display_(Seq[Any](format.raw/*47.44*/("""Cadastrar""")))}),format.raw/*47.54*/("""

		""")))}),format.raw/*49.4*/(""" 
		 
""")))}),format.raw/*51.2*/("""	
"""))
      }
    }
  }

  def render(message:String,formEvento:Form[Evento]): play.twirl.api.HtmlFormat.Appendable = apply(message)(formEvento)

  def f:((String) => (Form[Evento]) => play.twirl.api.HtmlFormat.Appendable) = (message) => (formEvento) => apply(message)(formEvento)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 30 22:17:58 BRST 2017
                  SOURCE: C:/eventos/app/views/cadastroDeEvento.scala.html
                  HASH: c85d72ad065e2cb5a819193d691281fb649e6775
                  MATRIX: 972->3|1089->50|1112->67|1177->47|1205->103|1233->106|1268->133|1307->135|1337->138|1993->767|2008->773|2052->796|2189->906|2204->912|2259->946|2401->1061|2416->1067|2464->1094|2604->1207|2619->1213|2663->1236|2788->1350|2820->1355|2898->1407|2908->1409|2972->1464|3011->1465|3043->1471|3053->1473|3117->1516|3148->1521|3158->1523|3232->1576|3263->1581|3273->1583|3351->1640|3382->1645|3392->1647|3460->1694|3491->1699|3501->1701|3571->1750|3602->1755|3612->1757|3657->1793|3696->1794|3737->1804|3772->1809|3809->1816
                  LINES: 28->3|31->5|32->6|35->3|37->7|39->9|39->9|39->9|41->11|50->20|50->20|50->20|53->23|53->23|53->23|56->26|56->26|56->26|59->29|59->29|59->29|66->36|67->37|70->40|70->40|70->40|70->40|72->42|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|77->47|77->47|79->49|81->51
                  -- GENERATED --
              */
          