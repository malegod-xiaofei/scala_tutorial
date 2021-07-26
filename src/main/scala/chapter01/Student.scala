package chapter01

/**
 * @author Malegod_xiaofei
 * @create 2021-07-18-14:37
 */
class Student(name: String, var age: Int) {
  def printInfo(): Unit = {
    println(name + "  " + age + "  " + Student.school)
  }
}

// 引入伴生对象,伴生对象全局只有一份
object Student {
  val school: String = "atguigu"

  def main(args: Array[String]): Unit = {
    val alics = new Student("alics", 20)
    val bob = new Student("bob", 23)

    alics.printInfo()
    bob.printInfo()
  }
}
