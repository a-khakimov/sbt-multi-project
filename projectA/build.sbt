name := "ProjectA"
version := "0.1"
scalaVersion := "2.12.12" // Версия Scala для ProjectA

libraryDependencies += "org.typelevel" %% "cats-effect" % "2.5.3"

lazy val projectA = (project in file("."))
  .aggregate(subModuleSrc)
  .dependsOn(subModuleSrc)


lazy val subModuleSrc =
  project.in(file("subModule"))
    .settings(
      version := "0.1",
      name := "subModule"
    )