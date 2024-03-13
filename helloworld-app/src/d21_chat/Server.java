package d21_chat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

//目标：完成TCP通信快速入门-服务端开发，实现多发多收
public class Server {
    public static List<Socket> onLineSocket=new ArrayList<>();
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动成功");
        //1.创建server的对象，同时为服务端注册端口
        ServerSocket serverSocket=new ServerSocket(8888);
        while (true) {
            //2.使用serverSocket对象，调用一个accept方法，等待客户端的连接请求
            Socket socket = serverSocket.accept();
            onLineSocket.add(socket);

            //3.把这个客户对应的socket通信管道，交给一个独立的线程负责处理
            new ServerReaderThread(socket).start();
        }

    }
}
