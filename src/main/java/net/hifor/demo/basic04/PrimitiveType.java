package net.hifor.demo.basic04;

/**
 * @author IKin <br/>
 * @description Java语言基础-8种基本数据类型 <br/>
 *              4种 整型
 *              2种 浮点型
 *              1种 Unicode编码的字符型
 *              1种 布尔型
 * @create 2024/1/12 09:16 <br/>
 */
public class PrimitiveType {
    public static void main(String[] args) {
        System.out.println("\n================================================\n");
        primitiveTypeSample();
        System.out.println("\n================================================\n");
        primitiveTypeRange();
        System.out.println("\n================================================\n");
        primitiveTypeDefault();
        System.out.println("\n================================================\n");
        primitiveTypeOverflow();
        System.out.println("\n================================================\n");
    }

    /**
     * 8种基本数据类型例子
     * 数值型：
     * 整数类型：byte,short,int,long
     * 浮点类型：float,double
     * 字符类型：char
     * 布尔类型：boolean
     */
    private static void primitiveTypeSample() {
        // 整数类型，用于表示没有小数部分的数值，允许负数
        // 8位有符号整数
        byte byteVar = 127;
        // 16位有符号整数
        short shortVar = 32767;
        // 32位有符号整数
        int intVar = 2147483647;
        // 数字加下划线用于提高可读性，java编译器会自动去除
        int int1 = 1_000_000;
        // 0b或者0B 表示二进制数
        int int2 = 0b1111_0100_0010_0100_0000;
        System.out.println("100万的两种不同写法等值: " + (int1==int2));
        // 64位有符号整数
        long longVar = 9223372036854775807L;

        // 浮点类型
        // 32位单精度浮点数
        float floatVar = 3.14f;
        // 64位双精度浮点数
        double doubleVar = 3.14159265359d;

        // 字符类型
        // 16位无符号Unicode字符
        // 两种赋值方法：码点 十进制65 = 十六进制41
        char charVar = 65;
        char charUnicodeVar = '\u0041';

        // 布尔类型
        // 表示逻辑真或假
        boolean booleanVar = true;

        // 打印各变量的值
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("charUnicodeVar: " + charUnicodeVar);
        System.out.println("booleanVar: " + booleanVar);
    }

    /**
     * 8种基本数据类型取值范围
     */
    private static void primitiveTypeRange() {
        // 打印各变量的范围
        // 8位有符号整数，范围：-128（-2^7） 到 127（2^7-1）
        System.out.println("8位有符号整数 byte: " + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE);
        // 16位有符号整数，范围：-32768（-2^15） 到 32767（2^15 - 1）
        System.out.println("16位有符号整数 short: " + Short.MIN_VALUE + " - " + Short.MAX_VALUE);
        // 32位有符号整数，范围：-2147483648（-2^31） 到 2147483647（2^31 - 1）
        System.out.println("32位有符号整数 int: " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE);
        // 64位有符号整数，范围：-9223372036854775808（-2^63） 到 9223372036854775807（2^63 -1）
        System.out.println("64位有符号整数 long: " + Long.MIN_VALUE + " - " + Long.MAX_VALUE);
        // 32位单精度浮点数，范围：-3.4028235 * (10^38) 到 3.4028235 * (10^38)
        System.out.println("32位单精度浮点数 float: " + (-Float.MAX_VALUE) + " - " + Float.MAX_VALUE);
        // 64位双精度浮点数，范围：-1.7976931348623157E308 到 1.7976931348623157E308
        System.out.println("64位双精度浮点数 double: " + (-Double.MAX_VALUE) + " - " + Double.MAX_VALUE);
        // char Unicode编码范围为：(十六进制) \u0000 - \uFFFF  0-65535
        System.out.println("char: " + (int) Character.MIN_VALUE + " - " + (int) Character.MAX_VALUE);
        // 布尔类型: 真或假
        System.out.println("boolean: " + Boolean.TRUE + " , " + Boolean.FALSE);
    }

    static byte by;
    static short sh;
    static int i;
    static long l;
    static float f;
    static double d;
    static char ch;
    static boolean bool;
    static String str;

    /**
     * 8种基本数据类型默认值
     */
    private static void primitiveTypeDefault() {
        System.out.println("byte default:" + by);
        System.out.println("short default:" + sh);
        System.out.println("int default:" + i);
        System.out.println("long default:" + l);
        System.out.println("float default:" + f);
        System.out.println("double default:" + d);
        System.out.println("char default:" + (int) ch);
        System.out.println("boolean default:" + bool);
        System.out.println("String default:" + str);
    }

