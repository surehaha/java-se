package d22_tcp_BS;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderThread extends Thread{
    private Socket socket;
    public ServerReaderThread(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        //立即响应一个内容在浏览器展示
        try {
            OutputStream os=socket.getOutputStream();
            PrintStream dos=new PrintStream(os);
            dos.println("HTTP/1.1 200 OK");
            dos.println("Content-Type:text/html;charset=UTF-8");
            dos.println();//必须换行
            dos.println("坤坤6666");
            dos.close();
            socket.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
