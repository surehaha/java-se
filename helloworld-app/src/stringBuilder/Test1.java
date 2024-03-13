package stringBuilder;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("kunkun");

        //拼接内容
        s.append(12);
        s.append("困困");
        s.append(true);

        //支持链式编程
        s.append(666).append("坤坤2").append(666);
        System.out.println(s);

        s.reverse();
        System.out.println(s);

        //返回字符串长度
        System.out.println(s.length());

        //StringBuilder对象转换成String类型
        String rs=s.toString();
        System.out.println(rs);
    }
}
