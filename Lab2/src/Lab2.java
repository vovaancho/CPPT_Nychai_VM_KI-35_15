 import java.util.*;
        import  java.lang.String;
        import java.io.*;


/* Клас Lab2 реалізує приклад програми до лабораторної роботи №2
 *
 * @author Nychai Volodymyr KI-35
 * @version 1.0
 * @since version 1.0
 *
 */

public class Lab2 {

    /* Статичний метод main є точкою входу в програму*
     * @param args
     * @throws FileNotFoundException
     */

    public static void main(String[] args) throws FileNotFoundException {
        Scanner numScanner = new Scanner(System.in);
        int sizeOfMatrix;
        String[][] arrayOfMatrix;
        File dataFile = new File("Lab2Nychai.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.println("Enter the filler of Matrix:");
        String filler = numScanner.nextLine();

        if (filler.length() > 1) {
            System.out.println("Filler is too long, only one Symbol");
            System.exit(3434);
        }
        System.out.println("Enter the size of Matrix:");
        sizeOfMatrix = numScanner.nextInt();
        if (sizeOfMatrix <= 0) {
            System.out.println("Only positive numbers");
            System.exit(3434);
        }
        arrayOfMatrix = new String[sizeOfMatrix][];
        for (int i = 0; i < arrayOfMatrix.length; i++) {
           int temp=sizeOfMatrix-i;
            arrayOfMatrix[i] = new String[temp];
            for (int j = 0; j < temp; j++) {
                arrayOfMatrix[i][j] = filler;
                if (i == 0) {
                    System.out.print(arrayOfMatrix[i][j]+"\t");
                    fout.print(arrayOfMatrix[i][j] + "\t");
                } else {
                    if (i >= 1 && j >= i) {
                        System.out.print(arrayOfMatrix[i][j]+"\t");
                        fout.print(arrayOfMatrix[i][j] + "\t");
                    } else {
                        System.out.print(arrayOfMatrix[i][j]+"\t");
                        fout.print(arrayOfMatrix[i][j] + "\t");
                    }
                }

            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }
}
