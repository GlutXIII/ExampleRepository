/**
 * @author Piotr Lewczuk(plewczuk08@wp.pl)
 *
 * Calculator class used for adding, substracting and divinding.
 */
public class Calculator {
    /**
     * Method add secondDigit to firstDigit
     * @param firstDigit
     * @param secondDigit
     * @return double
     */
    public double add(double firstDigit,double secondDigit){
        return firstDigit+secondDigit;
    }

    /**
     * Method substract secondDigit from firstDigit
     * @param firstDigit
     * @param secondDigit
     * @return double
     */
    public double substract(double firstDigit,double secondDigit){
        return firstDigit - secondDigit;
    }

    /**
     * Method divde dividend by divider, throws IllegalArgumentException error if divder equals zero
     * @param divider
     * @param dividend
     * @return double
     */
    public double divide(double divider, double dividend){
        if(divider!=0.0){
            return dividend/divider;
        }else{
            throw new IllegalArgumentException("Divider cannot equals zero!");
        }
    }

}
