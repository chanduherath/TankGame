package cloud9;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class newClient {
    
    public static void main(String[] args) {
        Socket socket = null;
        ServerSocket myServer = null;
        BufferedReader reader = null;
        PrintWriter writer = null;
        Scanner scanner = null;
        DataOutputStream dops = null;
        
        try {
            socket = new Socket("127.0.0.1", 6000);
            System.out.println("Connected....");
            
            dops = new DataOutputStream(socket.getOutputStream());
            writer = new PrintWriter(socket.getOutputStream(), true);
//            for (int i = 0; i < 3; i++) {
//                System.out.println(reader.readLine());
//            }

//            String serverResonse = reader.readLine();
//            System.out.println(serverResonse);
            scanner = new Scanner(System.in);
//            while(true)
//            {
//            String input = scanner.next();
            dops.writeBytes("JOIN#");
//                writer.println(input);
//            String responsefromserver = reader.readLine();
//            System.out.println("Capitalized response " + responsefromserver);
//            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        //---------------------------------------------------------------------
        
        try {
            myServer = new ServerSocket(7000);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            socket = myServer.accept();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
