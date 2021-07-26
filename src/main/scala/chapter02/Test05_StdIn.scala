package chapter02

import scala.io.StdIn

/**
 * @author Malegod_xiaofei
 * @create 2021-07-20-22:29
 */
object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    // 输入信息
    println("请输入您的大名 ")
    val name: String = StdIn.readLine()
    println("请输入您的芳龄 ")
    val age: Int = StdIn.readInt()

    // 打印输出
    println(s"欢迎${age}岁的${name}来尚硅谷学习")
  }
}
