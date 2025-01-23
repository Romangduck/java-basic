package access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        bankAccount.withdraw(7000);
        System.out.println("잔고 :" + bankAccount.getBalance());
    }
}
