package net.hifor.demo.basic06;

/**
 * @author IKin <br/>
 * @description 变量 <br/>
 * @create 2024/2/14 20:57 <br/>
 */
public class Variables {
    // 类变量（静态变量）
    static int classVariable = 10;

    // 成员变量
    int instanceVariable = 20;

    public static void main(String[] args) {
        // 局部变量
        int localVar = 30;

        // 使用类变量
        System.out.println("Class Variable: " + classVariable);

        // 创建类的实例
        Variables obj = new Variables();

        // 使用成员变量
        System.out.println("Instance Variable: " + obj.instanceVariable);

        // 使用局部变量
        System.out.println("Local Variable: " + localVar);

        // 修改类变量的值
        classVariable = 50;

        // 修改成员变量的值
        obj.instanceVariable = 40;

        // 再次使用变量
        System.out.println("Modified Class Variable: " + classVariable);
        System.out.println("Modified Instance Variable: " + obj.instanceVariable);
    }
}
