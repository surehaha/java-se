package d24_reflect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class ObjectFram {
    //目标：保存任意对象的字段和其他数据到文件中去
    public static void saveObject(Object obj) throws Exception {
        PrintStream ps=new PrintStream(new FileOutputStream("D:\\DIEA\\javacode\\javasepro\\helloworld-app\\src\\data.txt",true));
        //obj是任意对象，到底有多少个字段要保存
        Class c = obj.getClass();
        String cName = c.getSimpleName();
        ps.println("--------"+cName+"------------");

        //2.从这个类中提取它的全部成员变量
        Field[] fields=c.getDeclaredFields();
        //3.遍历每个成员变量
        for (Field field : fields) {
            //4.拿到成员变量的名字
            String name=field.getName();
            //5.拿到这个成员变量在对象中的数据
            field.setAccessible(true);
            String value=field.get(obj)+"";
            ps.println(name+"="+value);
        }
        ps.close();
    }
}
