package net.hifor.demo.basic05.pg1;

/**
 * @author IKin <br/>
 * @description 修饰符 <br/>
 * @create 2024/1/18 22:13 <br/>
 */
public class Index {
    public static void main(String[] args) {
        // 同一包内，可以访问default修饰符的类和方法
        DefaultClass defaultClass = new DefaultClass();
        defaultClass.display();

        // 同一包内，可以访问default修饰符的方法
        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.display();

        // 任何地方都能访问public修饰符的类和方法
        PublicClass publicClass = new PublicClass();
        publicClass.display();

        // 同一包内，可以访问protected修饰符的方法
        ProtectedClass protectedClass = new ProtectedClass();
        protectedClass.display();
    }
}
