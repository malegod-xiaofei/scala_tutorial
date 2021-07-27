package chapter05

/**
 * @author Malegod_xiaofei
 * @create 2021-07-27-22:53
 */
object Test01_FunctionAndMethod {
  def main(args: Array[String]): Unit = {
    // 定义函数
    // 定义在里边叫函数
    def sayHi(name: String): Unit = {
      println("hi,  " + name)
    }

    // 调用该函数
    sayHi("alice")

    // 调用对象方法
    Test01_FunctionAndMethod.sayHi("bob")

    // 获取方法返回值
    val result = Test01_FunctionAndMethod.sayHello("cary")
    println(result)
  }

  // 定义在外边叫方法
  // 定义对象的方法
  // 两个函数调用临近的
  def sayHi(name: String): Unit = {
    println("Hi,  " + name)
  }

  def sayHello(name: String): String = {
    println("Hi,  " + name)
    return "hello"
  }
}
