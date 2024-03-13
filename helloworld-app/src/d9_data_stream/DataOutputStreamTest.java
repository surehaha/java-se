package d9_data_stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class DataOutputStreamTest {
    public static void main(String[] args) {
        try (
                //1,创建一个数据输出流包装低级的字节输出流
                DataOutputStream dos =
                        new DataOutputStream(new FileOutputStream("helloworld-app\\src\\abc2.txt"));
        ){
            dos.write(96);
            dos.writeDouble(99.5);
            dos.writeBoolean(true);
            dos.writeUTF("坤坤666!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
