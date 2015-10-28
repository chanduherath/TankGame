package cloud9;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connection {

    public static Socket socket = null;
    public static DataOutputStream out = null;

    public static ServerSocket server = null;
    public static Socket listner = null;
    public static BufferedReader in = null;

    String mapdetais = null;
    String positiondetails = null;

    public Connection() {

        try {
            // send data
            socket = new Socket("127.0.0.1", 6000);
            out = new DataOutputStream(socket.getOutputStream());
            out.writeBytes("JOIN#");
            socket.close();

            // recieve data
            server = new ServerSocket(7000);	// need to create serverSocket only once
            listner = server.accept();
            in = new BufferedReader(new InputStreamReader(listner.getInputStream()));
            String reply = in.readLine();
            mapdetais = reply;
            System.out.println("First reply : " + reply);
            listner.close();

            // recieve second time
            listner = server.accept();
            in = new BufferedReader(new InputStreamReader(listner.getInputStream()));
            String secondreply = in.readLine();
            positiondetails = secondreply;
            System.out.println("second reply : " + secondreply);
            listner.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

//    public void StartListen() {
//        new Thread() {
//            public void run() {
//                while (true) {
//                    try {
//                        listner = server.accept();
//                        in = new BufferedReader(new InputStreamReader(listner.getInputStream()));
//                        String serversays = in.readLine();
//                        System.out.println(serversays);
//                        listner.close();
//                    } catch (IOException ex) {
//                        Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//            }
//        }.start();
//    }

}
