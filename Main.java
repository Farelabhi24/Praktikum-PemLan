
public class Main {
    public static void main(String[] args) {

        BankAccount Account1 = new BankAccount("12345678", "Farel", 5000000);
        BankAccount Account2 = new BankAccount("89012344", "Abhi", 1000000);

        System.out.println("Informasi Account 1:");
        Account1.displayInfo();
        System.out.println();
        
        System.out.println("Informasi Account 2:");
        Account2.displayInfo();
        System.out.println();

        System.out.println("Transaksi Account 1:");
        Account1.deposit(2000000);
        Account1.withdraw(500000);
        System.out.println();

        System.out.println("Transaksi Account 2:");
        Account2.deposit(2000000);
        Account2.withdraw(1000000);
    }
}