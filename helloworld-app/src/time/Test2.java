package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) throws ParseException {
        //秒杀活动，判断是否秒杀成功
        String start="2023年11月11日 0:0:0";
        String end="2023年11月11日 0:10:0";
        String xj="2023年11月11日 0:01:18";
        String xp="2023年11月11日 0:10:57";

        //把字符串的时间解析成日期对象
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDt=sdf.parse(start);
        Date endDt=sdf.parse(end);
        Date xjDt=sdf.parse(xj);
        Date xpDt=sdf.parse(xp);

        //判断是否秒杀成功了
        long startTime=startDt.getTime();
        long endTime=endDt.getTime();
        long xjTime=xjDt.getTime();
        long xpTime=xpDt.getTime();

        if(xjTime>=startTime&&xjTime<=endTime){
            System.out.println("小贾你秒杀成功了---");
        }else{
            System.out.println("小贾你秒杀失败了--");
        }

        if(xpTime>=startTime&&xpTime<=endTime){
            System.out.println("小皮你秒杀成功了---");
        }else{
            System.out.println("小皮你秒杀失败了--");
        }
    }
}
