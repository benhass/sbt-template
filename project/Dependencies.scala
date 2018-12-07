import sbt._

object Dependencies {
  object Versions {
    val akka = "2.5.13"
    val apacheCommonsValidator = "1.6"
    val finatra = "18.6.0"
    val geoip2 = "2.12.0"
    val guice = "4.0"
    val jackson = "2.8.4"
    val jsoup = "1.10.2"
    val junit = "4.12"
    val krinagle = "1.0.11"
    val messageCache = "0.2.2"
    val mockito = "1.10.19"
    val shapeless = "2.3.3"
    val silencer = "1.2.1"
    val slickless = "0.3.3"
    val swagger = "1.5.21"
  }

  val akka = Seq(
    "com.typesafe.akka" %% "akka-testkit" % Versions.akka % "test"
  )

  val cats = Seq(
    "org.typelevel" %% "cats" % "0.8.1"
  )

  val finatra = Seq(
    "com.twitter" %% "finatra-http"    % Versions.finatra % "test",
    "com.twitter" %% "finatra-http"    % Versions.finatra % "test" classifier "tests",
    "com.twitter" %% "finatra-jackson" % Versions.finatra % "test",
    "com.twitter" %% "finatra-jackson" % Versions.finatra % "test" classifier "tests",
    "com.twitter" %% "inject-server"   % Versions.finatra % "test",
    "com.twitter" %% "inject-server"   % Versions.finatra % "test" classifier "tests",
    "com.twitter" %% "inject-app"      % Versions.finatra % "test",
    "com.twitter" %% "inject-app"      % Versions.finatra % "test" classifier "tests",
    "com.twitter" %% "inject-core"     % Versions.finatra % "test",
    "com.twitter" %% "inject-core"     % Versions.finatra % "test" classifier "tests",
    "com.twitter" %% "inject-modules"  % Versions.finatra % "test",
    "com.twitter" %% "inject-modules"  % Versions.finatra % "test" classifier "tests"
  )

  val geoip2 = Seq(
    "com.maxmind.geoip2" % "geoip2" % Versions.geoip2
  )

  val guice = Seq(
    "com.google.inject.extensions" % "guice-testlib" % Versions.guice % "test"
  )

  val jackson = Seq(
    "com.fasterxml.jackson.core"     %  "jackson-annotations"             % Versions.jackson,
    "com.fasterxml.jackson.core"     %  "jackson-core"                    % Versions.jackson,
    "com.fasterxml.jackson.core"     %  "jackson-databind"                % Versions.jackson,
    "com.fasterxml.jackson.datatype" %  "jackson-datatype-jsr310"         % Versions.jackson,
    "com.fasterxml.jackson.module"   %  "jackson-module-jaxb-annotations" % Versions.jackson,
    "com.fasterxml.jackson.module"   %% "jackson-module-scala"            % Versions.jackson
  )

  val jsoup = Seq(
    "org.jsoup" % "jsoup" % Versions.jsoup
  )

  val junit = Seq(
    "junit" % "junit" % Versions.junit % "test"
  )
  
  val mockito = Seq(
    "org.mockito" % "mockito-core" % Versions.mockito % "test"
  )

  val shapeless = Seq(
    "com.chuusai" %% "shapeless" % Versions.shapeless
  )

  val slickless = Seq(
    "io.underscore" %% "slickless" % Versions.slickless
  )

  val silencer = Seq(
    compilerPlugin("com.github.ghik" %% "silencer-plugin" % Versions.silencer),
    "com.github.ghik" %% "silencer-lib" % Versions.silencer % Provided
  )

  val swagger = Seq(
    "io.swagger" % "swagger-core"  % Versions.swagger,
    "io.swagger" % "swagger-jaxrs" % Versions.swagger
  )

  val zenMockito = Seq(
    "org.mockito" % "mockito-core" % Versions.mockito % "test"
  )
}
