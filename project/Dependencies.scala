import sbt.*

object Dependencies {
  lazy val app: Seq[ModuleID] = Seq(
    "dev.zio"                     %% "zio"            % Version.zio,
    "dev.zio"                     %% "zio-http"       % Version.zioHttp,
    "dev.zio"                     %% "zio-json"       % Version.zioJson,
    "com.softwaremill.sttp.tapir" %% "tapir-core"     % Version.tapir,
    "com.softwaremill.sttp.tapir" %% "tapir-json-zio" % Version.tapirJsonZio,
    "com.softwaremill.sttp.tapir" %% "tapir-zio"      % Version.tapirZio
  )
}
