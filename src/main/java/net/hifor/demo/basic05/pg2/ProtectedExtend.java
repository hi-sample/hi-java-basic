package net.hifor.demo.basic05.pg2;

import net.hifor.demo.basic05.pg1.ProtectedClass;

/**
 * @author IKin <br/>
 * @description protected继承 <br/>
 * @create 2024/1/18 22:40 <br/>
 */
public class ProtectedExtend extends ProtectedClass {
    public void accessParentMethod() {
        // 不同包，可以访问父类的protected方法
        display();
    }
}
