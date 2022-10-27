package Ship_package;

import java.io.FileNotFoundException;

public class Lab4 {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String []args) throws FileNotFoundException {
        Frigate f1= new Frigate(4,5,2,2,9,100,7);
        f1.AllInfo();
        f1.ShotAtTheShip();
        f1.AllInfo();
        f1.printInfoAboutChase();

    }
}
