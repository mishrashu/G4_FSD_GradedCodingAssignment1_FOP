package com.fsd.group4.departments;

public class AdminDepartment extends SuperDepartment {

  /*
   * departmentName will return “ Admin Department “
   * getTodaysWork will return “Complete your documents Submission”
   * getWorkDeadline will return “ Complete by EOD “
   */

  @Override
  public String departmentName() {
    return "Admin Department ";
  }

  @Override
  public String getTodaysWork() {
    return "Complete your documents Submission";
  }

  @Override
  public String getWorkDeadline() {
    return "Complete by EOD ";
  }

}
