package pollo_demo_tutorial;

public class Employee {
  private String name;
  private int employeeId;
  private double salary;
  private String[] complaints;
  
  public Employee(String name, int employeeId, double salary) {
    this.name = name; // 
    this.employeeId = employeeId;
    this.salary = salary;
    this.complaints = new String[10];
  
  }

  public void addComplaint(String complaint) {
    for (int i=0; i < complaints.length; i++) {
      if (complaints[i] == null) {
        complaints[i] = complaint;
        break;
      }
    }
  }

  public String[] getComplaints() {
    return this.complaints;
  }
/*
"This" means that this parameter only exists in the Employee method, however we want the parameters to allow them
to increact with the class attributes. This is like __init__ and self. in Python.
*/

  // Anthing that changes a method is called a Mutator Method
  public void setSalary(double salary) {
    if (salary > 0) {
      this.salary = salary;
    }
  }

  // Anything that - a method is called an Accessor method
  public double getSalary() {
    return salary;
  }

  public String getName() {
    return name;
  }

  public int getEmployeeId() {
    return employeeId;
  }
}
