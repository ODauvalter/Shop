package odauvalter.training.java.shop.bank;


import odauvalter.training.java.shop.Interfaces.BankInterface;

public abstract class BaseBank implements BankInterface{

    public BaseBank(String name) {
        this.name = name;
        this.creaditDescription = creaditDescription;
    }

    private String name;
    private String creaditDescription = "credit";

    @Override
    public void checkInfo() {
    }

    @Override
    public void giveCredit() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String gerCreditDescription() {
        return creaditDescription;
    }
}
