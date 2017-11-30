
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.32*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*7.62*/("""
        """),format.raw/*8.9*/("""<title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("/lib/bootstrap/css/bootstrap.min.css")),format.raw/*9.117*/("""">
		<link rel="stylesheet" media="screen" href=""""),_display_(/*10.48*/routes/*10.54*/.Assets.versioned("/lib/font-awesome/css/font-awesome.min.css")),format.raw/*10.117*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.versioned("lib/bootstrap-datepicker/css/bootstrap-datepicker3.css")),format.raw/*11.135*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.59*/routes/*12.65*/.Assets.versioned("images/favicon.png")),format.raw/*12.104*/("""">
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.versioned("/lib/jquery/jquery.min.js")),format.raw/*13.75*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*14.70*/("""" type="text/javascript"></script>

        <!-- Bootstrap core CSS -->
        <link href=""""),_display_(/*17.22*/routes/*17.28*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*17.74*/("""" rel="stylesheet">
    
        <!-- Custom styles for this template -->
        <link href=""""),_display_(/*20.22*/routes/*20.28*/.Assets.versioned("stylesheets/bootstrap_portfolio.css")),format.raw/*20.84*/("""" rel="stylesheet">
       
        
    </head>
    <body>
      
        """),_display_(/*26.10*/if(!flash.isEmpty)/*26.28*/{_display_(Seq[Any](format.raw/*26.29*/("""
            """),format.raw/*27.13*/("""<section class="container" title = "Notificações">
                """),_display_(/*28.18*/for(key <- flash.keySet) yield /*28.42*/{_display_(Seq[Any](format.raw/*28.43*/("""
                    """),format.raw/*29.21*/("""<p class="alert alert-"""),_display_(/*29.44*/key),format.raw/*29.47*/(""" """),format.raw/*29.48*/("""text-"""),_display_(/*29.54*/key),format.raw/*29.57*/("""">
                    """),_display_(/*30.22*/flash/*30.27*/.get(key)),format.raw/*30.36*/("""
                    """),format.raw/*31.21*/("""</p>
                """)))}),format.raw/*32.18*/("""
            
                """),_display_(/*34.18*/flash/*34.23*/.clear()),format.raw/*34.31*/("""
            """),format.raw/*35.13*/("""</section>
        """)))}),format.raw/*36.10*/("""
        """),format.raw/*37.9*/("""<main class="container">
            """),_display_(/*38.14*/content),format.raw/*38.21*/("""
        """),format.raw/*39.9*/("""</main>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Nov 28 00:21:09 BRST 2017
                  SOURCE: C:/EventoProjeto/app/views/main.scala.html
                  HASH: e0a0ab3e1bb33ce9c53c2135c3fb1de2f732ee4e
                  MATRIX: 952->2|1077->32|1105->34|1184->139|1219->148|1253->156|1278->161|1366->223|1380->229|1458->286|1535->336|1550->342|1635->405|1718->461|1733->467|1830->542|1918->603|1933->609|1994->648|2046->673|2061->679|2128->725|2212->782|2227->788|2289->829|2409->922|2424->928|2491->974|2613->1069|2628->1075|2705->1131|2808->1207|2835->1225|2874->1226|2915->1239|3010->1307|3050->1331|3089->1332|3138->1353|3188->1376|3212->1379|3241->1380|3274->1386|3298->1389|3349->1413|3363->1418|3393->1427|3442->1448|3495->1470|3553->1501|3567->1506|3596->1514|3637->1527|3688->1547|3724->1556|3789->1594|3817->1601|3853->1610
                  LINES: 28->2|33->2|35->4|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|48->17|48->17|48->17|51->20|51->20|51->20|57->26|57->26|57->26|58->27|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|62->31|63->32|65->34|65->34|65->34|66->35|67->36|68->37|69->38|69->38|70->39
                  -- GENERATED --
              */
          