name := "cheats"

version := "dev"

scalaVersion := "3.0.2"
scalaBinaryVersion := "3"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.2.9" % Test)

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.9"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"

Compile / classLoaderLayeringStrategy := ClassLoaderLayeringStrategy.Flat

Test / testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/report")
