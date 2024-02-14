package net.hifor.demo.basic04.attention02;

/**
 * @author IKin <br/>
 * @description Unicode编码 <br/>
 * Java的Char类型设计的时候使用的是UTF-16，只能表示65536个字符
 *   Unicode标准：
 *     1. 目前全球语言字符的Unicode编码已经超过了65536个
 *     2. 码点采用十六进制，并加上前缀u  (码点 code point: Unicode编码表中某个字符对应的代码值，兼容Ascii码)
 * @create 2024/2/9 16:26 <br/>
 */
public class Unicode {
    /**
     * 以下代码去掉注释后是可以使用java命令正常编译运行的，但在idea中会报错
     * Unicode编码 \u005B 对应字符 [
     * Unicode编码 \u005D 对应字符 ]
     */
    /*public static void main(String\u005B\u005D args) {
        System.out.println("Hello Char");
        System.out.println("char u005B: \u005B");
        System.out.println("char u005D: \u005D");
    }*/

    /**
     * 以下方法中的两行注释都会触发Unicode转义
     *     1. u000a是换行,后面的注释内容会被当成常规代码进行解析，也就是会报错
     *     2. c:\\users 字母u前面如果只有单斜杠，不再加个斜杠进行转义，会被当成Unicode转义，但后面的"sers"不符合4位十六进制，也就会报错
     */
    /*private static void unicodeCodeComments(){
        // \u000a is a newline
        // user path c:\\users
    }*/
}
