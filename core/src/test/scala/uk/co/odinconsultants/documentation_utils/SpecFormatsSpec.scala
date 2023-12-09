package uk.co.odinconsultants.documentation_utils

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class SpecFormatsSpec extends AnyWordSpec {

  val camelCase = "GroupMetadataManager"

  s"A camel case string '$camelCase'" should {
    "be turned into space delimited words" in new SpecFormats {
      fromCamelCase(camelCase) shouldEqual "Group Metadata Manager"
      //"Group", "Metadata", "Manager"
    }
  }

}
