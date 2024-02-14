package net.hifor.demo.basic05.pg1;

/**
 * @author IKin <br/>
 * @description 默认修饰符 <br/>
 * 类不写修饰符，默认default
 * 只能在同一包内访问
 * @create 2024/1/18 22:09 <br/>
 */
class DefaultClass {

    /**
     * 方法不写修饰符，默认default
     * 只能在同一包内访问
     */
    void display() {
        System.out.println("Default access");
    }
}
