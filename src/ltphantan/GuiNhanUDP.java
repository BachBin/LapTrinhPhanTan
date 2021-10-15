
package ltphantan;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author bachv
 */
public class GuiNhanUDP {
    DatagramSocket sserver;
    public void MoCong(int cong) throws Exception {
       sserver = new DatagramSocket(cong);        
    }
    public void Gui(String data, String ipserver, int cong) throws Exception {      
       byte bodem[]=new byte[256];
       bodem = data.getBytes();
       DatagramSocket gui = new DatagramSocket();
       InetAddress ip = InetAddress.getByName(ipserver);
       DatagramPacket dr = new DatagramPacket(bodem, bodem.length, ip, cong);
       gui.send(dr);
       gui.close();
    }
    public String Nhan() throws Exception{
        byte bodem[]=new byte[256];
        DatagramPacket dr = new DatagramPacket(bodem,bodem.length);
        sserver.receive(dr);
        String st= new String(dr.getData()).trim();
        return st;        
    }
}
