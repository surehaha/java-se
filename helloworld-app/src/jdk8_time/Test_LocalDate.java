package jdk8_time;

import java.time.LocalDate;
import java.util.Locale;

public class Test_LocalDate {
    public static void main(String[] args) {
        //获取日期对象
        LocalDate id=LocalDate.now();//年月日
        System.out.println(id);

        //获取日期对象中的信息
        int year=id.getYear();//年
        int month=id.getMonthValue();//月
        int day=id.getDayOfMonth();//日
        int dayofyear=id.getDayOfYear();//一年中的几天
        int dayofweek=id.getDayOfWeek().getValue();//星期几

        System.out.println(year);
        System.out.println(day);
        System.out.println("星期"+dayofweek);

        //修改某个信息
        LocalDate id2=id.withYear(2055);
        LocalDate id3=id.withMonth(12);
        System.out.println(id2);
        System.out.println(id3);
        System.out.println(id);

        //把某个信息加多少
        LocalDate id4=id.plusYears(2);
        LocalDate id5=id.plusMonths(2);

        //把某个信息减多少
        LocalDate id6=id.minusYears(2);
        LocalDate id7=id.minusYears(2);

        //获取指定日期的LocalDate对象
        LocalDate id8=LocalDate.of(2099,12,12);

        //判断两个对象日期是否相等或者在前还是在后
        System.out.println(id8.equals(id));
        System.out.println(id8.isAfter(id));
    }
}
