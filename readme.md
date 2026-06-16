# Scala Starter

Directory structure and settings for starting a new Scala project.

## Plugins & Library Dependencies
* [sbt-scalafmt](https://github.com/scalameta/sbt-scalafmt) `sbt scalafmtCheck` / `sbt scalafmtAll`
* [sbt-jib](https://github.com/sbt-jib/sbt-jib) `sbt jibDockerBuild` / `sbt jibImageBuild`
* [scalatest](https://github.com/scalatest/scalatest) `sbt test`
* [sbt-dotenv](https://github.com/Philippus/sbt-dotenv) automatically load `.env` (needs `.sbtopts`)

## Aliases
* `format` = `scalafmtAll;scalafmtSbt`
* `check` = `scalafmtCheckAll;scalafmtSbtCheck`
* `validate` = `format;clean;compile;Test/compile`
* `vtest` = `validate;test`

## Settings for a new GitHub repository
* license "The Unlicense"
* settings / general
  * automatically delete head branches
  * preserve this repository (uncheck)
* settings / pull request
  * allow squash merging
    * default commit message: pull request title
* settings / branches
  * branche protection rule for `main`
    * require a pull request before merging
    * pull request requires approval
    * require status checks to pass before merging (add `scala-build.yml` GitHub Actions workflow)
    * require branches to be up-to-date

## GitHub Actions
* workflow `scala-build.yml` automatically checks for formatting and passing of all tests
