package Ship_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/*
 * Class <code>Frigate</code> implements the count of people
 * @author  Nychai Volodymyr KI-35
 * @version 1.0
 */
public class Frigate extends Ship implements Shot  {
    private int ammunition;
    private int speed;
    /**
     * Constructor
     * @throws FileNotFoundException
     * @param<code>ammunition</code> count of ammunition
     * @param<code>speed</code> value of speed
     */
    Frigate()throws FileNotFoundException{
        this.ammunition=0;
        this.speed=0;
    }
    /**
     * Another Constructor
     * @throws FileNotFoundException
     * @param<code>valuePower</code> power of the engine
     * @param<code>valueVolume</code> volume of the engine
     * @param<code>xLoc</code> X location
     * @param<code>yLoc</code> Y location
     * @param<code>count</code> count of the crew
     * @param<code>ammunition</code> count of ammunition
     * @param<code>speed</code> value of speed
     */
    Frigate(int valuePower,int valueVolume,int xLoc, int yLoc,int valueCount,int ammunition,int speed) throws FileNotFoundException {
        super( valuePower,valueVolume, xLoc, yLoc, valueCount);
        this.ammunition=ammunition;
        this.speed=speed;
    }
    /**
     * Another Constructor
     * @throws FileNotFoundException
     * @param<code>valueSpeed</code> value of speed
     */
Frigate(int valueSpeed) throws FileNotFoundException{
        this.speed=valueSpeed;

}
    /**
     * Method returns value of speed of the Frigate
     * @return speed
     */
    public int getSpeed(){return this.speed;}

    /**
     * Method returns ammunition of the frigate
     * @return ammunition
     */
    public int getAmmunition(){
        return this.ammunition;
    }

    /**
     * method print AllInfo
     */
    public void AllInfo(){
        System.out.println("Power of ship is " + engine1.getPower());
        System.out.println("Volume of ship is "+ engine1.getVolume());
        System.out.println("Count of people = " + people.getCount());
        System.out.println("X location is  " + loc1.getXlocation());
        System.out.println("Y location is " + loc1.getYlocation());
        System.out.println("Ammunition is " + getAmmunition());
        System.out.println("Speed is " + getSpeed());
    }

    /**
     * method check ammunition and shot
     */
    public void ShotAtTheShip() {
     if (this.ammunition>0){
         System.out.println("You shot");
         fout.print("You Shot\n");
         fout.flush();
         this.ammunition--;
     }
     else {
         System.out.println("You don't have ammunition");
         fout.print("You don't have ammunition");
         fout.flush();
     }
    }

    /**
     * method print info about chase
     */
    public void printInfoAboutChase() {
        System.out.println("You start Chase \t"+ "Your speed is " +getSpeed() + " \tYou have "+ getAmmunition()+ " ammunitions");
        fout.println("You start Chase \t"+ "Your speed is " +getSpeed() + "You have "+ getAmmunition()+ " ammunitions");
        fout.flush();
    }
}
