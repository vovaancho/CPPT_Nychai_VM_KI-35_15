package Package_Ship;
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
     */
    public Engine(){
        this.power=100000;
        this.volume=500;
    }

   public Engine(int power, int volume){
       this.power=power;
       this.volume=volume;
    }

    public int getPower(){
       return this.power;
    }
    public int getVolume(){
       return  this.volume;
    }
    public void redusePower(int value){
     if (value>=this.power)
     {
         System.out.println("You enter wrong value");
     }
     this.power-=value;
     showEngine();
    }

    public void increasePower(int value){
        if (value<=0)
        {
            System.out.println("You enter wrong value");
        }
        this.power+=value;
        showEngine();
    }

    public void showEngine(){
        System.out.println("Power is " + this.power);
        System.out.println("Volume is " + this.volume);
        System.out.print("\n");
    } //SHOW INFO
}
