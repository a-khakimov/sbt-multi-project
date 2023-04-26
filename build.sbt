lazy val root = (project in file("."))
  .aggregate(projectA, projectB) // Определение основного проекта и его подпроектов

lazy val projectA = (project in file("projectA"))

lazy val projectB = (project in file("projectB"))
