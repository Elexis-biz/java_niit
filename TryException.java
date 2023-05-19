package java_niit;
import java.util.Scanner;
import java.io.*; // java input and output
public class TryException {
    Scanner input = new Scanner(System.in);
    // today class is handling exceptions- 19/05
    // try and catch is like do/while, but used for handling exceptions
    // TRY- the part you think you would have error put it in the try
    // Catch to catch the exception and handles it, by informing the user what to do.

    int num1, num2, result;
    void TryMe(){
        try {
            // code that generates exception
            int divideByZero = 5 / 0;
            System.out.println("The rest of code in try block");
        } catch (Exception e) { // it could be any exception like arithmethic exception 
            // TODO: handle exception
            System.out.println("ArithmeticException => 0");
        }
    }
    void tryZero() { // this is for an arithmetic exception
        // try {
            System.out.println("Enter the first number");
            num1 = input.nextInt();
            System.out.println("Enter the second number");
            num2 = input.nextInt();
            result = num1 / num2;
            System.out.println(result);
        // } catch (Exception e) { // name is ArithmeticException
        //     // TODO: handle exception
        //     System.out.println("You can't divide by zero!!!!");
        // }
    }
    public void handler() {
        try {
            System.out.println("Enter Name : ");
            String name = input.next();
            tryZero();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("ERROR!!!!!");
        }
    }
    public void tryString(){ // this is used when user enters characters instead of integer
        try {
            String snum1, snum2;
        System.out.println("Enter the 1st number"); // String to integer
        snum1 = input.next();
        System.out.println("Enter the 2nd number"); // String to integer
        snum2 = input.next();
        num1 = Integer.parseInt(snum1); // check if it is a String instead of an integer
        num2 = Integer.parseInt(snum2); // basically coverts string(snum2) into an int variable
        result = num1 + num2;
        System.out.println(result);
        } catch (NumberFormatException e) { // name is NumberFormatException, shows because a string can't be converted to number
            // TODO: handle exception
            System.out.println("ERROR!!!");
        }

    }

    public static void main(String[] args) {
        TryException te = new TryException();
        // te.tryZero();
        te.tryString();
        // let's say the user doesn't know what input to enter and instead of integer it enters char.
        
        
    }
}
