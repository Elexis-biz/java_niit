package java_niit;
import java.util.Scanner;

public class HomeMade {
  Scanner sc = new Scanner(System.in);

  public void getName() {
    String name;
    System.out.println("What's your name?");
    name = sc.nextLine();
    System.out.println("Your name is " + name);
    getFood();
  }  
  public void getFood() {
    int food;
    System.out.println("We have 3 foods option\n 1. Rice and chicken\n 2. Beans and plantain\n 3. pasta & stirfry");
    System.out.println("What food do you wanna eat?");
    System.out.println("Enter option 1, 2 or 3");
    food = sc.nextInt();

    switch (food) {
      case 1:
        System.out.println("Rice and chicken costs 1,200 naira only");
        break;
      case 2:
      System.out.println("Beans and plantain costs 1,500 naira only");
        break;
      case 3:
      System.out.println("Pasta and stirfry costs 2,000 naira only");
        break;
      default:
      System.out.println("Invalid option!, fuck you.");
        break;
    }
    
  }
  public static void main(String[] args) {
    HomeMade rs = new HomeMade();
    rs.getName();
  }
}
