package Nychai.Lab6;

import java.io.*;
import java.util.Scanner;

public class CalcWFio {
    private double result;

    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter file = new PrintWriter(fName);
        file.printf("%f ",result);
        file.close();
    }
    public void readResTxt(String fName) {
        try {
            File file2 = new File (fName);
            if (file2.exists()) {
                Scanner s = new Scanner(file2);
                result = s.nextDouble();
                s.close();
            }
            else
                throw new FileNotFoundException("File " + fName + "not found");
        }
        catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }
    public void writeResBin(String fName) throws FileNotFoundException, IOException {
        DataOutputStream file = new DataOutputStream(new FileOutputStream(fName));
        file.writeDouble(result);
        file.close();
    }
    public void readResBin(String fName) throws FileNotFoundException, IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    public void calculate(double x) {
       double rad = x * Math.PI / 180.0;
        double ctg = 1/Math.tan(rad);
        result = Math.tan(rad)* (((ctg-Math.tan(rad)))/2);
    }

    public double getResult() {
        return result;
    }

}
