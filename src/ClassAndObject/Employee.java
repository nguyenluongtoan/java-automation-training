package ClassAndObject;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee() {}

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullname(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        return  fullName;
    }

    public int getAnnualSalary(int salary) {
        int annualSalary = salary*12;
        return annualSalary;
    }

    public int upToSalary (int percent) {
        return this.salary + this.salary*percent/100;
    }



}
