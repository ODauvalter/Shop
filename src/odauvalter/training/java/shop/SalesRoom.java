package odauvalter.training.java.shop;

import odauvalter.training.java.shop.Interfaces.DepartmentInterface;
import odauvalter.training.java.shop.Interfaces.VisitorInterface;
import odauvalter.training.java.shop.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    private ArrayList<DepartmentInterface> departmentList; // в каждом департаменте имеются свои сотрудники
    private String name;
    private ArrayList<VisitorInterface> visitorList;
    private Administrator administrator;
}
