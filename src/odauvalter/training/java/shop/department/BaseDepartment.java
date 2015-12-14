package odauvalter.training.java.shop.department;

import odauvalter.training.java.shop.Interfaces.DepartmentInterface;
import odauvalter.training.java.shop.goods.BaseGoods;
import odauvalter.training.java.shop.service.BaseEmployee;

import java.util.ArrayList;

public class BaseDepartment implements DepartmentInterface{

    private String name;
    private ArrayList<BaseEmployee> employeeList;
    private ArrayList<BaseGoods> goodsList;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<BaseEmployee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<BaseEmployee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<BaseGoods> getGoodsList() {
        return null;
    }

    public void setGoodsList(ArrayList<BaseGoods> goodsList) {
        this.goodsList = goodsList;
    }
}
