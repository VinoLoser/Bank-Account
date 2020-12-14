import java.util.Scanner;
import com.Account;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(20, "Vincent", "Wang");
        System.out.println(account.getBalance());
        
    }
}