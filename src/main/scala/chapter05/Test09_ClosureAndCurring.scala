package chapter05

/**
 * @author Malegod_xiaofei
 * @create 2021-07-29-22:50
 */
object Test09_ClosureAndCurring {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    // 1.考虑固定一个加数的场景
    def addByFour(b: Int): Int = {
      4 + b
    }

    // 2.扩展固定加数改变的情况
    def addByFive(b: Int): Int = {
      5 + b
    }

    // 3.将固定加数作为另一个参数传入，但是是作为"第一层参数传入"
    def addByFour1(): Int => Int = {
      val a = 4

      def addB(b: Int): Int = {
        a + b
      }

      addB
    }


    def addByA(a: Int): Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }

      addB
    }

    println(addByA(35)(24) + "柯里化")

    val addByFour2 = addByA(4)
    val addByFive2 = addByA(5)

    println(addByFour2(13))
    println(addByFive2(25))

    // lambde表达式简写
    def addByA1(a: Int): Int => Int = {
      (b: Int) => {
        a + b
      }
    }

    def addByA2(a: Int): Int => Int = {
      b => a + b
    }

    def addByA3(a: Int): Int => Int = a + _

    val addByFour3 = addByA3(4)
    val addByFive3 = addByA3(5)

    println(addByFour3(13))
    println(addByFive3(25))

    // 5. 柯里化
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }

    println(addCurrying(35)(24))

    println(jc(5))
  }

  def jc(a: Int): Int = {
    if (a == 1) {
      return 1
    } else {
      return jc(a - 1) * a
    }
  }
}
