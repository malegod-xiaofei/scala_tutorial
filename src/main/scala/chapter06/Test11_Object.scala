package chapter06

/**
 * @author Malegod_xiaofei
 * @create 2021-08-31-20:43
 */
object Test11_Object {
  def main(args: Array[String]): Unit = {
    //    val student = new Student11("alice", 18)
    //    student.printInfo()

    val student1 = Student11.newStudent("alice", 18)
    student1.printInfo()

    val student2 = Student11.apply("bob", 20)
    student2.printInfo()

    val student3 = Student11.apply("aa", 21)
    student3.printInfo()
  }
}

// 定义类
class Student11 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student11: name = ${name}, age = ${age} , school = ${Student11.school}")
  }
}

// 伴生对象
object Student11 {
  val school: String = "atguigu"

  // 定义一个类的对象实例的创建方法
  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

  def apply(name: String, age: Int): Student11 = new Student11(name, age)
}