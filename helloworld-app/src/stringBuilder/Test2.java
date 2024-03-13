package stringBuilder;

public class Test2 {
    public static void main(String[] args) {
        //拼接一百万次abc
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i <1000000 ; i++) {
            sb.append("abc");
        }
        System.out.println(sb);
    }
}
