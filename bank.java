import java.util.Scanner;


class BankAccount {
    protected int account;
    protected double balance;

    public BankAccount(int account_num, double init_balance) {
        account = account_num;
        balance = init_balance;
    }

    //  method to deposit into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit into account: " + account);
        System.out.println("Amount: " + amount);
        System.out.println("New Balance: " + balance);
        System.out.println();
    }

    //  method to withdraw from the account
    public boolean withdrawal(double amount) {
        boolean result = false;

        System.out.println("Withdrawal from account: " + account);
        System.out.println("Amount: " + amount);

        if (amount > balance) {
            System.out.println("Insufficient Funds");
        } else {
            balance -= amount;
            System.out.println("New Balance: " + balance);
            result = true;
        }
        System.out.println();
        return result;
    }
}

class CurrentAccount extends BankAccount {
    final SavingsAccount fee;

    public CurrentAccount(int account_num, double init_balance, SavingsAccount protection) {
        super(account_num, init_balance);
        fee = protection;
    }

    //  method for fee deduction
    public boolean deductFee(double amount) {
        boolean result = false;
        if (!super.withdrawal(amount)) {
            System.out.println("Using Fee...");
            if (!fee.withdrawal(amount)) {
                System.out.println("Fee Source Insufficient");
            } else {
                System.out.println("Using Fee");
                balance = 0;
                System.out.println("New Balance on account after deduction " + account + ": " + balance);
                result = true;
            }
        }
        System.out.println();
        return result;
    }
}

class SavingsAccount extends BankAccount {
    protected double interestRate;

    public SavingsAccount(int account_num, double init_balance, double ir) {
        super(account_num, init_balance);
        interestRate = ir;
    }

    //  method to calculate the interest
    public void addInterest() {
        balance += balance * interestRate;
        System.out.println("Interest added to account: " + account);
        System.out.println("New Balance: " + balance);
        System.out.println();
    }
}


public class bank {

    public static void main(String[] args) {
        // write your code here
        char str;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Account number: ");
        int account_num = input.nextInt();

        SavingsAccount save = new SavingsAccount(account_num, 1000, 0.5);
        CurrentAccount current = new CurrentAccount(account_num, 1000, save);

        do {
            System.out.println("+++++Welcome to Laxmi Chit Fund+++++");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.print("Enter your choice: ");
            int x = input.nextInt();

            switch (x) {
                case 1:
                    System.out.print("Enter the amount to be deposit: ");
                    double deposit = input.nextDouble();
                    save.deposit(deposit);
                    break;
                case 2:
                    System.out.print("Enter the amount to be withdrawn: ");
                    double withdraw = input.nextDouble();
                    save.withdrawal(withdraw);
                    break;
                default:
            }

            System.out.print("Do you want to continue: ");
            str = input.next().charAt(0);

        }while (str == 'y' || str == 'Y');


//        System.out.println("Account-1");
//        save.deposit(148.04);
//        check.withdrawal(123);
//
//        System.out.println("Account-2");
//        save.withdrawal(725.55);
//        check.deposit(1000);
//        check.withdrawal(320.18);

    }
}
