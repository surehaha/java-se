package d5_file;

import java.io.File;

public class FileTest1 {
    public static void main(String[] args) {
        //创建一个文件对象，也可以指代一个不存在的文件
        File f1 = new File("D:\\DIEA\\javacode\\abc.txt");
        System.out.println(f1.length());

        //实现文件的搜索
        searchFile(new File("D:/"),"abc.txt");
    }

    public static void searchFile(File dir,String filename){
        //1.把非法情况都拦截
        if(dir==null||!dir.exists()||dir.isFile()){
            return;
        }

        //2，dir不是null，存在，一定是目录对象
        //获取当前目录下的全部一级文件对象

        File[] files=dir.listFiles();
        //3.判断当前目录下的全部一级文件对象
        if(files!=null&&files.length>0){
            //4.遍历全部一级文件对象
            for (File f : files) {
                //5.判断文件是否是文件，还是文件夹
                if(f.isFile()){
                    //是文件，判断这个文件名是否是我们要找的
                    if(f.getName().contains(filename)){
                        System.out.println("找到了"+f.getAbsolutePath());
                    }
                }else{
                    //是文件夹，继续重复这个过程
                    searchFile(f,filename);
                }
            }
        }
    }
}
