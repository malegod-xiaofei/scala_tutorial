package chapter02

/**
 * @author Malegod_xiaofei
 * @create 2021-07-22-22:32
 */
object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {

    // 一、自动类型转换
    // 1.自动提升原则：有多种类型的数据混合运算时，系统首先自动将所有数据换成精度大的那种数据类型，然后进行计算
    val a1: Byte = 10
    val b1: Long = 24452L
    val result1: Long = a1 + b1
    val result11: Int = (a1 + b1).toInt // 强转

    // 2.把精度大的数据类型赋值给精度小的数据类型时，就会报错，反之就会进行自动类型转换
    val a2: Byte = 10
    val b2: Int = a2
    //    val c2: Byte = b2 // error

    // 3.(byte，short)和char之间不会互相自动转换
    val a3: Byte = 10
    val b3: Char = 'b'
    //    val c3: Byte = b3 // error
    val c3: Int = b3
    println(c3)

    // 4.byte，short，char他们三者可以计算，在计算时首先转换为 int类型
    val a4: Byte = 12
    val b4: Short = 25
    val c4: Char = 'c'
    val result4: Int = a4 + b4
    val result44: Int = a4 + b4 + c4
    println(result44)

    //  二、强制类型转换
    //  1.将数据由高精度转换为低精度，就需要使用到强制类型转换
    val n1: Int = -2.9.toInt
    println("n1 :" + n1)

    //  2.强转类型只针对于最近的操作数有效，往往会使用小括号提升优先级
    val n2: Int = (2.6 + 3.7).toInt
    println("n2 :" + n2)

    //   三、数值类型和String类型的转换
    //  1.数值转String
    val n: Int = 27
    val s: String = n + ""
    println(s)

    //  2.String转数值
    val m: Int = "12".toInt
    val f: Float = "12.3".toFloat
    val f2: Int = "12.3".toDouble.toInt
    println(f2)

    // 经典面试题
    val n3: Int = 130
    val b: Byte = n3.toByte
    // tobyte直接简单粗暴的截取了最后一个字节
    println(b)

    /**
     * 130: Int类型，占据4个字节，32位
     *
     * 原码 0000 0000 0000 0000 0000 0000 1000 0010
     * 补码 0000 0000 0000 0000 0000 0000 1000 0010
     *
     * 截取最后一个字节，Byte 1000 0010
     * 得到补码 1000 0010
     * 对应原码 1111 1110
     * -126
     */
  }

}
