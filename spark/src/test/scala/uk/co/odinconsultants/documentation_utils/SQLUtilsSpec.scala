package uk.co.odinconsultants.documentation_utils
import org.scalatest.wordspec.AnyWordSpec

class SQLUtilsSpec extends AnyWordSpec {

  case class TestCaseClass(x: String, y: Int)

  s"SQL generated from ${TestCaseClass.getClass.getSimpleName}" should {
    val tableName = "table_name"
    "reflect its structure" in {
      val sql = SQLUtils.createDatumTable(tableName)
    }
  }

}
