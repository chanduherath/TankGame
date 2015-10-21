/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloud9;


public class Player {
    private int playerlocationX ;
    private int playerlocationY;
    private int direction;
    private int whethershot;
    private int health;
    private int points;
    
    public Player(){
        this.playerlocationX = 0;
        this.playerlocationY = 0;
        this.direction = 0;
        this.whethershot = 0;
        this.health = 0;
        this.points = 0;
    }


    public int getPlayerlocationX() {
        return playerlocationX;
    }

    public void setPlayerlocationX(int playerlocationX) {
        this.playerlocationX = playerlocationX;
    }

    public int getPlayerlocationY() {
        return playerlocationY;
    }


    public void setPlayerlocationY(int playerlocationY) {
        this.playerlocationY = playerlocationY;
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
}
