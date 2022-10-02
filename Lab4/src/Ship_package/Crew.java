package Ship_package;
//екіпаж
public class Crew {
    private int count;

    /**
     * Constructor
     */
    Crew(){
        this.count=0;
    }
    Crew(int count){
        this.count=count;
    }

    public void startMoving(){
        if (count>50){
            System.out.println("Ship is going");
        }
        else{
            System.out.println("You don't start moving");
        }
    }
    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count+=count;
    }

    public void increaseCount(int value){
        if (value<0){
            System.out.println("You entered wrong number");
        }
        else {
            this.count+=value;
        }

    }
    public void reduseCount(int value){
        if (value>this.count){
            System.out.println("There aren't that many people on the ship");
        }
        else {
            this.count-=value;
        }

    }

}
