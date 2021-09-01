import java.rmi.NotBoundException;

public class Activity_2 {
    private Integer balance;
    
    // Create a constructor
    public Activity_2(Integer initialBalance) {
        balance = initialBalance;
    }

    // Add method to calculate
    // balance amount after withdrawal
    public Integer withdraw(Integer amount) throws NotBoundException {
        if (balance < amount) {
            throw new NotBoundException();
        }
        balance -= amount;
        return balance;
    }
}