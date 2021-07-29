package chapter05

import scala.annotation.tailrec

/**
 * @author Malegod_xiaofei
 * @create 2021-07-29-23:28
 */
object Test10_Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
    println(tailFact(5))
  }

  // 递归实现阶乘
  def fact(n: Int): Int = {
    if (n == 0) return 1
    fact(n - 1) * n
  }

  // 尾递归实现
  def tailFact(n: Int): Int = {
    @tailrec
    def loop(n: Int, currRes: Int): Int = {
      if (n == 0) return currRes
      loop(n - 1, currRes * n)
    }

    loop(n, 1)
  }
}
