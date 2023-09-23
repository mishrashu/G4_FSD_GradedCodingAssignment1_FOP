package com.fsd.group4.main;

import java.util.List;
import java.util.ArrayList;
import com.fsd.group4.departments.*;

public class Main {
  
  // Method to display the department name
  static void displayDepartment(SuperDepartment department) {
    String output = String.format("Welcome to %s", department.departmentName());
    System.out.println(output);
  }
  
  public static void main(String[] args) {
    /* 
     * Expected Output
     * 
     * Welcome to Admin Department
     * Complete your documents submission
     * Complete by EOD
     * Today is not a Holiday
     * 
     * Welcome to HR Department
     * team Lunch
     * Fill today’s timesheet and mark your attendance
     * Complete by EOD
     * Today is not a Holiday
     * 
     * Welcome to Tech Department
     * Complete coding of Module 1
     * Complete by EOD
     * Core Java
     * Today is not a Holiday
     * 
     * 
     */
    
    // Create a list to store the departments
    List<SuperDepartment> departmentList = new ArrayList<>(3);
    
    // Add the departments to the list
    departmentList.add(new AdminDepartment());
    departmentList.add(new HrDepartment());
    departmentList.add(new TechDepartment());
    
    // Iterate through the department list
    for (SuperDepartment department : departmentList) {
      // Display the department name
      displayDepartment(department);
      
      // Check if the department is of type HrDepartment
      if (department instanceof HrDepartment) {
        // Cast the department to HrDepartment and call the doActivity method
        System.out.println(((HrDepartment) department).doActivity());
      }
      
      // Print the today's work and work deadline
      System.out.println(department.getTodaysWork());
      System.out.println(department.getWorkDeadline());
      
      // Check if the department is of type TechDepartment
      if (department instanceof TechDepartment) {
        // Cast the department to TechDepartment and call the getTechStackInformation method
        System.out.println(((TechDepartment) department).getTechStackInformation());
      }
      
      // Print if today is a holiday or not
      System.out.println(department.isTodayAHoliday());
      
      // Print a new line for separation
      System.out.println();
    }
  }
}