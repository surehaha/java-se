package d15_create_thread;
//创建Runnable接口匿名内部类形式
public class TreadTest3 {
    public static void main(String[] args) {
        //1.创建Runnable任务对象
        Runnable target= new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=5 ; i++) {
                    System.out.println("子线程1输出："+1);
                }
            }
        };
        new Thread(target).start();

        //简化接口
        new Thread(new Runnable(){
            public void run() {
                for (int i = 1; i <=5 ; i++) {
                    System.out.println("子线程2输出："+1);
                }
            }
        }).start();

        for (int i = 1; i <=5 ; i++) {
            System.out.println("主线程main输出："+1);
        }
    }
}
