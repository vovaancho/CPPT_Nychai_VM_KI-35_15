package Ship_package;

import java.util.IllegalFormatCodePointException;
/**
 * Class <code>Location</code> implements the location X,Y
 * @author  Nychai Volodymyr KI-35
 * @version 1.0
 */
public class Location {
    private int x,y;

    /**
     * Constructor
     * @param<code>x</code> X location
     *  @param<code>y</code> Y location
     */
    Location(){
        this.x=0;
        this.y=0;
    }
    /**
     * Another Constructor
     * @param<code>x</code> X location
     *  @param<code>y</code> Y location
     */
    Location(int xValue, int yValue){
        this.x=xValue;
        this.y=yValue;
    }
    /**
     * Method returns X location
     * @return X X
     */
    public int getXlocation(){
        return this.x;
    }
    /**
     * Method returns Y location
     * @return Y Y
     */
    public int getYlocation(){
        return this.y;
    }

    /**
     * Method sets X location
     * @param valueX X
     */
    public void setXLocation(int valueX){
        this.x=valueX;
    }
    /**
     * Method sets Y location
     * @param valueY Y
     */
    public void setYLocation(int valueY){
        this.y=valueY;
    }
    /**
     * method show info about Location
     */
    public void showInfoAboutLocation(){
        System.out.println("Location X is " + getXlocation());
        System.out.println("Location Y is " + getYlocation());
    }
    /**
     * method increase X location
     *  @param valueX X
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
     * method increase Y location
     *  @param valueY Y
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
     * method reduse Y location
     * @param valueY Y
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
     * method reduse X location
     * @param valueX X
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
