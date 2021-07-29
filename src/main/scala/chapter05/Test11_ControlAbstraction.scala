package chapter05

/**
 * @author Malegod_xiaofei
 * @create 2021-07-29-23:47
 */
object Test11_ControlAbstraction {
  def main(args: Array[String]): Unit = {
    // 1.传值参数
    def f0(a: Int): Unit = {
      println(a)
      println(a)
    }

    f0(23)

    def f1(): Int = {
      println("f1调用")
      12
    }

    f0(f1())

    // 2.传名参数,传递的不再是具体的值，而是代码块
    def f2(a: => Int): Unit = {
      println(a)
      println(a)
    }

    f2(23)
    // a执行几次，代码块就调用几次
    // 这就叫控制抽象
    f2(f1())
    f2({
      println("这是一个代码块")
      29
    })
  }
}
