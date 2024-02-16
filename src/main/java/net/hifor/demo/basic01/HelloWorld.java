// 定义该类所在的包路径
package net.hifor.demo.basic01;

/**
 * @author IKin <br/>
 * @description 一个简单的Java应用程序 <br/>
 * @create 2024/2/7 16:09 <br/>
 *
 *    public class HelloWorld
 *    以上这一行定义了一个名为 HelloWorld 的类。在Java中，每个程序都必须包含至少一个类，并且类名必须与文件名相匹配。
 *    类名:HelloWorld  =>  文件名:HelloWorld.java
 *    public       :  访问修饰符
 *    class        :  定义类的关键字
 *    HelloWorld   :  标识符 类的名称，大写字母开头，驼峰命名法，可自定义
 *    {}           :  代码块
 *
 *    Java编译指令：
 *      [路径/javac.exe] -encoding [编码] -d [编译后生成的xxx.class文件保存根路径] [路径/xxx.java]
 *      D:\JDK11\bin\javac.exe -encoding UTF-8 -d D:\hi-java-basic\out\production\hi-java-basic D:\hi-java-basic\src\main\java\net\hifor\demo\basic01\HelloWorld.java
 *    Java运行指令：
 *      [路径/java.exe] -classpath [class文件根路径] [包名.xxx]
 *      D:\JDK11\bin\java.exe -classpath D:\hi-java-basic\out\production\hi-java-basic net.hifor.demo.basic01.HelloWorld
 */
public class HelloWorld {

    /**
     * 这是一个Java程序入口的标准写法【不可自定义】
     * 当运行一个Java程序时，首先执行的就是main方法
     * @param args
     *
     *     public    :  访问修饰符   :  公共
     *     static    :  关键字      :  静态
     *     void      :  返回类型    :  无返回值
     *     main      :  标识符      :  方法名称，main为程序主入口
     *     ()        :  包含参数
     *     String[]  :  参数类型    :  字符串数组类型
     *     args      :  参数名称    :  用于接收命令行参数
     */
    public static void main(String[] args) {
        // 在控制台输出指定的字符串: Hello World!
        System.out.println("Hello World!");
    }
}
