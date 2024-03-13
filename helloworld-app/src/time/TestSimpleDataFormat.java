package time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class TestSimpleDataFormat {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);

        long time=d.getTime();
        System.out.println(time);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        String rs=sdf.format(d);
        System.out.println(rs);
    }
}
