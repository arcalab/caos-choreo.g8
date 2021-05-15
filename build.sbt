enablePlugins(ScriptedPlugin)

name := "CAOS Template"

test in Test := {
  val _ = (g8Test in Test).toTask("").value
}

scriptedLaunchOpts ++= Seq(
  "-Xms1024m", 
  "-Xmx1024m", 
  "-XX:ReservedCodeCacheSize=128m", 
  "-Xss2m", 
  "-Dfile.encoding=UTF-8"
)