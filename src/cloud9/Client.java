/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloud9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Client {

    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader reader = null;
        PrintWriter writer = null;
        Scanner scanner = null;
        try {
            socket = new Socket("localhost",6000);
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream(),true);
//            for (int i = 0; i < 3; i++) {
//                System.out.println(reader.readLine());
//            }

//            String serverResonse = reader.readLine();
//            System.out.println(serverResonse);
            scanner = new Scanner(System.in);
            while(true)
            {
                String input = scanner.next();
                writer.println(input);
                String responsefromserver = reader.readLine();
                System.out.println("Capitalized response " + responsefromserver);
            }

        } catch (IOException ex) {
//            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException ex) {
//                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
            }
        }

    }
}
