package cloud9;

import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.ImageIcon;

class Client2 {
//    ImageIcon pic1 = new ImageIcon(getClass().getResource("/Img/BlackHeart1.png"));
//    LinkedList<Integer> clientqueue;
    Socket socket = null;
    ObjectInputStream ois = null;
    ObjectOutputStream oos = null;

    public Client2() {
//        clientqueue = new LinkedList<Integer>();
        try {
            socket = new Socket("127.0.0.1", 6000);
            System.out.println("server connected....");
            ois = new ObjectInputStream(socket.getInputStream());
            oos = new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        InetAddress inet = socket.getInetAddress();
        System.out.println("Server address : " + inet.getHostAddress());
        

    }

    public void informServer(String msg) {
        try {
            System.out.print("Me Client :");
//            String msg = input.nextLine();
            oos.writeObject(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
}
