package d8_byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamTest3 {
    public static void main(String[] args) throws Exception {
        //1.创建一个字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("helloworld-app\\src\\abc1.txt",true);

        //2.开始写字节出去了
        os.write(97);
        os.write('b');

        byte[] bytes = "我爱你中国abc".getBytes();
        os.write(bytes);

        os.write(bytes,0,15);

        os.close();
    }
}
