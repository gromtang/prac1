package TCPTest;

import java.io.*;
import java.net.Socket;

public class TCPClientTest {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("192.168.44.1",10002);

        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("D:\\证件照.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
            bos.flush();
        }
        s.shutdownOutput();

        InputStream is = s.getInputStream();
        byte[] bys2 = new byte[1024];
        int len2 = is.read(bys2);
        String answer = new String(bys2,0,len2);
        System.out.print(answer);

        bis.close();
        bos.close();
    }
}
