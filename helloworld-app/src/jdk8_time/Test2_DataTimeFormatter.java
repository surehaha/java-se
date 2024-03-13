package jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test2_DataTimeFormatter {
    public static void main(String[] args) {
        //创建一个日期时间格式化对象
        DateTimeFormatter re=DateTimeFormatter.ofPattern("yyy年MM月dd日 HH:mm:ss");

        //对时间进行格式化
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);

        String rs=re.format(now);
        System.out.println(rs);

        //格式化时间另一种方案
        String rs2=now.format(re);
        System.out.println(rs2);
    }
}
