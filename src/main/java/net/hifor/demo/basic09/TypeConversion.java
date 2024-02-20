package net.hifor.demo.basic09;

/**
 * @author IKin <br/>
 * @description 类型转换 <br/>
 * @create 2024/2/17 10:05 <br/>
 */
public class TypeConversion {
    public static void main(String[] args) {
        // 数值类型之间的合法转换
        NumericTypeConversion();
        System.out.println("\n================================================\n");
        // 强制转换
        NumericTypeCasting();
    }

    /**
     * 数值类型的合法转换
     * 以下箭头指向的方向都可以合法转换
     *                  char
     *                   |
     *                   V
     * byte -> short -> int -> long ··> float
     *                   :       :
     *                   V       V
     *                 float -> double
     */
    private static void NumericTypeConversion(){
        // 数值类型之间的合法转换：byte -> short -> int -> long
        byte byteValue = 10;
        short shortValue = byteValue; // byte 转换为 short
        int intValue = shortValue; // short 转换为 int
        long longValue = intValue; // int 转换为 long
        System.out.println("Byte to long: " + longValue);

        // 数值类型之间的合法转换：char -> int -> double
        char charValue = 'A';
        int intValueFromChar = charValue; // char 转换为 int
        double doubleValueFromInt = intValueFromChar; // int 转换为 double
        System.out.println("Char to double: " + doubleValueFromInt);

        // 数值类型之间的合法转换：float -> double
        float floatValue = 3.14f;
        double doubleValueFromFloat = floatValue; // float 转换为 double
        System.out.println("Float to double: " + doubleValueFromFloat);

        // 可能丢失精度的转换：int ··> float
        int intValueForFloat = 123456789;
        float floatValueFromInt = intValueForFloat; // int 转换为 float
        System.out.println("Int to float: " + floatValueFromInt);

        // 可能丢失精度的转换：long ··> float
        long longValueForFloat = 1234567890123456789L;
        float floatValueFromLong = longValueForFloat; // long 转换为 float
        System.out.println("Long to float: " + floatValueFromLong);

        // 可能丢失精度的转换：long ··> double
        long longValueForDouble = 1234567890123456789L;
        double doubleValueFromLong = longValueForDouble; // long 转换为 double
        System.out.println("Long to double: " + doubleValueFromLong);
    }

    /**
     * 强制转换
     */
    private static void NumericTypeCasting(){
        // double 转换成其他六种类型
        double doubleValue = 3.14;

        // double 转换成 float
        float floatValue = (float) doubleValue;
        System.out.println("Double to float: " + floatValue);

        // double 转换成 long
        long longValue = (long) doubleValue;
        System.out.println("Double to long: " + longValue);

        // double 转换成 int
        int intValue = (int) doubleValue;
        System.out.println("Double to int: " + intValue);

        // double 转换成 short
        short shortValue = (short) doubleValue;
        System.out.println("Double to short: " + shortValue);

        // double 转换成 byte
        byte byteValue = (byte) doubleValue;
        System.out.println("Double to byte: " + byteValue);

        // double 转换成 char
        char charValue = (char) doubleValue;
        System.out.println("Double to char: " + charValue);

        // float 转换成除 double 以外的其他五种类型
        float floatValue2 = 3.14f;

        // float 转换成 long
        long longValue2 = (long) floatValue2;
        System.out.println("Float to long: " + longValue2);

        // float 转换成 int
        int intValue2 = (int) floatValue2;
        System.out.println("Float to int: " + intValue2);

        // float 转换成 short
        short shortValue2 = (short) floatValue2;
        System.out.println("Float to short: " + shortValue2);

        // float 转换成 byte
        byte byteValue2 = (byte) floatValue2;
        System.out.println("Float to byte: " + byteValue2);

        // float 转换成 char
        char charValue2 = (char) floatValue2;
        System.out.println("Float to char: " + charValue2);

        // long 转换成 int、short、byte、char
        long longValue3 = 1234567890123456789L;

        // long 转换成 int
        int intValue3 = (int) longValue3;
        System.out.println("Long to int: " + intValue3);

        // long 转换成 short
        short shortValue3 = (short) longValue3;
        System.out.println("Long to short: " + shortValue3);

        // long 转换成 byte
        byte byteValue3 = (byte) longValue3;
        System.out.println("Long to byte: " + byteValue3);

        // long 转换成 char
        char charValue3 = (char) longValue3;
        System.out.println("Long to char: " + charValue3);
    }
}
