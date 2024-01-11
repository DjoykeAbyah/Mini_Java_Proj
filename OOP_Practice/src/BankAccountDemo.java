public class BankAccountDemo
{
    public static void main(String[] args)
    {
        BankAccount Djoyke = new BankAccount("Djoyke");

        PrintOwner(Djoyke);
        Djoyke.deposit(0);
        Djoyke.deposit(500);
        Djoyke.withdraw(600);
        Djoyke.withdraw(40);
        Djoyke.withdraw(-5);
    }

    public static void PrintOwner(BankAccount bankAccount)
    {
        System.out.println("BankAccount Owner is " + bankAccount.getOwner() + "\n");
    }
}
