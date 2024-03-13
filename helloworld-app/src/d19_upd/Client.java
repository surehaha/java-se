package d19_upd;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

//目标：完成UDP的快速入门，实现一发一收
public class Client {
    public static void main(String[] args) throws Exception {
        //1.创建客户端对象
        DatagramSocket socket=new DatagramSocket();
        //2.创建数据包对象封装要发出去的数据
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg=sc.nextLine();

            if("exit".equals(msg)){
                System.out.println("退出成功");
                socket.close();
                break;
            }
            byte[] bytes=msg.getBytes();
            DatagramPacket packet=new DatagramPacket(bytes,bytes.length,
                    InetAddress.getLocalHost(),6666);

            //3.开始正式发送这个数据包的数据出去了
            socket.send(packet);
        }

    }
}
