package chapter05

/**
 * @author Malegod_xiaofei
 * @create 2021-07-28-23:27
 */
object Test08_Practice {
  def main(args: Array[String]): Unit = {
    // 练习1:定义一个匿名函数，并将它作为值赋给变量fun。函数有三个参数，类型分别
    // 为Int，String，Char，返回值类型为Boolean。
    // 要求调用函数fun(o,"",0')得到返回值为false，其它情况均返回true。

    val fun = (i: Int, s: String, c: Char) => {
      if (i == 0 && s == "" && c == '0') false else true
    }

    println(fun(0, "", '0'))
    println(fun(0, "", '1'))
    println(fun(23, "", '0'))
    println(fun(0, "hello", '0'))

    // 练习2:

    def func(i: Int): String => (Char => Boolean) = {
      def f1(s: String): Char => Boolean = {

        def f2(c: Char): Boolean = {
          if (i == 0 && s == "" && c == '0') false else true
        }

        f2
      }

      f1
    }

    println(func(0)("")('0'))
    println(func(1)("")('0'))
    println(func(0)("1")('0'))
    println(func(0)("")('1'))

    // 匿名函数简写
    def func1(i: Int): String => (Char => Boolean) = {
      s => c => if (i == 0 && s == "" && c == '0') false else true
    }

    println(func1(0)("")('0'))
    println(func1(1)("")('0'))
    println(func1(0)("1")('0'))
    println(func1(0)("")('1'))

    // 柯里化
    def func2(i: Int)(s: String)(c: Char): Boolean = {
      if (i == 0 && s == "" && c == '0') false else true
    }

    println(func2(0)("")('0'))
    println(func2(1)("")('0'))
    println(func2(0)("1")('0'))
    println(func2(0)("")('1'))


  }
}
