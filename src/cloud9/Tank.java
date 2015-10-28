
package cloud9;

public class Tank {
    
    private int tanklocationX ;
    private int tanklocationY;
    private int direction;
    private int whethershot;
    private int health;
    private int points;
    private int coins;
    private boolean  state;
    
    public Tank(){
        this.tanklocationX = 0;
        this.tanklocationY = 0;
        this.direction = 0;
        this.whethershot = 0;
        this.health = 0;
        this.points = 0;
        this.coins = 0;
        this.state = false;
    }

    public int getTanklocationX() {
        return tanklocationX;
    }

    public void setTanklocationX(int tanklocationX) {
        this.tanklocationX = tanklocationX;
    }

    public int getTanklocationY() {
        return tanklocationY;
    }

    public void setTanklocationY(int tanklocationY) {
        this.tanklocationY = tanklocationY;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getWhethershot() {
        return whethershot;
    }

    public void setWhethershot(int whethershot) {
        this.whethershot = whethershot;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


    public int getCoins() {
        return coins;
    }

 
    public void setCoins(int coins) {
        this.coins = coins;
    }


    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }


}
