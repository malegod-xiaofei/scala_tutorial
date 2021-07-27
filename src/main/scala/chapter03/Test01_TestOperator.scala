package chapter03

/**
 * @author Malegod_xiaofei
 * @create 2021-07-26-23:25
 */
object Test01_TestOperator {
  def main(args: Array[String]): Unit = {
    // 练习 github 推拉代码
    // 1、算术运算符
    val result1 = 10 / 3
    println(result1)

    val resutlt2: Double = 10 / 3
    println(resutlt2)

    val resutlt3: Double = (10 * 1.0) / (3 * 1.0)
    println(resutlt3)
    // float和double 表示小数时会有精度缺失
    println(resutlt3.formatted("%6.2f"))
    // 前面不够补空格

    val resutlt4: Int = 10 % 3
    println(resutlt4)

    // 2、比较运算符
    val s1: String = "hello"
    val s2: String = new String("hello")

    println(s1 == s2)
    println(s1.equals(s2))
    println(s1.eq(s2))
  }
}
