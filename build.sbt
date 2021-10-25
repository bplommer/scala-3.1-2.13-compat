scalaVersion := "2.13.6"
scalacOptions += "-Ytasty-reader"
libraryDependencies += ("co.fs2" %% "fs2-core" % "3.2.0").cross(CrossVersion.for2_13Use3)
