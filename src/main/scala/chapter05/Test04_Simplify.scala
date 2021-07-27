package chapter05

/**
 * 函数至简原则
 *
 * @author Malegod_xiaofei
 * @create 2021-07-27-23:34
 */
object Test04_Simplify {
  def main(args: Array[String]): Unit = {

    def f0(name: String): String = {
      return name
    }

    println(f0("atguigui"))

    // 1.return可以省略，scala会使用函数体的最后一行代码作为返回值
    def f1(name: String): String = {
      return name
    }

    println(f1("atguigu"))

    // 2.如果函数体只有一行代码，可以省略花括号
    def f2(name: String): String = name

    println(f2("atguigu"))

    // 3.返回值类型如果能够推断出来，那么可以省略（：和返回值类型一起省略）
    def f3(name: String) = name

    println(f3("atguigu"))

    // 4.如果有return ,则不能省略返回值类型，必须指定
    //    def f4(name: String) = {
    //      return name
    //    }
    //
    //    println(f4("alice"))

    // 5.如果函数明确声明unit，那么即使函数体中使用return关键字也不起作用
    def f5(name: String): Unit = {
      name
    }

    println(f5("atguigui"))

    // 6.Scala如果期望是无返回值类型，可以省略花括号
    def f6(name: String) {
      name
    }

    println(f6("atguigui"))

    // 7.如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加、
    def f7(): Unit = {
      println("atguigu")
    }

    f7()
    f7

    // 8.如果函数没有参数列表，那么小括号，可以省略，调用时小括号必须省略
    def f8: Unit = {
      println("atguigu")
    }

    f8

    // 9.如果不心名称，之关心逻辑处理，那么函数名（def）可以省略
    def f9(name: String): Unit = {
      println(name)
    }

    // 匿名函数，lambda表达式
    (name: String) => {
      println(name)
    }
  }
}