    /**
     * 8种数据类型超出边界的情况
     */
    private static void primitiveTypeOverflow() {
        // 整数类型（byte、short、int、long）：
        //    超出正整数边界时，将会从最小负整数值开始循环，即发生溢出。
        //    超出负整数边界时，将会从最大正整数值开始循环，也会发生溢出。
        // byte类型
        // -128
        byte minValueByte = Byte.MIN_VALUE;
        // 溢出，变为最大值127
        byte overflowedMinByte = (byte) (minValueByte - 1);
        // 127
        byte maxValueByte = Byte.MAX_VALUE;
        // 溢出，变为最小值-128
        byte overflowedMaxByte = (byte) (maxValueByte + 1);
        System.out.println("byte overflowed Min Byte: " + Byte.MIN_VALUE + " - 1 = " + overflowedMinByte);
        System.out.println("byte overflowed Max Byte: " + Byte.MAX_VALUE + " + 1 = " + overflowedMaxByte);

        // short类型
        // -32768
        short minValueShort = Short.MIN_VALUE;
        // 溢出，变为最大值32767
        short overflowedMinShort = (short) (minValueShort - 1);
        // 32767
        short maxValueShort = Short.MAX_VALUE;
        // 溢出，变为最小值-32768
        short overflowedMaxShort = (short) (maxValueShort + 1);
        System.out.println("short overflowed Min Short: " + Short.MIN_VALUE + " - 1 = " + overflowedMinShort);
        System.out.println("short overflowed Max Short: " + Short.MAX_VALUE + " - 1 = " + overflowedMaxShort);

        // int类型
        // -2147483648
        int minValueInt = Integer.MIN_VALUE;
        // 溢出，变为最大值2147483647
        int overflowedMinInt = minValueInt - 1;
        // 2147483647
        int maxValueInt = Integer.MAX_VALUE;
        // 溢出，变为最小值-2147483648
        int overflowedMaxInt = maxValueInt + 1;
        System.out.println("int overflowed Min Int: " + Integer.MIN_VALUE + " - 1 = " + overflowedMinInt);
        System.out.println("int overflowed Max Int: " + Integer.MAX_VALUE + " - 1 = " + overflowedMaxInt);

        // long类型
        // -9223372036854775808
        long minValueLong = Long.MIN_VALUE;
        // 溢出，变为最大值9223372036854775807
        long overflowedMinLong = minValueLong - 1;
        // 9223372036854775807
        long maxValueLong = Long.MAX_VALUE;
        // 溢出，变为最小值-9223372036854775808
        long overflowedMaxLong = maxValueLong + 1;
        System.out.println("long overflowed Min Long: " + Long.MIN_VALUE + " - 1 = " + overflowedMinLong);
        System.out.println("long overflowed Max Long: " + Long.MAX_VALUE + " - 1 = " + overflowedMaxLong);


        // 浮点类型（float、double）：
        //    超出浮点类型的范围时，将发生正负无穷大（Infinity）或NaN（Not a Number）
        // float类型
        // -3.4028235E38
        float minValueFloat = -Float.MAX_VALUE;
        // 溢出，负无穷大
        float overflowedMinValueFloat = minValueFloat * 2;
        // 3.4028235E38
        float maxValueFloat = Float.MAX_VALUE;
        // 溢出，正无穷大
        float overflowedMaxValueFloat = maxValueFloat * 2;
        System.out.println("float overflowed Min Float: " + overflowedMinValueFloat);
        System.out.println("float overflowed Max Float: " + overflowedMaxValueFloat);
        //float其他特殊值
        //符合IEEE 754标准的浮点数称为规格化数
        System.out.println("float 最小正数 规格化数：" + Float.MIN_NORMAL);
        System.out.println("float 最小正数 非规格化数：" + Float.MIN_VALUE);
        System.out.println("float 正无穷大：" + Float.POSITIVE_INFINITY);
        System.out.println("float 负无穷大：" + Float.NEGATIVE_INFINITY);
        System.out.println("float Not a Number：" + Float.NaN);

        // double类型
        // -1.7976931348623157E308
        double minValueDouble = -Double.MAX_VALUE;
        // 溢出，正无穷大
        double overflowedMinValueDouble = minValueDouble * 2;
        // 1.7976931348623157E308
        double maxValueDouble = Double.MAX_VALUE;
        // 溢出，正无穷大
        double overflowedMaxValueDouble = maxValueDouble * 2;
        System.out.println("double overflowed Min Double: " + overflowedMinValueDouble);
        System.out.println("double overflowed Max Double: " + overflowedMaxValueDouble);
        //double其他特殊值
        //符合IEEE 754标准的浮点数称为规格化数
        System.out.println("double 最小正数 规格化数：" + Double.MIN_NORMAL);
        System.out.println("double 最小正数 非规格化数：" + Double.MIN_VALUE);
        System.out.println("double 正无穷大：" + Double.POSITIVE_INFINITY);
        System.out.println("double 负无穷大：" + Double.NEGATIVE_INFINITY);
        System.out.println("double Not a Number：" + Double.NaN);
    }
}
