package d19_upd;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//服务端开发
public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        //1.创建一个服务端对象，注册端口
        DatagramSocket socket=new DatagramSocket(6666);

        //2.创建一个数据包对象，用于接收数据的
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet=new DatagramPacket(buffer,buffer.length);

        while (true) {
            //3.开始正式使用数据包来接收客户端发来的数据
            socket.receive(packet);

            //4.从字节数组中，把接收到的数据直接打印出来
            //接收多少就倒出多少
            //获取本次接收了多长的数据
            int len=packet.getLength();

            String re=new String(buffer,0,len);
            System.out.println(re);

            System.out.println(packet.getAddress().getHostAddress());
            System.out.println(packet.getPort());
            System.out.println("------------------");
        }
    }
}
