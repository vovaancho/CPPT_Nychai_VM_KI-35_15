package Ship_package;
/**
 * Class <code>Engine</code> implements the operation of the engine
 * @author  Nychai Volodymyr KI-35
 * @version 1.0
 */
public class Engine {
    //characteristics of engine
    private int power;
    private int volume;
/**
 * Constructor
 * @param<code>power</code>
 * @param<code>volume</code> volume of the ship
 */
    public Engine(){
        this.power=100000;
        this.volume=500;
    }
 /**
  * Another Constructor
 * @param<code>power</code> power of the engine
 * @param<code>volume</code> volume of the ship
 */
    public Engine(int power, int volume){
        this.power=power;
        this.volume=volume;
    }
    /**
     * Method returns the power of engine
     * @return power of engine
     */
    public int getPower(){
        return this.power;
    }
    /**
     * Method returns the volume of engine
     * @return volume of engine
     */
    public int getVolume(){
        return  this.volume;
    }
    /**
     * method reduse power
     * @param value
     */
    public void redusePower(int value){
        if (value>=this.power)
        {
            System.out.println("You enter wrong value");
        }
        this.power-=value;
        showEngine();
    }
    /**
     * method increase power
     *  @param value
     */
    public void increasePower(int value){
        if (value<=0)
        {
            System.out.println("You enter wrong value");
        }
        this.power+=value;
        showEngine();
    }
    /**
     * method show info
     */
    public void showEngine(){
        System.out.println("Power is " + this.power);
        System.out.println("Volume is " + this.volume);
        System.out.print("\n");
    } //SHOW INFO
}
