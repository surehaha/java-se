package d12_Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest1 {
    public static void main(String[] args) throws Exception {
        //1.创建一个properties对象出来
        Properties properties=new Properties();
        System.out.println(properties);

        //2.开始加载属性文件中的键值对数据到properties对象去
        properties.load(new FileReader("helloworld-app\\src\\users.properties"));
        System.out.println(properties);

        //3.根据键取值
        System.out.println(properties.getProperty("admin"));

        //4.遍历全部的键和值
        Set<String> keys=properties.stringPropertyNames();
        for (String key : keys) {
            String value=properties.getProperty(key);
            System.out.println((key+"---->"+value));
        }
    }
}
