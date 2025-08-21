package Assignment3.Bank;

public abstract class Account {

    // Common fields for all accounts
    protected final String accountNumber;   // final: cannot be reassigned after construction (immutable id)
    protected String holderName;
    protected double balance;

    /**
     * Base constructor increments the global Bank counter.
     */
    public Account(String accountNumber, String holderName, double openingBalance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("accountNumber cannot be null/blank");
        }
        if (holderName == null || holderName.isBlank()) {
            throw new IllegalArgumentException("holderName cannot be null/blank");
        }
        if (openingBalance < 0) {
            throw new IllegalArgumentException("openingBalance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = openingBalance;

        // Let Bank track total opened accounts (1.c utilization of static)
        Bank.registerNewAccount();
    }

    // ===== Abstract operations to be specialized by subclasses =====
    public abstract void deposit(double amount);
    public abstract boolean withdraw(double amount);
    public abstract double getBalance();

    // ===== Common concrete helpers =====
    protected final void ensurePositiveAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void renameHolder(String newName) {
        if (newName == null || newName.isBlank()) {
            throw new IllegalArgumentException("Holder name cannot be blank");
        }
        this.holderName = newName;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + "{accountNumber='" + accountNumber + '\''
                + ", holderName='" + holderName + '\''
                + ", balance=" + balance
                + '}';
    }
}