package d10_object_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//反序列化对象
public class ObjectstreamTest2 {
    public static void main(String[] args) {
        try (
                //1.创建一个对象字节输入流管道，包装低级的字节输入流与源文件接通
                ObjectInputStream ios = new ObjectInputStream(new FileInputStream("helloworld-app\\src\\abc3.txt"));
                ){

            user u = (user)ios.readObject();
            System.out.println(u);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
