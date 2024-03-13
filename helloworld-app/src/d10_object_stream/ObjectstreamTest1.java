package d10_object_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectstreamTest1 {
    public static void main(String[] args) {
        try (
             //2.创建一个对象字节输出流包装原始的字节
             ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("helloworld-app\\src\\abc3.txt"));
             ){
            //1.创建一个Java对象
            user u=new user("admin","张三",32,"666888");

            //3.序列化对象到文件中去
            os.writeObject(u);
            System.out.println("序列化对象成功！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
