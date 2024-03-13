package StringJoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        StringJoiner s=new StringJoiner(",","[","]");//间隔符,开始符，结束符
        s.add("java1");
        s.add("java2");
        s.add("java3");
        System.out.println(s);
    }
}
