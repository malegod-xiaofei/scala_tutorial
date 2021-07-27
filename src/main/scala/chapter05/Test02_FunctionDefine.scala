package chapter05

/**
 * @author Malegod_xiaofei
 * @create 2021-07-27-23:03
 */
object Test02_FunctionDefine {
  def main(args: Array[String]): Unit = {
    // 函数 1.无参无返回值
    def f1(): Unit = {
      println("1.无参无返回值")
    }

    f1()
    println(f1())

    // 函数 2.无参有返回值
    def f2(): Int = {
      println("2.无参有返回值")
      return 12
    }

    println(f2())

    // 函数 3.有参无返回值
    def f3(name: String): Unit = {
      println("3.有参无返回值 " + name)
    }

    println(f3("alice"))

    // 函数 4.有参有返回值
    def f4(name: String): String = {
      println("4.有参有返回值 " + name)
      return "hi " + name
    }

    println(f4("alice"))

    // 函数 5.多参无返回值
    def f5(name1: String, name2: String): Unit = {
      println("5.多参无返回值 ")
      println(s"${name1}和${name2}都是我的好朋友 ！")
    }

    println(f5("alice", "bob"))

    // 函数 6.多参有返回值
    def f6(a: Int, b: Int): Int = {
      println("6.多参有返回值")
      return a + b
    }

    println(f6(12, 37))

  }
}
