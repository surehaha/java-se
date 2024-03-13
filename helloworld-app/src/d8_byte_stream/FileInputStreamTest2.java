package d8_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest2 {
    public static void main(String[] args) throws Exception {
        //1.创建一个字节输入流对象代表字节输入流与源文件接通
        FileInputStream is = new FileInputStream("helloworld-app\\src\\abc.txt");

        //2.开始读取文件中的字节数据，每次读取多个字节，读取完毕会返回-1
       /*
       byte[] buffer=new byte[3];
        int len=is.read(buffer);
        String rs=new String(buffer);
        System.out.println(rs);
        System.out.println("当次读取的字节数是："+len);

        int len2=is.read(buffer);
        //注意：读取多少，倒出多少
        String rs2=new String(buffer,0,len2);
        System.out.println(rs2);
        System.out.println("当次读取的字节数是："+len2);
        */

        //3.使用while循环改造
        byte[] buffer=new byte[3];
        int len;
        while((len=is.read(buffer))!=-1){
            String rs=new String(buffer,0,len);
            System.out.print(rs);
        }

        is.close();
    }
}
