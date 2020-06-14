package UDPChatRoomTest;

import java.io.IOException;
import java.net.DatagramSocket;

public class ChatRoom {
    public static void main(String[] args) throws IOException {

        DatagramSocket dsSend = new DatagramSocket();
        SendThread st = new SendThread(dsSend);

        DatagramSocket dsReceive = new DatagramSocket(10001);
        ReceiveThread rt = new ReceiveThread(dsReceive);

        Thread t1Send = new Thread(st);//即Runnable与Thread的关系
        Thread t2Receive = new Thread(rt);


        t2Receive.start();
        t1Send.start();

    }
}
