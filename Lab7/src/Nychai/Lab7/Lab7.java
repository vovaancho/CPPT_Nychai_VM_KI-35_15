package Nychai.Lab7;

public class Lab7 {
    public static void main(String [] args){
    Car<? super Data > car = new Car <Data>();
    car.AddData(new Coal(10, 89.4, "Donbas"));
    car.AddData(new Wheat(40,"Summer"));
    car.AddData(new Wheat(20,"Winter"));
    car.AddData(new Coal(77, 56.4, "Donbas"));
    car.AddData(new Coal(74, 8.4, "Donbas"));
    car.AddData(new Coal(40, 40.2, "Chervonograd"));


    Data res = car.findMax();
    System.out.print("The greatest price is: \n");
    res.print();
    }
}
