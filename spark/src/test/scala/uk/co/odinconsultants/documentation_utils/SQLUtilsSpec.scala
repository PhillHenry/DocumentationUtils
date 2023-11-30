package uk.co.odinconsultants.documentation_utils
import org.scalatest.matchers.should.Matchers._
import org.scalatest.wordspec.AnyWordSpec

case class TestCaseClass(x: String, y: Int)

class SQLUtilsSpec extends AnyWordSpec {


  s"SQL generated from ${TestCaseClass.getClass.getSimpleName}" should {
    val tableName = "table_name"
    "reflect its structure" in {
      val sql = SQLUtils.createDatumTable(tableName, classOf[TestCaseClass])
      sql.replace("\n", "") shouldEqual (s"CREATE TABLE $tableName (x String, y int)")
    }
  }

}
