package odauvalter.training.java.shop.Interfaces;

import odauvalter.training.java.shop.goods.BaseGoods;
import odauvalter.training.java.shop.service.BaseEmployee;

import java.util.ArrayList;

public interface DepartmentInterface {

    String getName();
    ArrayList<BaseEmployee> getEmployeeList();
    ArrayList<BaseGoods> getGoodsList();
}
