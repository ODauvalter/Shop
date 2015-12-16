package odauvalter.training.java.shop.client;


import odauvalter.training.java.shop.Interfaces.VisitorInterface;

public abstract class BaseVisitor implements VisitorInterface {

    private String name;

    @Override
    public void buy() {
    }

    @Override
    public void returnGoods() {
    }

    @Override
    public String getName() {
        return name;
    }
}
