package com.fsd.group4.main;

import com.fsd.group4.departments.AdminDepartment;
import com.fsd.group4.departments.HrDepartment;
import com.fsd.group4.departments.SuperDepartment;
import com.fsd.group4.departments.TechDepartment;

public class Main {
  static void displayDepartment(SuperDepartment dep) {
    System.out.println("Welcome to " + dep.departmentName());
  }

  public static void main(String[] args) {

    /*
     * Expected Output
     * 
     * Welcome to Admin Department
     * Complete your documents submission
     * Complete by EOD
     * Today is not a Holiday
     * Welcome to HR Department
     * team Lunch
     * Fill today’s timesheet and mark your attendance
     * Complete by EOD
     * Today is not a Holiday
     * Welcome to Tech Department
     * Complete coding of Module 1
     * Complete by EOD
     * Core Java
     * Today is not a Holiday
     */

    SuperDepartment adminDepartmentObject = new AdminDepartment();
    HrDepartment hrDepartmentObject = new HrDepartment();
    TechDepartment techDepartmentObject = new TechDepartment();

    displayDepartment(adminDepartmentObject);
    System.out.println(adminDepartmentObject.getTodaysWork());
    System.out.println(adminDepartmentObject.getWorkDeadline());
    System.out.println(adminDepartmentObject.isTodayAHoliday());
    System.out.println();

    displayDepartment(hrDepartmentObject);
    System.out.println(hrDepartmentObject.doActivity());
    System.out.println(hrDepartmentObject.getTodaysWork());
    System.out.println(hrDepartmentObject.getWorkDeadline());
    System.out.println(hrDepartmentObject.isTodayAHoliday());
    System.out.println();

    displayDepartment(techDepartmentObject);
    System.out.println(techDepartmentObject.getTodaysWork());
    System.out.println(techDepartmentObject.getWorkDeadline());
    System.out.println(techDepartmentObject.getTechStackInformation());
    System.out.println(techDepartmentObject.isTodayAHoliday());
  }

}
