package $package$

import $package$.$name;format="Camel,word"$
import caos.frontend.Configurator
import caos.frontend.Configurator._

/** A configuration instance for the CAOS framework
 * 
 * Take a look at [[https://github.com/arcalab/choreo Choreo]] for inspiration
 */
object $name;format="Camel,word"$Caos extends Configurator[$name;format="Camel,word"$]:
  
  /** Tool name. */
  val name = "$name$"
  
  /** Parser for $name$. */
  val parser: String=>$name;format="Camel,word"$ = _

  /** A list of [[Example]]s to show in the tool */
  val examples = List()

  /** A list of [[Widget]]s to show in the tool */
  val widgets: Iterable[(String,Widget[$name;format="Camel,word"$])] = List()
