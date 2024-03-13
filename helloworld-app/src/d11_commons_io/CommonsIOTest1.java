package d11_commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

//使用commonsIO框架进行IO相关操作
public class CommonsIOTest1 {
    public static void main(String[] args) throws IOException {
        //进行文件复制
        FileUtils.copyFile(new File("helloworld-app\\src\\abc3.txt"),new File("helloworld-app\\src\\abc4.txt"));
    }
}
