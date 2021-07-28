package facade.pattern.entity;

public class Account {

    private String no;
    private Long balance;

    public Account(String no, Long balance) {
        this.no = no;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "no='" + no + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
