/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloud9;

import java.util.ArrayList;

public class ParserTest {
    public static void main(String[] args) {
        String receivedString = "G:P0;0,0;0;0;100;0;0:P1;4,6;0;0;100;0;0:P2;8,2;2;0;100;1773;1773:1,3,0;1,4,0;8,6,0;0,4,0;4,2,0;6,7,0;3,1,0;2,6,0;6,8,0;8,4,0#";
        Parser p1 = new Parser();
        ArrayList<String []> detaillist = p1.GameBroadcast(receivedString);
        for (int i = 0; i < detaillist.size(); i++) {
            for (int j = 0; j < detaillist.get(i).length; j++) {
                System.out.print(detaillist.get(i)[j] + " ");
            }
            System.out.println("");
        }
    }
}
