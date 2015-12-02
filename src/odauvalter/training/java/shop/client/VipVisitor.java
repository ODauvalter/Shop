package odauvalter.training.java.shop.client;


public class VipVisitor {

    private String name;
    private float discount;

    public void buy() {
    }

    public void returnGoods() {

    }

    public float getSuperDiscount(){
        return discount * 1.2f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
