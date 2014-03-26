/**
 * Created by vanik on 26.03.14.
 */
public class Bank {
    private final int count = 10;
    private int[] accounts;

    public Bank() {
        accounts = new int[count];
        for (int i = 0; i< count; i++) {
            this.accounts[i] = (i+1)*10;
        }
    }

    public int getAccount(int id) {
        return accounts[id-1];
    }
}
