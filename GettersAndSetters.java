package java_niit;

public class GettersAndSetters {
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
        GettersAndSetters gas = new GettersAndSetters();

        gas.setId(645); //setting id to a value
        System.out.println("User Id: " + gas.getUserId());

        gas.setUserName("Chi chi"); // setting name to chi chi
        System.out.println("Username: " + gas.getUserName()); // gets name

        gas.setUserEmail("elexis@gmail.com"); //sets
        System.out.println("Email: " + gas.getUserEmail()); // gets

        gas.setUserPassword("billions@30*");
        System.out.println("Password: " + gas.getUserPassword());

        gas.setPhoneNumber("09023846504");
        System.out.println("Phone NO: " + gas.getUserPhoneNo());

    }
}
