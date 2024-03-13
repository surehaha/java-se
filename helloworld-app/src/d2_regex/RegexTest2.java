package d2_regex;

public class RegexTest2 {
    public static void main(String[] args) {
        //1.public String replaceAll(String regex,String newStr):按照正则表达式内容进行替换
        //需求1：把古力娜扎skjdfb324迪丽热巴aksudg234马儿扎哈ksaufbdk324的非中文字符替换成-
        String s1="古力娜扎skjdfb324迪丽热巴aksudg234马儿扎哈ksaufbdk324卡尔扎哈";
        System.out.println(s1.replaceAll("\\w+", "-"));

        //需求2：把"我我我喜喜喜喜欢编编编编编编编编编程程程程"优化成我喜欢编程
        String s2="我我我喜喜喜喜欢编编编编编编编编编程程程程";
         /*
         (.)一组：.匹配任意字符的
         \\1:为这个组声明一个组号为：1号
         +:声明必须是重复数字
         $1可以去掉第一组代表的那个重复的数字
         */
        System.out.println(s2.replaceAll("(.)\\1+", "$1"));



    }
}
