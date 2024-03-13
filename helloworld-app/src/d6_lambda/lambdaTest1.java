package d6_lambda;

public class lambdaTest1 {
    public static void main(String[] args) {
        //认识lambda表达式
        //只能简化函数时接口的匿名内部类
       /* Swimming s=new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生快乐的游泳---");
            }02
        };
0                        s.swim();*/
       Swimming s=()-> {
                System.out.println("学生快乐的游泳---");
        };
        s.swim();
    }
}

interface Swimming{
    void swim();
}