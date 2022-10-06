package Nychai.Lab6;

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

public class EquationApp {
    public static void main(String []args) throws IOException {
   CalcWFio obj1 = new CalcWFio();
   Scanner s = new Scanner(System.in);
   System.out.println("Enter data ");
   double data = s.nextDouble();
   obj1.calculate(data);
        System.out.println("Result is: " + obj1.getResult()+" Calc");
        obj1.writeResTxt("textRes.txt");
        obj1.writeResBin("BinRes.bin");

        obj1.readResBin("BinRes.bin");
        System.out.println("Result is: " + obj1.getResult()+" Bin");
        obj1.readResTxt("textRes.txt");
        System.out.println("Result is: " + obj1.getResult()+ " Txt");
    }
}
