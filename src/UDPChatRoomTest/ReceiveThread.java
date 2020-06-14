package UDPChatRoomTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable{
    private DatagramSocket ds;
    public ReceiveThread(DatagramSocket ds){
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            while (true){
                byte[] bys = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bys,bys.length);
                ds.receive(dp);
                //读取数据
                String ip = dp.getAddress().getHostAddress();
                String data = new String(dp.getData(),0,dp.getLength());
                System.out.println(ip + ":" + data);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //接收端不用close，即服务器端不关闭
    }
}
