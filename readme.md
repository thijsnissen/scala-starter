# Scala Starter

Directory structure and settings for starting a new Scala project.

## Plugins & Library Dependencies
* [sbt-scalafmt](https://github.com/scalameta/sbt-scalafmt) `sbt scalafmtCheck` / `sbt scalafmtAll`
* [sbt-updates](https://github.com/rtimush/sbt-updates) `sbt dependencyUpdates`
* [sbt-jib](https://github.com/sbt-jib/sbt-jib) `sbt jibDockerBuild` / `sbt jibImageBuild`
* [pprint](https://github.com/com-lihaoyi/PPrint) `pprint.log()` / `pprint.pprintln()`
* [scalatest](https://github.com/scalatest/scalatest) `sbt test`

## Aliases
* `format` = `scalafmtAll;scalafmtSbt`
* `check` = `scalafmtCheckAll;scalafmtSbtCheck`
* `validate` = `format;clean;compile;Test/compile`
* `vtest` = `validate;test`

## Settings for a new repository
* license "The Unlicense"
* settings / general
  * Automatically delete head branches
  * Preserve this repository (uncheck)
* settings / branches
  * branche protection rule for `main`
    * Require a pull request before merging
    * pull request requires approval
    * require status checks to pass before merging
    * require branches to be up-to-date
* settings / actions / general
  * Allow GitHub Actions to create and approve pull requests

## GitHub Actions
* Workflow `scala-build.yml` automatically checks for formatting and passing of all tests
* Workflow `auto-approve-merge.yml` automatically approves and merges PRs labeled `auto-approve-merge`
