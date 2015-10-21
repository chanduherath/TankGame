
package cloud9;

import java.util.ArrayList;


public class Cloud9 {

    public static void main(String[] args) {  
        Connection con = new Connection();
        Token tk = new Token();
        ArrayList<String[]> lst = tk.TokenizeDetail(con.mapdetais);
        Map map1 = new Map();
        map1.markOnMap(lst);
        map1.drawMap();
        Game gui = new Game(map1.map);
        gui.setVisible(true);
        
    }
    
}
