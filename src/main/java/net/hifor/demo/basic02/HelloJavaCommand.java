package net.hifor.demo.basic02;

/**
 * @author IKin <br/>
 * @description Java运行指令传参 <br/>
 * @create 2024/2/7 16:48 <br/>
 *
 *   命令行运行java指令并传参：
 *   java net.hifor.demo.basic02.HelloJavaCommand abc 123
 *   java -classpath d:\xxx\hi-java-basic net.hifor.demo.basic02.HelloJavaCommand abc 123
 *   注：d:\xxx\hi-java-basic 这个是本项目编译后的类根路径
 */
public class HelloJavaCommand {

    public static void main(String[] args) {
        // 详见数组遍历说明
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
