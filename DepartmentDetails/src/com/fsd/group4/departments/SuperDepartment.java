package com.fsd.group4.departments;

import com.fsd.group4.departmentinterfaces.IDepartmentUtilities;

public class SuperDepartment implements IDepartmentUtilities {

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
