package Ship_package;
//екіпаж
/**
 * Class <code>Crew</code> implements the count of people
 * @author  Nychai Volodymyr KI-35
 * @version 1.0
 */
public class Crew {
    private int count;

    /**
     * Constructor
     *  @param<code>count</code> count of crew
     */
    Crew(){
        this.count=0;
    }

    /**
     *  Another Constructor
     *  @param<code>count</code> count of crew
     */
    Crew(int count){
        this.count=count;
    }

    /**
     * method print info about move
     */
    public void startMoving(){
        if (count>50){
            System.out.println("Ship is going");
        }
        else{
            System.out.println("You don't start moving");
        }
    }
    /**
     * Method returns count of crew
     * @return count
     */
    public int getCount(){
        return count;
    }
    /**
     * Method sets count of crew
     * @param count count
     */
    public void setCount(int count){
        this.count+=count;
    }

    /**
     * method increase count of crew
     *  @param value crew
     */
    public void increaseCount(int value){
        if (value<0){
            System.out.println("You entered wrong number");
        }
        else {
            this.count+=value;
        }

    }
    /**
     * method reduse count of crew
     *  @param value value
     */
    public void reduseCount(int value){
        if (value>this.count){
            System.out.println("There aren't that many people on the ship");
        }
        else {
            this.count-=value;
        }

    }

}
