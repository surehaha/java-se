package d16_thread_safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;
    private final Lock lk=new ReentrantLock();

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    //小明，小红同时过来的
    public void drawMoney(double money) {
        //先搞清楚是谁来取钱
        String name=Thread.currentThread().getName();
        lk.lock();
        try {
            //1.判断余额是否足够
            if(this.money>=money){
                System.out.println(name+"来取钱"+money+"成功");
                this.money-=money;
                System.out.println(name+"来取钱后，余额剩余"+this.money);
            }else{
                System.out.println(name+"来取钱，余额不足");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lk.unlock();
        }

    }
}
