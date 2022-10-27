package Package_Ship;

import java.util.IllegalFormatCodePointException;
/**
 * Class <code>Location</code> implements the operation of the engine
 * @author  Nychai Volodymyr KI-35
 * @version 1.0
 */
public class Location {
    private int x,y;

    /**
     * Constructor
     */
    Location(){
        this.x=0;
        this.y=0;
    }
    /**
     * Another  Constructor
     */
    Location(int xValue, int yValue){
        this.x=xValue;
        this.y=yValue;
    }

    /**
     * getXlocation - method return value x
     * @return
     */
    public int getXlocation(){
        return this.x;
     }
    /**
     * getYlocation - method return value y
     * @return
     */
    public int getYlocation(){
        return this.y;
    }
    public void setXLocation(int valueX){
        this.x=valueX;
    }
    public void setYLocation(int valueY){
        this.y=valueY;
    }
    /**
     * Print info about location
     */
    public void showInfoAboutLocation(){
        System.out.println("Location X is " + getXlocation());
        System.out.println("Location Y is " + getYlocation());
    }
    /**
     *  method increase X
     */
    public void increaseXLocation(int valueX){
        if (valueX<0){
            System.out.println("You entered wrong value");
        }
        else{
            this.x+=valueX;
            System.out.println("You change X location, now X =" + getXlocation());
        }

    }
    /**
     * method increase Y
     */
    public void increaseYLocation(int valueY){
        if (valueY<0){
            System.out.println("You entered wrong value");
        }
        else{
            this.y+=valueY;
            System.out.println("You change Y location, now Y =" + getYlocation());
        }

    }
    /**
     * method reduse Y
     */
    public void reduseYLocation(int valueY){
        if (valueY>this.y){
            System.out.println("You entered wrong value");
        }
       else{
            this.y-=valueY;
            System.out.println("You change Y location, now Y =" + getYlocation());
        }
    }
    /**
     * method reduse X
     */
    public void reduseXLocation(int valueX){
        if (valueX>this.x){
            System.out.println("You entered wrong value");
        }
        else{
            this.x-=valueX;
            System.out.println("You change X location, now X =" + getXlocation());
        }
    }
}
