package net.hifor.demo.basic04.attention01;

import java.math.BigDecimal;

/**
 * @author IKin <br/>
 * @description 浮点型 <br/>
 * @create 2024/2/9 15:52 <br/>
 */
public class FloatPointType {

    /**
     * 注意： java中的浮点数转换成计算机可以识别的二进制是按照 IEEE 754 标准
     *       该标准是无法用二进制精确表示小数的，只能是近似值
     *       浮点数不适用于需要精确计算的金融相关的业务中！！！
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("3*0.1 == 0.3 : " + (3 * 0.1 == 0.3));
        System.out.println("3*0.1 : " + 3 * 0.1);
        float a = 0.1f;
        float b = 0.2f;
        float f_result = a + b;
        System.out.println("f_result:" + f_result);
        System.out.println("f_result:" + new BigDecimal(f_result));
        System.out.println("0.3f:" + new BigDecimal(0.3f));
        if (f_result == 0.3f) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println("\n================================================\n");

        double c = 0.1d;
        double d = 0.2d;
        double d_result = c + d;
        System.out.println("d_result:" + d_result);
        System.out.println("d_result:" + new BigDecimal(d_result));
        System.out.println("0.3d:" + new BigDecimal(0.3d));
        if (d_result == 0.3d) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
