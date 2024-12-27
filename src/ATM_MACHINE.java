import java.awt.*;
import java.util.Scanner;

class ATM {
    float Balance;
    int PIN = 1903;
   /* public void checkpin(){
        System.out.println("Enter Your Security Pin Here : ");
        Scanner sc = new Scanner(System.in);
        int entered_pin = sc.nextInt();
        if (entered_pin==PIN){
            Menu();
        }else {
            System.out.println("Enter Your valid Security Pin : ");
            Menu();
        }*/
    ATM(int PIN){
        this.PIN=PIN;
        System.out.println("Enter Your Security Pin Here : ");
        Scanner sc = new Scanner(System.in);
        int entered_pin = sc.nextInt();
        if (entered_pin==PIN){
            Menu();
        }else {
            System.out.println("Enter Your valid Security Pin : ");
            Menu();
    }

    }

    public void Menu(){
        System.out.println("Enter Your Choice : \n");
        System.out.println("1. Check A/C Balance : \n");
        System.out.println("2. WithDraw Money : \n");
        System.out.println("3. Deposit Money : \n ");
        System.out.println("4. Exit : \n");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice==1){
            check_Balance();
        }
        else if (choice==2){
            withdraw_money();
        }
        else if (choice==3){
            deposit_money();
        }
        else if(choice==4) {
            return;
        }
        else {
            System.out.println("Enter Valid Choice : \n ");
        }
    }

    public void check_Balance(){
        System.out.println("Your Account Balance is :" + Balance);
        Menu();
    }

    public void withdraw_money(){
        System.out.println("Enter Amount To WithDraw : \n");
        Scanner sc = new Scanner(System.in);
        float withdraw_amt = sc.nextInt();
        if (withdraw_amt>Balance){
            System.out.println("Insufficient Amount in your Bank Account:");
        }
        else {
            Balance = Balance-withdraw_amt;
            System.out.println("Money With_Drawl Successful : \n");
        }
        Menu();
    }
    public void deposit_money(){
        System.out.println("Enter Amount To Deposit : \n");
        Scanner sc = new Scanner(System.in);
        float deposit_money = sc.nextFloat();
        Balance = Balance + deposit_money;
        System.out.println("Money Deposited Successfully : \n");
        Menu();
    }

}
public class ATM_MACHINE {
    public static void main(String[] args) {
       ATM atm = new ATM(1903);
       //atm.checkpin();
    }
}
