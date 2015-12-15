package odauvalter.training.java.shop.Interfaces;

import java.util.ArrayList;

public interface DepartmentInterface {

    String getName();
    ArrayList<EmployeeInterface> getEmployeeList();
    ArrayList<GoodsInterface> getGoodsList();
}
