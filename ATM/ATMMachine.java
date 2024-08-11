
import java.util.Scanner;

class ATM {

    float Balance;
    int PIN = 2003;

    public void checkpin() {
        System.out.println("Enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if (enterpin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
        }
    }

    public void menu() {
        System.out.println("Enter Your Choice:");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 1) {
            checkBalance();
        } else if (option == 2) {
            WithdrawMoney();
        } else if (option == 3) {
            depositMoney();
        } else if (option == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance() {
        System.out.println("Balance:" + Balance);
        menu();

    }

    public void WithdrawMoney() {
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextInt();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money withdrawl Successfully");
        }
        menu();

    }

    public void depositMoney() {
        System.out.println("Enter the amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextInt();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();

    }
}

public class ATMMachine {

    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkpin();

    }
}
