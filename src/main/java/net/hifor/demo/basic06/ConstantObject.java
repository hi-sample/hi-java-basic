package net.hifor.demo.basic06;

/**
 * @author IKin <br/>
 * @description 常量对象 <br/>
 * 常量对象保存的是对象实例的内存地址，也就是该常量指向的内存地址不可变
 * @create 2024/2/15 16:18 <br/>
 */
public class ConstantObject {
    // 定义常量对象
    private static final Person DEFAULT_PERSON = new Person("John", 30);

    public static void main(String[] args) {
        // 使用常量对象
        System.out.println("Default Person: " + DEFAULT_PERSON);

        // 尝试修改常量对象的引用
        // 编译错误：Cannot assign a value to final variable 'DEFAULT_PERSON'
        // DEFAULT_PERSON = new Person("Alice", 25);

        // 可以修改常量对象的状态
        // 为了确保状态不可变，Person类可以不提供公共的setter方法，避免作为常量对象被修改状态
        DEFAULT_PERSON.setName("Alice");
        System.out.println("Modified Default Person: " + DEFAULT_PERSON);
    }
}

// 定义一个简单的Person类
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 为了确保状态不可变，可以不提供公共的setter方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
