package odauvalter.training.java.shop.bank;


import odauvalter.training.java.shop.Interfaces.BankInterface;

public class BaseBank implements BankInterface {

    private String name;
    private String creaditDescription = "credit";

    public BaseBank(String name) {
        this.name = name;
    }

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
