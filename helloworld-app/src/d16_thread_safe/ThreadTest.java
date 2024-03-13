package d16_thread_safe;
//模拟线程安全问题,用Lock锁来解决
public class ThreadTest {
    public static void main(String[] args) {
        //1.创建一个账户对象，代表两个人的共享哦啊账户
        Account acc=new Account("110",100000);
        //2.创建两个线程，分别代表小明和小红，再去同一个账户对象中取钱十万
        new DrawThread(acc,"小明").start();//小明
        new DrawThread(acc,"小红").start();
    }
}
