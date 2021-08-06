package chapter06

import scala.beans.BeanProperty

/**
 * @author Malegod_xiaofei
 * @create 2021-08-06-22:48
 */
object Test03_Class {
  def main(args: Array[String]): Unit = {

    // 创建一个对象
    val student = new Student()
    //    student.name  // error,不能访问private属性
    println(student.sex)
    println(student.age)
    student.sex = "female"
    println(student.sex)
  }
}

// 定义一个类
class Student {
  // 定义属性
  private val name: String = "alice"
  @BeanProperty
  var age: Int = _
  var sex: String = _
}