package d8_byte_stream;

import java.io.*;

public class CopyTest4 {
    public static void main(String[] args) throws Exception {
        try (
             //1.创建一个字节输入流管道与源文件接通
             FileInputStream is = new FileInputStream("helloworld-app\\src\\abc1.txt");
             //2.创建一个字节输出流管道与目标文件接通
             FileOutputStream os = new FileOutputStream("helloworld-app\\src\\abc1copy.txt");
             ){

            //3.创建一个字节数组，负责转移字节数据
            byte[] buffer = new byte[1024];

            //4.从字节输入流中读取字节数据，写出去到字节输出流中，读多少写出去多少
            int len;
            while((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }

            System.out.println("复制完成！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
