package Nychai.Lab7;
/**
 * Class <code>Lab7</code> testdrive class
 * @author  Nychai Volodymyr KI-35
 * @version 1.0
 */
public class Lab7 {
    /**
     * @param args
     */
    public static void main(String [] args){
    Car<? super Data > car = new Car <Data>();
    car.AddData(new Coal(10, 89, "Donbas"));
    car.AddData(new Wheat(40,80,"Summer"));
    car.AddData(new Wheat(20,40,"Winter"));
    car.AddData(new Coal(77, 56, "Donbas"));
    car.AddData(new Coal(74, 8, "Donbas"));
    car.AddData(new Coal(40, 6, "Chervonograd"));


    Data res = car.findMin();
    System.out.print("The greatest price is: \n");
    res.print();
    }
}
