package java_niit;

public class DumbAss {
    // we're treating getters and setters basically
    // getters: return value, setters: set value to another variable
    private int id;
    private String userName;
    private String email;
    private String password;
    private String phoneNo;

    // Getter method...

    public int getUserId() { // return type is int
        // prints out the username
        return id;
    }
    public String getUserName() { // return type is String
        // prints out the username
        return userName;
    }
    public String getUserEmail() { // return type is String
        // prints out the username
        return email;
    }
    public String getUserPassword() { // return type is String
        // prints out the username
        return password;
    }
    public String getUserPhoneNo() { // return type is String
        // prints out the username
        return phoneNo;
    }

    // Setter method..

    public void setId(int id) {
        //
        this.id = id;
    }
    public void setUserName(String name) {
        // This keyword refers to current instance itself
        this.userName = name;
    }
    public void setUserEmail(String mail) {
        // This keyword refers to curent instance itself
        this.email = mail;
    }
    public void setUserPassword(String psword) {
        // This keyword refers to curent instance itself
        this.password = psword;
    }
    public void setPhoneNumber(String number) {
        // This keyword refers to curent instance itself
        this.phoneNo = number;
    }


    public static void main(String[] args) {
        DumbAss da = new DumbAss();
        da.setUserName("Chi chi");
        System.out.println(da.getUserName());
    }
}