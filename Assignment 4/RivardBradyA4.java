import java.util.Random;

class RivardBradyA4 {

    //color constants
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
;
    public static void main(String[] args) {
        System.out.println(reverseTheNumber(9876543));
    }

    //isDigitsOnly(...) will take a String as input and 
    static boolean isDigitsOnly(String inputString) {
        boolean isAllDigits = true;

        for (int i = 0; i < inputString.length(); i++) {
            //check if the current character index is a digit
            if (!Character.isDigit(inputString.charAt(i))) {
                isAllDigits = false;
            }
        }
        return isAllDigits;
    }

    //difference(...) takes in 2 integers an returns the absolute value of their difference using Math.abs()
    static int difference(int num1, int num2) {
        return Math.abs(num1-num2);
    }

    //reverseTheNumber(...) takes in an integer and reverses all the digits
    static int reverseTheNumber(int num) {
        String originalNumber = "" + num;
        String reversedNumber = "";

        //loop through all the the digits in reverse order
        for (int i = originalNumber.length() - 1; i >= 0; i--) {
            reversedNumber += originalNumber.charAt(i);
        }
        return Integer.parseInt(reversedNumber);
    }

    //isPrime(...) checks if the number passed to it is a prime number
    static boolean isPrime(int num) {
        return true;
    }
}