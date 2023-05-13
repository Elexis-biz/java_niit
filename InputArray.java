package java_niit;
import java.util.*;

public class InputArray { // Basically we are accepting input into an array
    int infoSize = 4; // variable for array size
    // this variable makes it possible to accept input from user. Because it is stored in a variable
    
    private String[] userInfo = new String[infoSize]; // our array of data type String with size 'infoSize'

    public String getUserInfo() { //method that returns string
        return userInfo[infoSize - 1];// retrives value stored in userInfo, -1 is because array indices starts from 0
    } // if we didn't put -1, the result would say index 4 out of bound; it is 0,1,2,3(indices)
    public void setUserInfo(String info[]) {
        this.userInfo = info; // sets the value of userInfo to 'info' array as parameter
    }
    public void getInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your ID, Email, PhoneNo, and Password");
        for (int i = 0; i < infoSize; i++) {
            if(input.hasNext()) { // has can be used for putting stuffs in an array- on one line 
                // e.g man goat sheep - hasNext collects them as seperate indices of the array
            // hasNext checks if there's more input available from user(seperated by space)
                userInfo[i] = input.next();
            } // assigns the user input to each array index, starting from i whose initial value is 0
            System.out.println(userInfo[i] + "");
        }
        // System.out.println(getUserInfo()); this prints value returned in getUserInfo method
    
    }
    
    // from my testing i can say the getters and setters method are useless for putiing stuffs inside an array. 
    public static void main(String[] args) {
        InputArray ia = new InputArray();
        ia.getInfo();
    }

    
}
