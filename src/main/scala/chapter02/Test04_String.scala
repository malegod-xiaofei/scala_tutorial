package chapter02

/**
 * @author Malegod_xiaofei
 * @create 2021-07-20-22:06
 */
object Test04_String {
  def main(args: Array[String]): Unit = {
    // 1.字符串，通过+连接
    val name: String = "alice"
    val age: Int = 18
    println(age + " 岁的 " + name + "在尚硅谷学习")

    // * 用于将一个字符串复制多次拼接
    println(name * 3)

    // 2.printf用法:字符串，通过%传值。
    printf("%d 岁的 %s 在尚硅谷学习", age, name)
    println()

    // 3.字符串模板（插值字符串）：通过$获取变量值
    println(s"${age}岁的${name}在尚硅谷学习")

    val num: Double = 2.3456
    println(f"The number is ${num}%9.9f") // 格式化模板字符串
    println(raw"The number is ${num}%9.9f")

    //  三引号表示字符串，保持多行字符串的原格式输出
    println(
      s"""
         |select
         |*
         |from
         |Student
         |where
         |name = ${name}
         |and
         |age >= ${age}
         |""".stripMargin)
  }
}
