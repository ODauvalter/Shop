package odauvalter.training.java.shop;

import odauvalter.training.java.shop.bank.BaseBank;
import odauvalter.training.java.shop.bank.Sberbank;
import odauvalter.training.java.shop.client.Visitor;

public class Main {

    public static void main(String[] args) {

        BaseBank baseBank = new BaseBank("basebank");
        System.out.println("baseBank.getName() = " + baseBank.getName());
        System.out.println("baseBank.gerCreditDescription() = " + baseBank.gerCreditDescription());

        Sberbank sberbank = new Sberbank("sber");
        System.out.println("sberbank.getName() = " + sberbank.getName());
        System.out.println("sberbank.gerCreditDescription() = " + sberbank.gerCreditDescription());
    }
}
