package net.hifor.demo.basic05.pg2;


import net.hifor.demo.basic05.pg1.DefaultMethod;

/**
 * @author IKin <br/>
 * @description <br/>
 * @create 2024/1/18 22:32 <br/>
 */
public class DefaultExtend extends DefaultMethod {
    void accessParentMethod() {
        // 无法访问default修饰的父类方法
        // display();
    }
}
