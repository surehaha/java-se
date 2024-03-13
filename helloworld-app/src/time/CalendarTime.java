package time;

import java.util.Calendar;
import java.util.Date;

public class CalendarTime {
    public static void main(String[] args) {
        //得到系统此时间对应的日历对象
        Calendar now= Calendar.getInstance();
        System.out.println(now);

        //获取日历中的某个信息
        int year=now.get(Calendar.YEAR);
        System.out.println(year);

        int days=now.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);

        //拿到日历中记录的日期对象
        Date d=now.getTime();
        System.out.println(d);

        //拿到时间毫秒值
        long time=now.getTimeInMillis();
        System.out.println(time);

        //修改日历中的某个信息
        now.set(Calendar.MONTH,9);//月份修改为十月份
        now.set(Calendar.DAY_OF_YEAR,125);//修改成一年中的125天
        System.out.println(now);

        //为某个时间增加或者减少
        now.add(Calendar.DAY_OF_YEAR,100);
        System.out.println(now);
    }
}
