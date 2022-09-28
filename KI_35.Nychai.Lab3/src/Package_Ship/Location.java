package Package_Ship;

import java.util.IllegalFormatCodePointException;

public class Location {
    private int x,y;

    /**
     * Constructor
     */
    Location(){
        this.x=0;
        this.y=0;
    }

    Location(int xValue, int yValue){
        this.x=xValue;
        this.y=yValue;
    }
    public int getXlocation(){
        return this.x;
     }
    public int getYlocation(){
        return this.y;
    }
    public void setXLocation(int valueX){
        this.x=valueX;
    }
    public void setYLocation(int valueY){
        this.y=valueY;
    }
    public void showInfoAboutLocation(){
        System.out.println("Location X is " + getXlocation());
        System.out.println("Location Y is " + getYlocation());
    }
    public void increaseXLocation(int valueX){
        if (valueX<0){
            System.out.println("You entered wrong value");
        }
        else{
            this.x+=valueX;
            System.out.println("You change X location, now X =" + getXlocation());
        }

    }
    public void increaseYLocation(int valueY){
        if (valueY<0){
            System.out.println("You entered wrong value");
        }
        else{
            this.y+=valueY;
            System.out.println("You change Y location, now Y =" + getYlocation());
        }

    }
    public void reduseYLocation(int valueY){
        if (valueY>this.y){
            System.out.println("You entered wrong value");
        }
       else{
            this.y-=valueY;
            System.out.println("You change Y location, now Y =" + getYlocation());
        }
    }
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
