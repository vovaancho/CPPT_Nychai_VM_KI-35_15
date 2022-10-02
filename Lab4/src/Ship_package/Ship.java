package Ship_package;
import java.io.*;
import java.util.PrimitiveIterator;

/**
 * Constructor
 */
public abstract class Ship  {
    protected Engine engine1;
    protected Location loc1;
    protected Crew people;
    protected PrintWriter fout;

    Ship()throws FileNotFoundException{
        engine1 = new Engine();
        loc1 = new Location();
        people = new Crew();

        fout = new PrintWriter(new File("Result.txt"));
    }

    Ship(int valuePower,int valueVolume,int xLoc, int yLoc,int valueCount)throws FileNotFoundException{
        engine1 = new Engine(valuePower,valueVolume);
        loc1 = new Location(xLoc,yLoc);
        people = new Crew(valueCount);

        fout = new PrintWriter(new File("Result.txt"));
    }
    public void setShipCount(int count){
        people.setCount(count);
        System.out.println("Now there are "+ people.getCount() + "people on the ship");
        fout.print("You change count of crew\n");
        fout.flush();
    }
    public void shipStartMoving(){
        if (people.getCount()>50){
            System.out.println("Ship is going");
            fout.print("Ship is going\n");
            fout.flush();
        }
        else{
            System.out.println("You don't start moving");
            fout.print("You don't start moving\n");
            fout.flush();
        }
    }
    public int getCountOfPeople(){
        return people.getCount();
    }
    public void increaseCountOfPeople(int value){
        people.increaseCount(value);
        System.out.println("Now there are "+ people.getCount() + "people on the ship");
        fout.print("You change count of crew\n");
        fout.flush();
    }
    public void reduseCountOfPeople(int value){
        people.reduseCount(value);
        System.out.println("Now there are "+ people.getCount() + "people on the ship");
        fout.print("You change count of crew\n");
        fout.flush();
    }
    /////
    public int getXlocationOfShip(){
        return loc1.getXlocation();
    }
    public int getYlocationOfShip(){
        return loc1.getYlocation();
    }
    public void setLocationOfShip(int valueX, int valueY){
        loc1.setXLocation(valueX);
        loc1.setYLocation(valueY);
    }
    public void increaseAllLocation(int valueX, int valueY){
        loc1.increaseXLocation(valueX);
        loc1.increaseYLocation(valueY);
    }
    public void reduseAllLocation(int valueX, int valueY){
        loc1.reduseXLocation(valueX);
        loc1.reduseYLocation(valueY);
    }
    public void getInfoAboutLocationOfShip(){
        loc1.showInfoAboutLocation();
    }
    //

    public void redusePowerOfShip(int value){
        if (value>=engine1.getPower())
        {
            System.out.println("You enter wrong value");
        }
        else{
            engine1.redusePower(value);
        }
    }
    public void increasePowerOfShip(int value){
        if (value<0)
        {
            System.out.println("You enter wrong value");
        }
        else{
            engine1.increasePower(value);
        }
    }
    public void showEngineOfShip(){
        engine1.showEngine();
        fout.print("You look info\n");
        fout.flush();
    }

    public void AllInfo(){
        System.out.println("Power of ship is " + engine1.getPower());
        System.out.println("Volume of ship is "+ engine1.getVolume());
        System.out.println("Count of people = " + people.getCount());
        System.out.println(" X location is  " + loc1.getXlocation());
        System.out.println(" Y location is " + loc1.getYlocation());
    }

}
