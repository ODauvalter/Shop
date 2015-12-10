package odauvalter.training.java.shop;

import odauvalter.training.java.shop.client.BaseVisitor;
import odauvalter.training.java.shop.department.BaseDepartment;
import odauvalter.training.java.shop.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    private ArrayList<BaseDepartment> departmentList; // в каждом департаменте имеются свои сотрудники
    private String name;
    private ArrayList<BaseVisitor> visitorList;
    private Administrator administrator;
}
