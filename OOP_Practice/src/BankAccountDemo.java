public class BankAccountDemo
{
    public static void main(String[] args)
    {
        BankAccount Djoyke = new BankAccount("Djoyke");

        PrintOwner(Djoyke);
        PrintBalance(Djoyke);
        Djoyke.deposit(0);
        Djoyke.deposit(500);
        PrintBalance(Djoyke);
        Djoyke.withdraw(600);
        Djoyke.withdraw(40);
        PrintBalance(Djoyke);
    }

    public static void PrintOwner(BankAccount bankAccount)
    {
        System.out.println("Owner is " + bankAccount.getOwner());
        System.out.println();
    }

    public static void PrintBalance(BankAccount bankAccount)
    {
        System.out.println("Balance is " + bankAccount.getBalance());
        System.out.println();
    }
}
