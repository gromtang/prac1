import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetTest {

    public static void main(String[] args) {

        try {
            InetAddress ia = InetAddress.getByName("192.168.44.1");
            String name = ia.getHostName();
            String address = ia.getHostAddress();
            System.out.println(name + ":" + address);

        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println("无此ip");
        }

    }

}
