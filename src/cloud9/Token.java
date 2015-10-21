/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloud9;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author JBHIFI
 */
public class Token {

    ArrayList<String[]> arrlist;
    
    public Token(){
        arrlist = new ArrayList<String[]>();
    }
    
    public ArrayList<String[]> TokenizeDetail(String str){
        StringTokenizer st = new StringTokenizer(str, ":#");
        String[] arr = new String[st.countTokens()];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = st.nextToken();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 2; i < arr.length; i++) {
            StringTokenizer st1 = new StringTokenizer(arr[i], ",;");
            String[] subarr = new String[st1.countTokens()];
            for (int j = 0; j < subarr.length; j++) {
                subarr[j] = st1.nextToken();
            }
            for (int j = 0; j < subarr.length; j++) {
                System.out.print(subarr[j]);
            }
            System.out.println("");
            arrlist.add(subarr);
        }
        return arrlist;
    }

    
}
