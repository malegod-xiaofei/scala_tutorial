package chapter06

/**
 * @author Malegod_xiaofei
 * @create 2021-08-31-20:34
 */
object Test10_AnnoymousClass {
  def main(args: Array[String]): Unit = {
    val person: Person10 = new Person10 {
      override var name: String = "alice"

      override def eat(): Unit = println("person eat ")
    }

    println(person.name)
    person.eat()
  }


}

// 定义抽象类
abstract class Person10 {
  var name: String

  def eat(): Unit
}
