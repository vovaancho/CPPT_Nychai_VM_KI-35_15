package Ship_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Frigate extends Ship implements Shot  {
    private int ammunition;
    private int speed;
    Frigate()throws FileNotFoundException{
        this.ammunition=0;
        this.speed=0;
    }

    Frigate(int valuePower,int valueVolume,int xLoc, int yLoc,int valueCount,int ammunition,int speed) throws FileNotFoundException {
        super( valuePower,valueVolume, xLoc, yLoc, valueCount);
        this.ammunition=ammunition;
        this.speed=speed;
    }

    public int getSpeed(){return this.speed;}
    public int getAmmunition(){
        return this.ammunition;
    }
    public void AllInfo(){
        System.out.println("Power of ship is " + engine1.getPower());
        System.out.println("Volume of ship is "+ engine1.getVolume());
        System.out.println("Count of people = " + people.getCount());
        System.out.println("X location is  " + loc1.getXlocation());
        System.out.println("Y location is " + loc1.getYlocation());
        System.out.println("Ammunition is " + getAmmunition());
        System.out.println("Speed is " + getSpeed());
    }


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

    public void printInfoAboutChase() {
        System.out.println("You start Chase \t"+ "Your speed is " +getSpeed() + " \tYou have "+ getAmmunition()+ " ammunitions");
        fout.println("You start Chase \t"+ "Your speed is " +getSpeed() + "You have "+ getAmmunition()+ " ammunitions");
        fout.flush();
    }
}
