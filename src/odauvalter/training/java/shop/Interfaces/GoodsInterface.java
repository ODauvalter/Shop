package odauvalter.training.java.shop.Interfaces;

import odauvalter.training.java.shop.bank.Sberbank;

public interface GoodsInterface {

    double getPrice();

    boolean hasGuarantee();

    String getName();

    DepartmentInterface getDepartment();

    String getCompany();
}
