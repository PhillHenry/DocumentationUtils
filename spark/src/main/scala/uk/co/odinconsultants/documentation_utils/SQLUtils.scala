package uk.co.odinconsultants.documentation_utils

import java.lang.reflect.Field
import scala.reflect.ClassTag

object SQLUtils {
  def createDatumTable[T: ClassTag](tableName: String): String = {
    val fields: String = implicitly[ClassTag[T]].runtimeClass.getDeclaredFields
      .map { field: Field =>
        s"${field.getName} ${field.getType.getSimpleName}"
      }
      .mkString(",\n")
    s"""CREATE TABLE $tableName ($fields)""".stripMargin
  }
}
