package java_niit;
import java.util.*;

// handling exception in array size

public class TryArray {
    // we can have more than one catch but just one try for a set
    // you can have up to 6 sets of try-catch in your file
    Scanner input = new Scanner(System.in);
    public int[] arrNum = new int[10];

    public void writeList(){ // this explains we can have 2 catch
        try {
            // arrNum[10] = 11; // the array index starts from 0-9, so there is no such thing as arrNum[10] here
            System.out.println("Enter a number");
            arrNum[5] = input.nextInt(); // type mismatch- numberformatexception or InputMismatchException

        } catch (ArrayIndexOutOfBoundsException e1) { // type- ArrayIndexOutOfBoundsException
            // TODO: handle exception
            System.out.println("Array Index Out Of Bounds Exception => " + e1.getMessage());
            // ae.getMessage- explains why there is that exception using the object of the exception
        } catch (NumberFormatException e2) {            System.out.println("ERROR!!!");
        }
    }
    public static void main(String[] args) {
        TryArray ta = new TryArray();
        ta.writeList();
    }
}
