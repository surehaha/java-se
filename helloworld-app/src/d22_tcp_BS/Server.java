package d22_tcp_BS;

import d20_tcp.ServerReaderThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务器启动成功-----");
        //1.创建一个ServerSocket的对象，同时为服务端注册端口
        ServerSocket serverSocket=new ServerSocket(8080);

        while(true){
            //2.使用serverSocket对象，调用一个accept方法，等待客户端返回信息
            Socket socket=serverSocket.accept();

            System.out.println("有人上线了"+
                    socket.getRemoteSocketAddress());

            //3.把这个客户端对应的socket通信管理，交给一个独立的线程负责处理
            new ServerReaderThread(socket).start();
        }

    }
}
