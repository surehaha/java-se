package d15_create_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//创建线程的方式三：让这个类实现callable接口
public class ThreaTest4  {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //3.创建一个Callabl对象
        Callable<String> call=new MyCallable(100);
        //4.把Callable的对象封装成一个FutrueTask对象
        //未来任务对象的作用
        //1.是一个任务对象，实现了Runnable对象
        //2.可以在线程执行完毕之后，用未来任务对象调用get方法获取线程执行完毕后的结果
        FutureTask<String> f1=new FutureTask<>(call);
        //5.把任务对象交给一个Thread对象
        new Thread(f1).start();

        //6.获取线程执行完毕后的结果
        String s = f1.get();
        System.out.println(s);
    }
}
