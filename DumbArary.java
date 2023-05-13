package java_niit;
import java.util.*;

public class DumbArary {
    int infoSize = 4; // variable for array size
    
    private String[] userInfo = new String[infoSize];

    public String getUserInfo() {
        return userInfo[infoSize];
    }
    public void setUserInfo(String info[]) {
        this.userInfo = info;
    }
    public void getInfo() {
        Scanner input = new Scanner(System.in);
        String[] userInfo = new String[infoSize];
        // Accepts user input for the "names" array
        System.out.println("Enter your ID, Email, PhoneNo, and Password");
        for (int i = 0; i < infoSize; i++) {
            if(input.hasNext()) { // has is used for putting stuffs in an array
                userInfo[i] = input.next();
            }
            System.out.println(userInfo[i] + "");
        }
        System.out.println(getUserInfo());
    }

    public static void main(String[] args) {
        DumbArary dar = new DumbArary();
        dar.getInfo();
    }

    
}
