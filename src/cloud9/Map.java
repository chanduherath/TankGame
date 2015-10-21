
package cloud9;

import java.util.ArrayList;

public class Map {
    String[][] map = null;
    
   public Map(){
       this.map = initialize();
   }
   
   private String [][] initialize(){
       String [][] map = new String[10][10];
       for (int i = 0; i < 10; i++) {
           for (int j = 0; j < 10; j++) {
               map[i][j] = "N";
           }
       }
       return map;
   }
   
   public void markOnMap(ArrayList<String[]> maplist){
       for (int i = 0; i < maplist.size(); i++) {
           String [] positions = maplist.get(i);
           if(i==0){
               for (int j = 0; j < positions.length; j+=2) {
                   this.map[Integer.parseInt(positions[j+1])][Integer.parseInt(positions[j])]= "B";
               }
           }
           if(i==1){
               for (int j = 0; j < positions.length; j+=2) {
                   this.map[Integer.parseInt(positions[j+1])][Integer.parseInt(positions[j])]= "S";
               }
           }
           if(i==2){
               for (int j = 0; j < positions.length; j+=2) {
                   this.map[Integer.parseInt(positions[j+1])][Integer.parseInt(positions[j])]= "W";
               }
           }
       }

   }
   
   public void drawMap(){
       String[][]map = this.map;
       for (int i = 0; i < 10; i++) {
           for (int j = 0; j < 10; j++) {
               System.out.print(map[i][j] + " ");
           }
           System.out.println("");
       }
   }
   
}
