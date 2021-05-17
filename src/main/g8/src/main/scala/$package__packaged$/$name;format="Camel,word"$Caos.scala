package $package$

import $package$.$name;format="Camel,word"$
import caos.frontend.Configurator
import caos.frontend.Configurator._
import caos.view.View
import caos.view._

/** A configuration instance for the CAOS framework
 * 
 * Take a look at [[https://github.com/arcalab/choreo Choreo]] for inspiration
 */
object $name;format="Camel,word"$Caos extends Configurator[$name;format="Camel,word"$] {
  
  /** Tool name. */
  val name = "$name$"
  
  /** Parser for $name$. */
  val parser: String=>$name;format="Camel,word"$ = str => $name;format="Camel,word"$Term

  /** A list of [[Example]]s to show in the tool */
  val examples = List()

  /** A list of [[Widget]]s to show in the tool 
   * 
   * Example: a [[Visualize]] widget showing a Hello world Sequence Chart in Mermaid.
   */
  val widgets: Iterable[(String,Widget[$name;format="Camel,word"$])] = List(
    "Hello World" -> Visualize(helloworld(_),id)
  )

  /** Example of a transformation function returning a Mermaid [[View]]. */
  def helloworld(s:$name;format="Camel,word"$) = Mermaid(
    """sequenceDiagram
      |    Alice->>+Bob: Hello world!""".stripMargin
    )
}