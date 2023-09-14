package com.fsd.group4.departments;

import com.fsd.group4.departmentinterfaces.IDoActivity;

public class HrDepartment extends SuperDepartment implements IDoActivity{

  /*
   * departmentName will return “ Hr Department “
   * getTodaysWork will return “ Fill today’s timesheet and mark your attendance”
   * getWorkDeadline will return “ Complete by EOD “
   * doActivity “team Lunch”
   * 
   */
  @Override
  public String departmentName() {
    return "Hr Department ";
  }

  @Override
  public String getTodaysWork() {
    return "Fill today's timesheet and mark your attendance";
  }

  @Override
  public String getWorkDeadline() {
    return "Complete by EOD ";
  }

  @Override
  public String doActivity() {
    return "team Lunch";
  }

}
