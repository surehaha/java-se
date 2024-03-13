package d7_char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderTest1 {
    public static void main(String[] args) {
        try (
                //1.创建一个文件字符输入流管道与源文件接通，汉字不会出现乱码
                Reader fr = new FileReader("helloworld-app\\src\\abc1.txt");
                ){
            //2.读取问本文件的内容
            int c;//记住每次读取的字符编号
            while ((c=fr.read())!=-1){
                System.out.print((char) c);
            }

            //3.每次读取多个字符
            char[] buffer = new char[3];
            int len;
            while((len=fr.read())!=-1){
                //读取多少倒出多少
                System.out.println(new String(buffer,0,len));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
