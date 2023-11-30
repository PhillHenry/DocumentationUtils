package uk.co.odinconsultants.documentation_utils

import java.lang.reflect.Field


object SQLUtils {
  def createTableSQL(tableName: String, clazz: Class[_]): String = {
    val fields    : Array[Field] = clazz.getDeclaredFields
    val fieldTypes: String       = fields
      .map { field: Field =>
        s"${field.getName} ${field.getType.getSimpleName}"
      }
      .mkString(",\n ")
    s"""CREATE TABLE $tableName ($fieldTypes)""".stripMargin
  }
}
