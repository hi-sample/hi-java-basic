package net.hifor.demo.basic05.pg2;

import net.hifor.demo.basic05.pg1.DefaultMethod;
import net.hifor.demo.basic05.pg1.ProtectedClass;
import net.hifor.demo.basic05.pg1.PublicClass;
import net.hifor.demo.basic06.Variables;

/**
 * @author IKin <br/>
 * @description <br/>
 * @create 2024/1/18 22:15 <br/>
 */
public class Index {
    public static void main(String[] args) {
        // 不同包，无法访问default修饰符的类和方法，以下代码取消注释会报错
        // DefaultClass defaultClass = new DefaultClass();
        // defaultClass.display();

        // 不同包，可以访问public类，无法访问default修饰符的方法
        DefaultMethod defaultMethod = new DefaultMethod();
        // 以下代码取消注释会报错
        // defaultMethod.display();

        // 任何地方都能访问public修饰符的类和方法
        PublicClass publicClass = new PublicClass();
        publicClass.display();

        // 不同包，无法访问protected修饰符的方法
        ProtectedClass protectedClass = new ProtectedClass();
        // 以下代码取消注释会报错
        // protectedClass.display();

        // 不同包，子类可以访问protected修饰符的父类方法
        ProtectedExtend protectedExtend = new ProtectedExtend();
        protectedExtend.accessParentMethod();
    }
}
