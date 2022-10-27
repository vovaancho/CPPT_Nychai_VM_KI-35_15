package Nychai.Lab5;
/**
 * Class <code>Equation</code> check exception and calc
 * @throws CalcException
 * @author  Nychai Volodymyr KI-35
 * @version 1.0
 */
public class Equation {
    public double Calc (int x) throws CalcException{
        double y, rad;
        rad = x * Math.PI / 180.0;

        try {
            double ctg = 1/Math.tan(rad);
            y = Math.tan(rad)* (((ctg-Math.tan(rad)))/2);
            if (y==Double.NaN || y==Double.NEGATIVE_INFINITY ||
                    y==Double.POSITIVE_INFINITY || x==90 || x== -90) {
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException ex){
            if (rad==Math.PI/2.0 || rad==-Math.PI/2.0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
 else if (x==0)
                throw new CalcException("Exception reason: X = 0");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return y;
    }
}
