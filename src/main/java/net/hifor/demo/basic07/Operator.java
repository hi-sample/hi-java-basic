package net.hifor.demo.basic07;

/**
 * @author IKin <br/>
 * @description 运算符 <br/>
 * @create 2024/2/15 16:34 <br/>
 */
public class Operator {
    public static void main(String[] args) {
        // 算术运算符
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        // 加法
        System.out.println("Addition: " + (a + b));
        // 减法
        System.out.println("Subtraction: " + (a - b));
        // 乘法
        System.out.println("Multiplication: " + (a * b));
        // 取整
        System.out.println("Division: " + (a / b));
        // 取余
        System.out.println("Modulus: " + (a % b));
        // 除法运算的注意事项
        // 输出: 2
        System.out.println("Integer Division: " + 5 / 2);
        // 输出: 2.5
        System.out.println("Double Division: " + 5 / 2.0);

        // 关系运算符
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // 位运算符
        byte x = 5, y = 3;
        // 5 二进制表示为 0000 0101
        // 3 二进制表示为 0000 0011
        // ----------------------
        //       5&3 =  0000 0001
        //       5|3 =  0000 0111
        //       5^3 =  0000 0110
        System.out.println("\nBitwise Operators:");
        // 位与运算符（&） 如果相对应位都是1，则结果为1，否则为0
        // 结果为 0000 0001，即 1
        System.out.println("Bitwise AND: " + (x & y));
        // 位或运算符（|) 如果相对应位都是 0，则结果为 0，否则为 1
        System.out.println("Bitwise OR: " + (x | y));
        // 位异或运算符（^） 如果相对应位值相同，则结果为0，否则为1
        System.out.println("Bitwise XOR: " + (x ^ y));
        // 位非运算符（~） 按位取反运算符翻转操作数的每一位，即0变成1，1变成0。注意：包括首位符号位
        // [正数] 反码、补码是其本身
        // [负数] 反码：符号位不变，原码取反，0取1，1取0 补码 = 反码 + 1
        // 第1位为符号位 0:正数 1:负数
        //             5:   0000 0101[补]
        //        ~5 取反：  1111 1010[补] = 1111 1001[反] = 1000 0110[原]  = -6
        System.out.println("Bitwise Complement of x: " + (~x));
        // 左移运算符（<<） 按位左移运算符。左操作数按位左移右操作数指定的位数。
        System.out.println("Left Shift of x by 1: " + (x << 1));
        // 右移运算符（>>） 按位右移运算符。左操作数按位右移右操作数指定的位数。
        System.out.println("Right Shift of x by 1: " + (x >> 1));
        // 无符号右移运算符（>>>） 	按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。
        int unsignedRightShift = -10 >>> 1; // 结果为 0111 1111 1111 1111 1111 1111 1111 1110，即 2147483646
        System.out.println("Unsigned Right Shift of -10 by 1: " + unsignedRightShift);

        // 逻辑运算符
        boolean p = true, q = false;
        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND: " + (p && q));
        System.out.println("Logical OR: " + (p || q));
        System.out.println("Logical NOT of p: " + (!p));

        // 赋值运算符
        int c = 10;
        System.out.println("\nAssignment Operators:");
        // 复合赋值运算符： += -= *= /= %=
        c += 5; // Equivalent to c = c + 5;
        System.out.println("c += 5: " + c);

        // 其他运算符
        System.out.println("\nOther Operators:");
        int result = (a > b) ? a : b; // Conditional (Ternary) Operator
        System.out.println("Result using Conditional Operator: " + result);
        // 自增/自减运算的注意事项
        int g = 5;
        int h = ++g; // 先自增再赋值
        System.out.println("g: " + g); // 输出: 6
        System.out.println("h: " + h); // 输出: 6
        int j = 5;
        int k = j++; // 先赋值再自增
        System.out.println("j: " + j); // 输出: 6
        System.out.println("k: " + k); // 输出: 5


        precedence();
    }

    /**
     * 运算符的优先级
     * | 运算符                                                                    | 结合性    |
     * | ------------------------------------------------------------------------ | -------- |
     * | [数组]    .    (方法调用)                                                   | 从左向右 |
     * | !    ~    ++    --    +正号    -负号    (type强转)    new                   | 从左向右 |
     * | *    /    %                                                               | 从左向右 |
     * | +加    -减                                                                | 从左向右 |
     * | <<    >>    >>>                                                          | 从左向右 |
     * | <    <=    >    >=    instanceof                                         | 从左向右 |
     * | ==    !=                                                                 | 从左向右 |
     * | &                                                                        | 从左向右 |
     * | ^                                                                        | 从左向右 |
     * | |                                                                        | 从左向右 |
     * | &&                                                                       | 从左向右 |
     * | ||                                                                       | 从左向右 |
     * | ?:                                                                       | 从右向左 |
     * | =    +=    -=    *=    /=    %=    &=    |=    ^=    <<=    >>=    >>>=  | 从右向左 |
     */
    private static void precedence() {
        // && 优先级高于 ||
        // 等价于 true || (false && false)
        // 结果为 true
        System.out.printf("true || false && false  ::  ");
        System.out.println(true || false && false);

        // 优先级： * & |
        // 等价于 (5 * 4) | (3 & 2) = 22
        /* 3 & 2 = 2
           0011   (3)
         & 0010   (2)
          ------
           0010   (2) */
        /* 20 | 2 = 22
           10100   (20)
         | 00010   (2)
          ------
           10110   (22) */
        System.out.printf("5 * 4 | 3 & 2  ::  ");
        System.out.println(5 * 4 | 3 & 2);

        // 三目运算符的结合性是从右向左
        // 等价于 5 > 0 ? (5 < 10 ? 1 : 2) : 3
        System.out.printf("5 > 0 ? 5 < 10 ? 1 : 2 : 3  ::  ");
        System.out.println(5 > 0 ? 5 < 10 ? 1 : 2 : 3);

        // 赋值运算符的结合性是从右到左
        // 等价于 i *= (j += k)
        int i = 5;
        int j = 4;
        int k = 3;
        System.out.printf("i *= j += k  ::  ");
        System.out.println(i *= j += k);
    }
}
