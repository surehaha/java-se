package d2_regex;

public class RegexTest1 {
    public static void main(String[] args) {
        System.out.println(checkQQ(null));
        System.out.println(checkQQ("1654646456"));
        System.out.println(checkQQ("165646sdf"));

        System.out.println("-----------------------");
        System.out.println(checkQQ1(null));
        System.out.println(checkQQ1("1654646456"));
        System.out.println(checkQQ1("165646sdf"));

    }

    //正则表达式方法
    public static boolean checkQQ1(String qq){
        return qq!=null&&qq.matches("[1-9]\\d{5,19}");//表示第一位是1-9的数字，剩下5到19位都是数字，d表示数字
    }

    //普通方法
    public static boolean checkQQ(String qq){
        //1判断qq号码是否为null
        if(qq==null||qq.startsWith("0")||qq.length()<6||qq.length()>20){
            return false;
        }
        //2qq至少不是null，不以0开头，满足6-20的长度
        //判断qq号码是否都是数字
        //qq=4554qqq
        for (int i = 0; i < qq.length(); i++) {
            //根据索引提取当前位置处的字符
            char ch=qq.charAt(i);
            //判断ch记住的字符，如果不是数字，qq号码不合法
            if(ch<'0'||ch>'9'){
                return false;
            }
        }
        //3.说明qq号码肯定合法
        return true;
    }
}
