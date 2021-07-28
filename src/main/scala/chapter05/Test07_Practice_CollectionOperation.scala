package chapter05

/**
 * @author Malegod_xiaofei
 * @create 2021-07-28-23:12
 */
object Test07_Practice_CollectionOperation {
  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(12, 45, 75, 98)

    // 对数组进行处理，将操作抽象出来，处理完毕之后的结果返回一个新的数组
    def arrayOperation(array: Array[Int], op: Int => Int): Array[Int] = {
      // yield 操作是生成新的数组
      for (elem <- array) yield op(elem)
    }

    // 定义一个加一操作
    def addOne(elem: Int): Int = {
      elem + 1
    }

    // 调用函数
    val newArray: Array[Int] = arrayOperation(arr, addOne _)

    // mkString 方法就是将当前数组中的元素按照指定的符号分隔开
    println(newArray.mkString(","))

    // 传入匿名函数实现数组中的元素翻倍
    val newArray2 = arrayOperation(arr, _ * 2)
    println(newArray2.mkString(","))

  }
}
