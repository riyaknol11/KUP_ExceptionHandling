import java.util.Scanner;

//Custom Exception for handling 'DivisionByZeroException'
class DivisionByZeroException extends Exception{
    DivisionByZeroException(String message){
        super(message);
    }
}
class Calculator{
    public static int add(int number1, int number2) {
        int add = number1 + number2;
        return add;
    }

    public static int difference(int number1, int number2) {
        int difference = number1 - number2;
        return difference;

    }

    public static int multiply(int number1, int number2) {
        int product = number1 * number2;
        return product;

    }

    public static int divide(int number1, int number2) {
        int result =0;
        //try-catch block handles the division by zero exception
        try {
            if (number2 == 0){
                throw new DivisionByZeroException("Division by Zero is Not allowed");
            }
            else{
                result = number1 / number2;
            }

        }
        catch (DivisionByZeroException e){
            System.out.println(e);
        }
        return result;
    }
}

public class Main{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;

        try {
            // Parsing the input of user
            System.out.println("Enter the first number : ");
            number1  = Integer.parseInt(input.next());
            System.out.println("Enter the second number : ");
            number2  = Integer.parseInt(input.next());
            System.out.println("Sum of the numbers is : " + calculator.add(number1, number2));
            System.out.println("difference of the numbers is : " + calculator.difference(number1,number2));
            System.out.println("product of the numbers is " + calculator.multiply(number1,number2));
            int divide_result = calculator.divide(number1,number2);
            if(divide_result != 0){
                System.out.println("division of the numbers is " +  divide_result);
            }
        }
        // Catch block for handling NumberFormatException
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred. Enter the correct value!");
        }


    }
}
