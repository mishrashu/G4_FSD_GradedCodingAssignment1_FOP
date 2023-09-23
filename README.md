# Department Management System

This Java program simulates a department management system with four different departments: Super Department, Admin Department, HR Department, and Tech Department. The Super Department class is the superclass, and all other departments extend it.



### Class Structure

1. Department classes:
   - Super Department
   - Admin Department
   - HR Department
   - Tech Department

2. **Super Department Class:** This class serves as the superclass and contains four methods, each returning a String and taking no parameters:
   - `departmentName` returns "Super Department."
   - `getTodaysWork` returns "No Work as of now."
   - `getWorkDeadline` returns "Nil."
   - `isTodayAHoliday` returns "Today is not a holiday."

3. **Admin Department Class:** This class contains three methods, each returning a String and taking no parameters:
   - `departmentName` returns "Admin Department."
   - `getTodaysWork` returns "Complete your documents Submission."
   - `getWorkDeadline` returns "Complete by EOD."

4. **HR Department Class:** This class contains four methods, each returning a String and taking no parameters:
   - `departmentName` returns "HR Department."
   - `getTodaysWork` returns "Fill today’s timesheet and mark your attendance."
   - `getWorkDeadline` returns "Complete by EOD."
   - `doActivity` returns "Team Lunch."

5. **Tech Department Class:** This class contains four methods, each returning a String and taking no parameters:
   - `departmentName` returns "Tech Department."
   - `getTodaysWork` returns "Complete coding of Module 1."
   - `getWorkDeadline` returns "Complete by EOD."
   - `getTechStackInformation` returns "Core Java."

### Main Class

6. A Driver class, `Main`, is used to create objects of the `HrDepartment`, `TechDepartment`, and `AdminDepartment`. Each department will display its functionalities.

7. Each department will display whether today is a holiday or not with the help of the Super Department (SuperDepartment acts as a superclass for all departments).

## Expected Output

```
Welcome to Admin Department
Complete your documents submission
Complete by EOD
Today is not a Holiday

Welcome to HR Department
Team Lunch
Fill today’s timesheet and mark your attendance
Complete by EOD
Today is not a Holiday

Welcome to Tech Department
Complete coding of Module 1
Complete by EOD
Core Java
Today is not a Holiday

```

## Usage
1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/khardiashab/G4_FSD_GradedCodingAssignment1_FOP.git

2. Compile the Java program:
   ```bash 
   javac DepartmentDetails/src/com/fsd/group4/main/Main.java

4. Run the program:
   ```bash 
   java DepartmentDetails.src.com.fsd.group4.main.Main

You should see the expected output printed to the console.

## Contributor
```bash
   https://github.com/khardiashab/
   https://github.com/mishrashu/
   https://github.com/yourusername/
   https://github.com/yourusername/
