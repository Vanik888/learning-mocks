/**
 * Created by vanik on 26.03.14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Main");
        Bank bank = new Bank();
        System.out.println(bank.getAccount(3));
    }
}
