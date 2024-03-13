package d20_tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.SortedMap;

//目标：完成TCP的快速入门-客户端开发，多发多收
public class Client {
    public static void main(String[] args) throws Exception {
        //1.创建Socket对象，并同时请求与服务端程序的链接
        Socket socket=new Socket("127.0.0.1",8888);

        //2.从socket通信管道中得到的一个字节输出流，用来发送数据给服务端程序
        OutputStream os=socket.getOutputStream();

        //3.把低级的字节输出流包装成数据输出流
        DataOutputStream dos=new DataOutputStream(os);

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg=sc.nextLine();
            if("exit".equals(msg)){
                System.out.println("退出成功");
                dos.close();
                socket.close();
                break;
            }
            //4.开始写数据出去了
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
