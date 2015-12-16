package odauvalter.training.java.shop;

import odauvalter.training.java.shop.bank.BaseBank;
import odauvalter.training.java.shop.bank.Sberbank;
import odauvalter.training.java.shop.client.Visitor;

public class Main {

    public static void main(String[] args) {

        Sberbank sberbank = new Sberbank("sber");
        System.out.println("sberbank.getName() = " + sberbank.getName());
        System.out.println("sberbank.gerCreditDescription() = " + sberbank.gerCreditDescription());
    }
}
