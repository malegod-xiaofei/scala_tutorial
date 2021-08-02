// 用嵌套风格定义包
package com {

  import com.atguigu.scala.Inner

  // 在外层包中定义单例对象
  object Outer {
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println(Inner.in)
    }
  }
  package atguigu {
    package scala {

      //  内层包中定义单例对象
      object Inner {
        val in: String = "in"

        def main(args: Array[String]): Unit = {
          println(Outer.out)
          Outer.out = "outer"
          println(Outer.out)
        }
      }

    }

  }

}

// 在同一个文件中定义多个包
package aaa {
  package bbb {

    import com.atguigu.scala.Inner

    object Test01_Package {
      def main(args: Array[String]): Unit = {
        println(Inner.in)
      }
    }

  }

  // 测试同步github
  // 测试代码同步提交到github和gitee
}