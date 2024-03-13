package d14_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//掌握LogBack日志框架的使用
public class LogBackTest {
    //创建一个logger日志对象
    public static final Logger LOGGER= LoggerFactory.getLogger("LogBackTest");
    public static void main(String[] args) {
        try {
            LOGGER.info("除法方法开始执行---");
            chu(10,0);
            LOGGER.info("除法方法开始执行---");
        } catch (Exception e) {
            LOGGER.error("除法方法执行失败，出现了bug---");
        }
    }

    public static void chu(int a,int b){
        LOGGER.info("参数a："+a);
        LOGGER.info("参数b："+b);
        int c=a/b;
        System.out.println("结果是"+c);
        LOGGER.info("结果是："+c);
    }
}
