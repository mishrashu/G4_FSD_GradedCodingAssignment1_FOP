package com.fsd.group4.departments;

import com.fsd.group4.departmentinterfaces.IGetTechStackInformation;

public class TechDepartment extends SuperDepartment implements IGetTechStackInformation {

  /*
   * departmentName will return “ Tech Department “
   * getTodaysWork will return “ Complete coding of module 1”
   * getWorkDeadline will return “ Complete by EOD “
   * getTechStackInformation will return “core Java”
   */
  @Override
  public String departmentName() {
    return "Tech Department ";
  }

  @Override
  public String getTodaysWork() {
    return "Complete coding of Module 1";
  }

  @Override
  public String getWorkDeadline() {
    return "Complete by EOD ";
  }

  @Override
  public String getTechStackInformation() {
    return "Core Java";
  }

}
