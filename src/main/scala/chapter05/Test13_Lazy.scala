package chapter05

/**
 * @author Malegod_xiaofei
 * @create 2021-08-01-17:01
 */
object Test13_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(13, 47)
    println("1. 函数调用")
    println("2. result" + result)
    println("4. result" + result)

  }

  def sum(a: Int, b: Int): Int = {
    println("3.sum调用")
    a + b
  }
}
