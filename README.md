# A [Giter8][g8] template for a new [CAOS][caos] project

**CAOS** is a framework to support **c**omputer **a**ided design of 
structural **o**perational **s**emantics for formal models. 
You can read more about it [here][caos].

**Giter8** is a command line tool to generate files and directories 
from templates published on GitHub or any other git repository, and 
it is integrated with [sbt](https://www.scala-sbt.org).

## Requirements

* Scala building tools ([sbt](https://www.scala-sbt.org))
* Java Runtime Environment ([JRE](https://www.java.com/en/download/))
* Java Development Kit (we recommend [OpenJDK 11](https://openjdk.java.net/projects/jdk/11/))
## Usage

* **Create** a new project with a CAOS template:

```shell
> sbt new arcalab/caos.g8
```
* This will prompt a few questions [with default answers], 
**customise** as desired:

```shell
A Giter8 template for a CAOS project 

name [CAOS Instance]: 
organization [com.organization]: 
package [com.organization]: 
caos_path [lib/caos]: 
tool_path [site]: 
sbt_version [1.5.2]: 
scala_version [2.13.5]:
```
* If everything went well you will see a message similar to the following: 

```shell 
Template applied in ./<name>
```
* **Initiliase** CAOS, by adding a new sbt submodule same `caos_path` specified above:

```shell
git submodule add https://github.com/arcalab/CAOS.git <caos_path>
```
[g8]: http://www.foundweekends.org/giter8/
[caos]: https://github.com/arcalab/caos