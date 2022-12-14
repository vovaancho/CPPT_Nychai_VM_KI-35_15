package Ship_package;
import java.io.*;
import java.util.PrimitiveIterator;

/**
 * Abstract class Ship implements cat
 *  @author Nychai Volodymyr KI-35
 *  @version 1.0
 */

public abstract class Ship  {
    protected Engine engine1;
    protected Location loc1;
    protected Crew people;
    protected PrintWriter fout;

    /**
     * Constructor
     * @throws FileNotFoundException
     */
    Ship()throws FileNotFoundException{
        engine1 = new Engine();
        loc1 = new Location();
        people = new Crew();

        fout = new PrintWriter(new File("Result.txt"));
    }
    /**
     * Constructor
     * @throws FileNotFoundException
     * @param<code>valuePower</code> power of the engine
     * @param<code>valueVolume</code> volume of the engine
     * @param<code>xLoc</code> X location
     * @param<code>yLoc</code> Y location
     * @param<code>count</code> count of the crew
     */
    Ship(int valuePower,int valueVolume,int xLoc, int yLoc,int valueCount)throws FileNotFoundException{
        engine1 = new Engine(valuePower,valueVolume);
        loc1 = new Location(xLoc,yLoc);
        people = new Crew(valueCount);

        fout = new PrintWriter(new File("Result.txt"));
    }
    /**
     * Method sets count of ship
     * @param count
     */
    public void setShipCount(int count){
        people.setCount(count);
        System.out.println("Now there are "+ people.getCount() + "people on the ship");
        fout.print("You change count of crew\n");
        fout.flush();
    }

    /**
     * method check count of crew and print info about move
     */
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
    /**
     * Method returns count of crew
     * @return count
     */
    public int getCountOfPeople(){
        return people.getCount();
    }
    /**
     * method increase count of crew
     *  @param value
     */
    public void increaseCountOfPeople(int value){
        people.increaseCount(value);
        System.out.println("Now there are "+ people.getCount() + "people on the ship");
        fout.print("You change count of crew\n");
        fout.flush();
    }
    /**
     * method reduse count of crew
     *  @param value
     */
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
