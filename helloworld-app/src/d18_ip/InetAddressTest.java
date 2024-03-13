package d18_ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

//掌握Inetaddress类的使用
public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        //1.获取本机的ip地址
        InetAddress ip1=InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        //2.获取指定ip或者域名的IP地址对象
        InetAddress ip2=InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());
        //ping www.baidu.com
        System.out.println(ip2.isReachable(6000));
    }
}
