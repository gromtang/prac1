package TCPTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(10002);
        Socket s = ss.accept();

        BufferedInputStream bis = new BufferedInputStream(s.getInputStream());

        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("D:\\copy.jpg"));
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
            bos.flush();
        }

        OutputStream os = s.getOutputStream();
        os.write("1".getBytes());

        bos.close();
        s.close();
    }
}
