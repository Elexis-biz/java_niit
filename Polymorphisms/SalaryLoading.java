package Polymorphisms;
public class SalaryLoading {
    final int netPay = 10000;

    // so this is polymorphism, overloading method 'CalculateSalary'
    // we are calculating the salary in 4 different ways

    public void CalculateSalary(){
        System.out.println(netPay);
    }
    public void CalculateSalary(int taxDeduction){
        int pay;
        pay = netPay - taxDeduction;
        System.out.println(pay);
    }
    public void CalculateSalary(int taxDeduction, int incentives){
        int pay;
        pay = netPay - taxDeduction + incentives;
        System.out.println(pay);
    }
    public void CalculateSalary(String name, int months){
        int pay;
        pay = netPay/months;
        System.out.println(name + " " + pay);
    }
    public void CalculateSalary(String gender){
        float percentage = 5/100f; // using float instead of double because float can accomodate improper fraction
        float pay = netPay - (percentage * netPay);
        System.out.println(pay + " " + gender); // use float for percentage calculation. Int for whole numbers

    }
    public static void main(String[] args) {
        SalaryLoading sl = new SalaryLoading();
        sl.CalculateSalary();
        sl.CalculateSalary(1000); // giving value to overloaded method
        sl.CalculateSalary(1000, 700); // giving value to the variables in the parameter
        sl.CalculateSalary("Chi chi,", 2);
        sl.CalculateSalary("chi");
    }
}
