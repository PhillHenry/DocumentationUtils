package uk.co.odinconsultants.documentation_utils

import java.lang.reflect.Field


object SQLUtils {
  def createDatumTable(tableName: String, clazz: Class[_]): String = {
    println(clazz)
    val fields    : Array[Field] = clazz.getDeclaredFields
    val fieldTypes: String       = fields
      .map { field: Field =>
        s"${field.getName} ${field.getType.getSimpleName}"
      }
      .mkString(",\n ")
    s"""CREATE TABLE $tableName ($fieldTypes)""".stripMargin
  }
}
