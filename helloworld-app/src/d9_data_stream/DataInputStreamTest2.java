package d9_data_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputStreamTest2 {
    public static void main(String[] args) {
        try (
                //1,创建一个数据输入流包装低级的字节输出流
                DataInputStream dis = new DataInputStream(new FileInputStream("helloworld-app\\src\\abc2.txt"));
        ){
            int i=dis.readInt();
            System.out.println(i);

            double d=dis.readDouble();
            System.out.println(d);

            boolean b=dis.readBoolean();
            System.out.println(b);

            String r=dis.readUTF();
            System.out.println(r);

        } catch (Exception e) {
            System.out.println("尝试读取 String 时到达文件结尾。");
        }
    }
}
