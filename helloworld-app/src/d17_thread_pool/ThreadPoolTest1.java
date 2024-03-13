package d17_thread_pool;

import java.util.concurrent.*;
//目标：掌握线程池的创建
public class ThreadPoolTest1 {
    public static void main(String[] args) {
        //1.通过ThreadPoolExecutor创建一个线程池对象
        ExecutorService pool=new ThreadPoolExecutor(3,5,8,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Runnable target=new MyRunnable();
        pool.execute(target);//线程池会自动创建一个新线程，自动处理任务
        pool.execute(target);//线程池会自动创建一个新线程，自动处理任务
        pool.execute(target);//线程池会自动创建一个新线程，自动处理任务
        pool.execute(target);//复用前面的核心线程
        pool.execute(target);//复用前面的核心线程
        pool.execute(target);
        pool.execute(target);
        //到了创建临时线程的时候
        pool.execute(target);
        pool.execute(target);
        
    }
}
