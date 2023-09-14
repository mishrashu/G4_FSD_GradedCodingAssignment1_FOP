package com.fsd.group4.departments;

import com.fsd.group4.departmentinterfaces.DepartmentUtilities;

public class SuperDepartment implements DepartmentUtilities {
  /*
   * departmentName will return “ Super Department “
   * getTodaysWork will return “ No Work as of now”
   * getWorkDeadline will return “ Nil “
   * isTodayAHoliday will return “ Today is not a holiday”
   * 
   */

  @Override
  public String departmentName() {
    return "Super Department ";
  }

  @Override
  public String getTodaysWork() {
  return "No Work as of now";
  }

  @Override
  public String getWorkDeadline() {
    return "Nil ";
  }

  @Override
  public String isTodayAHoliday() {
   return "Today is not a holiday";
  }

}
