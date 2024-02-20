package net.hifor.demo.basic08;

/**
 * @author IKin <br/>
 * @description 数学函数 <br/>
 * @create 2024/2/17 09:40 <br/>
 */
public class MathSample {
    public static void main(String[] args) {
        double num1 = 25.5;
        double num2 = 10.0;

        // 绝对值
        double absValue = Math.abs(-10.5);
        System.out.println("Absolute value of -10.5: " + absValue);

        // 向上取整
        double ceilValue = Math.ceil(num1);
        System.out.println("Ceiling of 25.5: " + ceilValue);

        // 向下取整
        double floorValue = Math.floor(num1);
        System.out.println("Floor of 25.5: " + floorValue);

        // 幂运算
        double powerValue = Math.pow(num1, 2);
        System.out.println("25.5 raised to the power of 2: " + powerValue);

        // 平方根
        double sqrtValue = Math.sqrt(num1);
        System.out.println("Square root of 25.5: " + sqrtValue);

        // 最大值
        double maxValue = Math.max(num1, num2);
        System.out.println("Maximum of 25.5 and 10.0: " + maxValue);

        // 最小值
        double minValue = Math.min(num1, num2);
        System.out.println("Minimum of 25.5 and 10.0: " + minValue);

        // 四舍五入
        long roundedValue = Math.round(num1);
        System.out.println("Rounded value of 25.5: " + roundedValue);

        // 随机数
        double randomValue = Math.random();
        System.out.println("Random value between 0 and 1: " + randomValue);


    }
}
