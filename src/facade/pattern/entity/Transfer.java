package facade.pattern.entity;

public class Transfer {
    private String id;
    private String originAccount;
    private String destinationAccount;
    private Long amountTranfer;

    public Transfer(String id, String originAccount, String destinationAccount, Long amountTranfer) {
        this.id = id;
        this.originAccount = originAccount;
        this.destinationAccount = destinationAccount;
        this.amountTranfer = amountTranfer;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "id='" + id + '\'' +
                ", originAccount='" + originAccount + '\'' +
                ", destinationAccount='" + destinationAccount + '\'' +
                ", amountTranfer=" + amountTranfer +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOriginAccount() {
        return originAccount;
    }

    public void setOriginAccount(String originAccount) {
        this.originAccount = originAccount;
    }

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public Long getAmountTranfer() {
        return amountTranfer;
    }

    public void setAmountTranfer(Long amountTranfer) {
        this.amountTranfer = amountTranfer;
    }
}
