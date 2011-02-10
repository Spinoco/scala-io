import sbt._

import java.net.URL

class Plugins(info: ProjectInfo) extends PluginDefinition(info)
{
	val posterous = "net.databinder" % "posterous-sbt" % "0.1.4"
	val technically = Resolver.url("technically.us", new URL("http://databinder.net/repo/"))(Resolver.ivyStylePatterns)
}