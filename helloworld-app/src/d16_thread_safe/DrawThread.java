package d16_thread_safe;

public class DrawThread extends Thread{
    private Account acc;
    public DrawThread(Account acc,String name) {
        super(name);
        this.acc=acc;
    }

    public void run(){
        //取钱
        acc.drawMoney(100000);
    }
}
