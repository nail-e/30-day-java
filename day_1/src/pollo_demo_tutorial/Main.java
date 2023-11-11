package pollo_demo_tutorial;

public class Main {
  public static void main (String[] args) {
    Employee employeeOne = new Employee("Walter", 356, 1_000_000);
    employeeOne.addComplaint("Scarily Smart.");
    System.out.println(employeeOne.getSalary());
    System.out.println(employeeOne.getComplaints()[0]);
  }
}
