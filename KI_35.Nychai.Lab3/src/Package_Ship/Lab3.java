package Package_Ship;

import java.io.FileNotFoundException;

public class Lab3 {
    public static void main(String []args) throws FileNotFoundException {

        Ship ship2 = new Ship(100,100,100,100,4);

       ship2.shipStartMoving();
        ship2.setShipCount(30);
        ship2.increaseCountOfPeople(20);
        ship2.shipStartMoving();
        ship2.reduseCountOfPeople(3);
        ship2.shipStartMoving();
        ship2.getCountOfPeople();


        ship2.getInfoAboutLocationOfShip();
        ship2.setLocationOfShip(78,98);
        ship2.getInfoAboutLocationOfShip();
        ship2.reduseAllLocation(20,20);
        ship2.increaseAllLocation(20,20);

        ship2.showEngineOfShip();
        ship2.increasePowerOfShip(50);
        ship2.redusePowerOfShip(70);

        ship2.AllInfo();


        }


}
