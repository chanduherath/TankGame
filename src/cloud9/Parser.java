/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloud9;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Parser {

    
//    String receivedString = "G:P0;0,0;0;0;100;0;0:P1;4,6;0;0;100;0;0:P2;8,2;2;0;100;1773;1773:1,3,0;1,4,0;8,6,0;0,4,0;4,2,0;6,7,0;3,1,0;2,6,0;6,8,0;8,4,0#";

//    public Parser() {
//        strarray = new ArrayList<String[]>();
//    }
    public ArrayList<String[]> GameBroadcast(String str) {
        ArrayList<String[]> details = new ArrayList<String[]>();
        StringTokenizer strarray = new StringTokenizer(str, ":#");
        String[] arr = new String[strarray.countTokens()];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = strarray.nextToken();
        }
        for (int i = 1; i < (arr.length) - 1; i++) {
//            System.out.println(arr[i].substring(3));
            String sub = arr[i].substring(3);
            StringTokenizer st1 = new StringTokenizer(sub, ",;");
            String[] arr1 = new String[st1.countTokens()];
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = st1.nextToken();
            }
            details.add(arr1);
//            for (int j = 0; j < arr1.length; j++) {
//                System.out.print(arr1[j] + " ");
//            }
//            System.out.println("");
        }
        return details;
    }
    
    public int findNumOfPlayers(String str){
        int numofplayers = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='P'){
                numofplayers++;
            }
        }
        return numofplayers;
    }
    
    public LifePack createLifePack(String str){
        LifePack lf = new LifePack();

        StringTokenizer strarray = new StringTokenizer(str, ",:#");
        String[] arr = new String[strarray.countTokens()];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = strarray.nextToken();
        }
        System.out.println("Life pack appeared...");
        lf.setXcod(Integer.parseInt(arr[1]));
        System.out.println("X Co-ordinate :" + arr[1]);
        lf.setYcod(Integer.parseInt(arr[2]));
        System.out.println("Y Co-ordinate :" + arr[2]);
        lf.setVal(Integer.parseInt(arr[3]));
        System.out.println("value " + arr[3]);
        return lf;
    }
    
    public Coins createCoin(String str){
        Coins coin1 = new Coins();
        StringTokenizer strarray = new StringTokenizer(str, ",:#");
        String[] arr = new String[strarray.countTokens()];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = strarray.nextToken();
        }
        System.out.println("Coin appeared");
        coin1.setXcod(Integer.parseInt(arr[1]));
        System.out.println("X Co-ordinate :" + coin1.getXcod());
        coin1.setYcod(Integer.parseInt(arr[2]));
        System.out.println("Y Co-ordinate :" + coin1.getYcod());
        coin1.setTime(Integer.parseInt(arr[3]));
        System.out.println("Remaining time :" + coin1.getTime());
        coin1.setVal(Integer.parseInt(arr[4]));
        System.out.println("Coin value : " + coin1.getVal());
        
        return coin1;
    }

}
