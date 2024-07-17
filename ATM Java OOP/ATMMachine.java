import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 1234;

    public void checkpin()
    {
        System.out.print("Enter Your Pin: ");
        Scanner scanner = new Scanner(System.in);
        int enterpin = scanner.nextInt();

        if(enterpin == PIN)
        {
            menu();
        }
        else
        {
            System.out.println("Enter a valid Pin!");
            menu();
        }

    }

    public void menu()
    {
        System.out.println("Enter Your Choice : ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner scanner = new Scanner(System.in);
        int opt = scanner.nextInt();

        if(opt == 1){
            checkbalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        }else {
            System.out.println("Enter a valid choice : ");
        }
    }

    public void checkbalance(){
        System.out.println("Balance : "+ Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.print("Enter Amount to Withdraw : ");
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();

        if (amount>Balance){
            System.out.println("Insufficient balance!");
        }else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawal Successfully.");

        }
        menu();
    }

    public void depositMoney(){
        System.out.print("Enter the amount : ");
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully.");

        menu();
    }

}



public class ATMMachine {
    public static void main(String[] args)
    {
        ATM obj = new ATM();
        obj.checkpin();
    }

}
