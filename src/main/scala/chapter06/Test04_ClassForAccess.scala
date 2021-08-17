package chapter06

/**
 * @author Malegod_xiaofei
 * @create 2021-08-17-20:54
 */
object Test04_ClassForAccess {

}

// 定义一个父类
class Person {
  private var idCard: String = "1234235245134"
  protected var name: String = "Alice"
  var sex: String = "female"
  private[chapter06] var age: Int = 18

  def printInfo(): Unit = {
    println(s"Person${idCard} $name $sex $age")
  }
}