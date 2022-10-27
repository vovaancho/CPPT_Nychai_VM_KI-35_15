package Nychai.Lab5;

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;
/**
 * Class <code>EquationsApp</code> test class
 * @author  Nychai Volodymyr KI-35
 * @version 1.0
 */
public class EquationsApp {
    /**
     * @param args
     */
    public static void main(String []args){
        try {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));

            try {
                try {
                    Equation eq = new Equation();
                    out.print("Enter X: ");
                    fout.print(eq.Calc(in.nextInt()));
                }
                finally {
                    fout.flush();
                    fout.close();
                }
            }
            catch (CalcException ex) {
                out.print(ex.getMessage());
            }
        }
        catch (FileNotFoundException ex) {
            out.println("Exception reason: Perhaps wrong file path");
        }

    }
}
