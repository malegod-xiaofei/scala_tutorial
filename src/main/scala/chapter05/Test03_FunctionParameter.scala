package chapter05

/**
 * @author Malegod_xiaofei
 * @create 2021-07-27-23:18
 */
object Test03_FunctionParameter {
  def main(args: Array[String]): Unit = {
    // 1.可变参数
    def f1(str: String*): Unit = {
      println(str)
    }

    f1("alice")
    f1("aaa", "bb", "c")

    // 2.如果参数列表中存在多个参数，那么可变参数一般放在最后
    def f2(str1: String, str2: String*): Unit = {
      println("str1 : " + str1 + "str2 : " + str2)
    }

    f2("alice")
    f2("aaa", "aa", "a")

    // 3.参数默认值，一般将有默认值的参数放置在参数列表的后面
    def f3(name: String = "法外狂徒张三"): Unit = {
      println("My school is " + name)
    }

    f3()

    // 4.带名参数
    def f4(name: String = "atguigu", age: Int): Unit = {
      println(s"${age}岁的${name}在尚硅谷学习")
    }

    f4("alice", 20)
    f4(age = 23, name = "bob")
    f4(age = 21)
  }
}
