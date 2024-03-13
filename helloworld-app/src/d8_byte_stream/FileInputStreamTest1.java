package d8_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest1 {
    public static void main(String[] args) throws Exception {
        //1.创建文件字节输入流管道，与源文件接通
        FileInputStream is = new FileInputStream(new File("helloworld-app\\src\\abc.txt"));
        //2.读取文件字节的数据,一次读取一个字节

        /*
        int b1 = is.read();
        System.out.println(b1);

        int b2 = is.read();
        System.out.println(b2);
        */

        //3.用循环来改造上述代码
        int b;
        while((b=is.read())!=-1){
            System.out.print((char)b);
        }
        //读取性能很差！读取汉字输出会乱码，无法避免！
        //流使用完毕以后必须关闭！
        is.close();

    }
}
