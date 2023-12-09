package uk.co.odinconsultants.documentation_utils

object TextUtils {

  def fromCamelCase(x: String): String = {
    val regex = ".+?(?:(?<=[a-z])(?=[A-Z])|(?<=[A-Z])(?=[A-Z][a-z])|$)".r
    regex.findAllIn(x).matchData.mkString(" ")
  }

}
