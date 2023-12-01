package uk.co.odinconsultants.documentation_utils
import org.apache.spark.sql.SparkSession
import org.scalatest.wordspec.AnyWordSpec

class FixtureSpec extends AnyWordSpec {

  "Dates" should {
    "be equal" in new SimpleFixture {
      override val spark: SparkSession = null
      override def dataDir(tableName:  String): String = null
      override def num_rows: Int = 20000
      assert(diffHavingOrdered(data).isEmpty)
    }
  }

}
