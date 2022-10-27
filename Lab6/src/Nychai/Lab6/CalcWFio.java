package Nychai.Lab6;

import java.io.*;
import java.util.Scanner;
/**
 * Class <code>CalcWFio/code> class check file and save result in file
 * @author  Nychai Volodymyr KI-35
 * @version 1.0
 */
public class CalcWFio {
    private double result;

    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter file = new PrintWriter(fName);
        file.printf("%f ",result);
        file.close();
    }

    /**
     * @param fName - file name
     * method read res in txt file
     */
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

    /**
     * @param fName
     * @throws FileNotFoundException
     * @throws IOException
     * method write res in bin file
     */
    public void writeResBin(String fName) throws FileNotFoundException, IOException {
        DataOutputStream file = new DataOutputStream(new FileOutputStream(fName));
        file.writeDouble(result);
        file.close();
    }

    /**
     * @param fName
     * @throws FileNotFoundException
     * @throws IOException
     * method read res in bin file
     */
    public void readResBin(String fName) throws FileNotFoundException, IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    /**
     * @param x x - number
     *  method calculate this equation
     */
    public void calculate(double x) {
       double rad = x * Math.PI / 180.0;
        double ctg = 1/Math.tan(rad);
        result = Math.tan(rad)* (((ctg-Math.tan(rad)))/2);
    }

    /**
     * @return result of calc
     * method return res
     */
    public double getResult() {
        return result;
    }

}
