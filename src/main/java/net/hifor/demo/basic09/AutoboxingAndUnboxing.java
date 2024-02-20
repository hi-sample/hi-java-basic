package net.hifor.demo.basic09;

import java.util.ArrayList;
import java.util.List;

/**
 * @author IKin <br/>
 * @description 装箱拆箱 <br/>
 * @create 2024/2/17 10:42 <br/>
 */
public class AutoboxingAndUnboxing {

    /**
     * 自动装箱：直接将一个原始数据类型传给其相应的包装器类型(wrapper class)，编译器会自动转换成对应的包装器类型，这就是自动装箱(Autoboxing)。
     * 拆箱：将一个包装器类型的对象赋值给其相应的原始数据类型变量，编译器会自动转换成对应的原始数据类型，则称为拆箱(Unboxing)。
     *
     * @param args
     */
    public static void main(String[] args) {
        boxing();
        System.out.println("\n================================================\n");
        attention();
    }

    /**
     * 自动装箱和拆箱 常见场景
     */
    private static void boxing() {
        // 1. 赋值操作：原始数据类型与对应包装器类型之间的相互赋值操作 = ，会自动装箱(拆箱)
        // 自动装箱 Autoboxing
        // Xxx.valueOf(xxx i)
        // 100是int, 编译器会转成 Integer.valueOf(int i) 进行自动装箱
        Integer a = 100;
        Integer b = Integer.valueOf(100);
        System.out.println("a == b  ::  " + (a == b));
        // 自动拆箱 Unboxing
        // Xxx..xxxValue()
        // 编译器会转成 a.intValue() 进行拆箱
        int j = a;
        int k = a.intValue();
        System.out.println("a == j  ::  " + (a == j));
        System.out.println("a == k  ::  " + (a == k));

        // 2. 运算符自动拆箱
        // + - * / %
        // >> << >>> & | ~ ^
        int intVar = 32;
        Integer integerVar = 32;
        System.out.println("原始数据类型 int： " + intVar);
        System.out.println("包装器类型 Integer： " + integerVar);
        System.out.println("自动拆箱后相加： " + (integerVar + intVar));
        System.out.println("自动拆箱后相减： " + (integerVar - intVar));
        System.out.println("自动拆箱后相乘： " + (integerVar * intVar));
        System.out.println("自动拆箱后相除： " + (integerVar / intVar));
        System.out.println("自动拆箱后求余： " + (integerVar % intVar));
        System.out.println("两个包装器自动拆箱后相加： " + (integerVar + integerVar));

        // 3. 比较运算符自动拆箱 > >= < <=
        //    三元运算符自动拆箱 ?:
        // 对于 == ，如果都是包装器类型，则都是对象引用地址的比较，而> >= < <=则始终要拆箱。
        Integer integer = 32;
        System.out.println("引用地址比较,不拆箱：" + (integerVar == integer));
        // 混合类型比较，自动拆箱
        Long longVar = 32L;
        System.out.println("混合类型比较，自动拆箱：" + (longVar == intVar));

        // 4. equals比较自动装箱
        System.out.println("equals比较，自动装箱：" + (integerVar.equals(32)));

        // 5. 集合类自动装箱
        List<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println("放入集合类，自动装箱：" + list.get(0));
    }

    /**
     * 注意事项
     */
    public static void attention() {
        Integer a = 100;
        Integer b = 100;
        // 1. 数值类型包装器缓存: Byte、Character、Short、Integer、Long
        // 自动装箱 Integer.valueOf(a) 源码：
        // public static Integer valueOf(int i) {
        //        if (i >= IntegerCache.low && i <= IntegerCache.high)
        //            return IntegerCache.cache[i + (-IntegerCache.low)];
        //        return new Integer(i);
        //    }
        // Integer 本身的 IntegerCache 默认缓存了 [-128 ~ 127] 对应的包装器对象,
        // 只要对应的 int 值最终落在[-128 ~ 127]，则返回的都是已经缓存的包装器对象。
        // a,b 都是赋值 100，自动装箱使用的是相同缓存对象, a == b 比较的引用地址自然也就一样
        System.out.println("a == b  ::  " + (a == b));

        // 2. == equals比较的不同
        // 创建新包装器类型的对象
        Integer c = new Integer(100);
        // 引用地址比较，两个对象不同引用地址，结果为false
        System.out.println("a == c  ::  " + (a == c));
        // equals源码：
        // public boolean equals(Object obj) {
        //        if (obj instanceof Integer) {
        //            return value == ((Integer)obj).intValue();
        //        }
        //        return false;
        //    }
        //   a. 先进行类型比较
        //   b. 当类型都为Integer时，再自动拆箱比较数值：100==100
        System.out.println("a.equals(c)  ::  " + (a.equals(c)));

        // 3. 自动拆箱空指针问题
        // 将 num1 赋值为 null
        Integer num1 = null;
        // 自动装箱
        Integer num2 = 20;
        // 尝试自动拆箱 null 对象，会触发空指针异常
        int result = num1 + num2;
    }
}
