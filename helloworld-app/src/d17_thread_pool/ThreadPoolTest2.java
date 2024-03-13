package d17_thread_pool;

import java.util.concurrent.*;

public class ThreadPoolTest2 {
    public static void main(String[] args) throws Exception, InterruptedException {
        //1.通过ThreadPoolExecutor创建一个线程池对象
        ExecutorService pool=new ThreadPoolExecutor(3,5,8,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        //2.使用线程处理Callab任务
        Future<String> f1=pool.submit(new MyCallable(100));
        Future<String> f2=pool.submit(new MyCallable(200));
        Future<String> f3=pool.submit(new MyCallable(300));
        Future<String> f4=pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
    }
}
