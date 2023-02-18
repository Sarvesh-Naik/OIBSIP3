import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1000;
        int withdraw, deposit;
        int choice;
        System.out.println("Welcome to the ATM!");
        System.out.println("Please enter your choice:");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Quit");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your balance is " + balance);
                break;
            case 2:
                System.out.println("Enter the amount to withdraw: ");
                withdraw = input.nextInt();
                if (withdraw > balance) {
                    System.out.println("Insufficient balance");
                } else {
                    balance = balance - withdraw;
                    System.out.println("Withdraw successful");
                }
                break;
            case 3:
                System.out.println("Enter the amount to deposit: ");
                deposit = input.nextInt();
                balance = balance + deposit;
                System.out.println("Deposit successful");
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Have a nice day!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}
