package libs;

public class Calc {
    /**
     * Addition: int+int;
     *
     * @param number1
     * @param number2
     */
    public static void addition(int number1, int number2) {
        System.out.println("Addition: " + number1 + "+" + number2 + "=" + (number1 + number2));
    }

    /**
     * Substraction int-int;
     *
     * @param number1
     * @param number2
     */
    public void substraction(int number1, int number2) {
        System.out.println("Substraction: " + number1 + "-" + number2 + "=" + (number1 - number2));
    }

    /**
     * multiplication int*int;
     *
     * @param number1
     * @param number2
     */
    public void multiplication(int number1, int number2) {
        System.out.println("Multiplication: " + number1 + "*" + number2 + "=" + (number1 * number2));
    }

    /**
     * division int/int;
     *
     * @param number1
     * @param number2
     */
    public void division(int number1, int number2) {
        try {
            int result = number1 + number2;
            System.out.println("Division: " + number1 + "/" + number2 + "=" + (number1 / number2));
        } catch (ArithmeticException e) {
            System.out.println("Division: division by zero!");
        } catch (Exception e) {
            System.out.println("Division: error" + e);
        }
    }

    /**
     * Division double\double
     * @param number1
     * @param number2
     */

    public void division(double number1, double number2) {
        try {
            double result = number1 + number2;
            System.out.println("Division: " + number1 + "/" + number2 + "=" + (number1 / number2));
        } catch (ArithmeticException e) {
            System.out.println("Division: division by zero!");
        } catch (Exception e) {
            System.out.println("Division: error" + e);
        }
    }

    /**
     * additionString String+String
     *
     * @param string1
     * @param string2
     */
    public void additionStringString(String string1, String string2) {
        System.out.println("AdditionString: " + (string1 + string2));
    }

    /**
     * additionStringInteger String+int
     *
     * @param var1
     * @param var2
     * @return
     */
    public void additionStringToInteger (String var1, int var2) {
        System.out.println("AdditionStringInteger: " + (var1 + var2));
    }

    public void additionIntegerToString(int var1, String var2) {
        try {
            Integer result = var1 + Integer.parseInt(var2);
            System.out.println("AdditionIntegerString: "+result );

        } catch (NumberFormatException e) {
            System.out.println("AdditionIntegerString: wrong format. ");

        } catch (Exception e) {
            System.out.println("AdditionIntegerString: error. " + e.getMessage());

        }
    }



}
