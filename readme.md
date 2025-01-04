# Scala Starter

Directory structure and settings for starting a new Scala project.

## Plugins & Library Dependencies
* [sbt-scalafmt](https://github.com/scalameta/sbt-scalafmt) `sbt scalafmtCheck` / `sbt scalafmtAll`
* [sbt-jib](https://github.com/sbt-jib/sbt-jib) `sbt jibDockerBuild` / `sbt jibImageBuild`
* [scalatest](https://github.com/scalatest/scalatest) `sbt test`

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
  * allow auto-merge (for `auto-approve-merge` GitHub Actions workflow)
* settings / pull request
  * allow squash merging
    * default commit message: pull request title
* settings / branches
  * branche protection rule for `main`
    * require a pull request before merging
    * pull request requires approval
    * require status checks to pass before merging (add `scala-build.yml` GitHub Actions workflow)
    * require branches to be up-to-date
* settings / actions / general
  * allow gitHub actions to create and approve pull requests (for `auto-approve-merge` GitHub Actions workflow)

## GitHub Actions
* workflow `scala-build.yml` automatically checks for formatting and passing of all tests
* workflow `auto-approve-merge.yml` automatically approves and merges PRs labeled `auto-approve-merge`
