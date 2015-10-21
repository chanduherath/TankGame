/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloud9;


public class Test {
    
    public static void main(String[] args) {
        int occ  = 0;
        String ab = "Chandu Bandara";
        for (int i = 0; i < ab.length(); i++) {
            if(ab.charAt(i)=='P'){
                occ ++;
            }
        }
    }
}
