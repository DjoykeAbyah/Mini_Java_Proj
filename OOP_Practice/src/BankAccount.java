/*
    BankAccount
    -----------------------------
    - owner : String
    - balance : int
    -----------------------------
    + BankAccount(owner : String)
    + BankAccount(owner : String, balance :int)
    + deposit(amount : int) : void
    + withdraw(amount : int) : void
    + getOwner() : String
    + getBalance() : int
 */

public class BankAccount
{
    private String owner;
    private int balance;
    
    public BankAccount(String owner)
    {
        this(owner, 0);
    }// end constructor

    public BankAccount(String owner, int balance)
    {
        this.owner = owner;
        this.balance = balance;
    }//end constructor

    public void deposit(int amount)
    {
        System.out.println("Amount deposit is " + amount);
        if (amount == 0)
        {
            System.out.println("Deposit must be above 0" +
                    "\nDeposit not possible\n");
            return ;
        }
        else
            balance += amount;
        System.out.println("Your balance is :" + getBalance());
        System.out.println("deposit success\n");
    }

    public void withdraw(int amount)
    {
        System.out.println("Amount withdrawal is " + amount);
        if (amount <= 0 || amount > balance)
        {
            System.out.println("Your balance is: " + balance
                    + "\nWithdrawal must be equal to or less than "
                    + balance + "\n");
            return ;
        }
        else
            balance -= amount;
        System.out.println("Your balance is :" + getBalance());
        System.out.println("withdrawal success\n");
    }

    public String getOwner()
    {
        return owner;
    }

    public int getBalance()
    {
        return balance;
    }
}
