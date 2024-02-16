package net.hifor.demo.basic06;

/**
 * @author IKin <br/>
 * @description 常量 <br/>
 * @create 2024/2/15 15:59 <br/>
 */
public class Constant {
    // 静态常量
    static final int STATIC_CONSTANT = 100;

    // 成员常量
    final int INSTANCE_CONSTANT;

    public Constant() {
        // 在构造方法中初始化成员常量
        INSTANCE_CONSTANT = 200;
    }

    public void method() {
        // 局部常量
        final int LOCAL_CONSTANT = 300;

        System.out.println("Static Constant: " + STATIC_CONSTANT);
        System.out.println("Instance Constant: " + INSTANCE_CONSTANT);
        System.out.println("Local Constant: " + LOCAL_CONSTANT);
    }

    public static void main(String[] args) {
        Constant obj = new Constant();
        obj.method();
    }
}
