package UDPChatRoomTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable{

    private DatagramSocket ds;
    public SendThread(DatagramSocket ds){
        this.ds = ds;
    }

    @Override
    public void run(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = null;

            while ( (line = br.readLine()) != null){
                if (line.equals("886")){
                    break;
                }
                byte[] bys = line.getBytes();
                DatagramPacket dp = new DatagramPacket(bys,bys.length,
                        InetAddress.getByName("192.168.1.119"),10001);
                ds.send(dp);
            }
            ds.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
