public class CreditAccount extends Account {
    private long creditLimit;

    public CreditAccount(long creditLimit) {
        super(0);  // кредитный счёт всегда стартует с 0
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (amount <= 0 || balance + amount > 0) {
            return false;  // нельзя уходить в плюс
        }
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= 0 || balance - amount < -creditLimit) {
            return false;
        }
        balance -= amount;
        return true;
    }
}
