/**
 * @author Malegod_xiaofei
 * @create 2021-08-25-21:44
 */
public class TestDynamicBind {
    public static void main(String[] args) {
        Worker worker = new Worker();
        System.out.println(worker.name);
        worker.hello();
        worker.hi();

        // 多态
        Person person = new Worker();
        System.out.println(person.name); // 静态绑定属性
        person.hello(); // 动态绑定方法
//        person.hi();   // error
    }
}

class Person {
    String name = "person";

    public void hello() {
        System.out.println("Hello person");
    }
}

class Worker extends Person {
    String name = "worker";

    public void hello() {
        System.out.println("hello worker");
    }

    public void hi() {
        System.out.println("hi worker");
    }
}