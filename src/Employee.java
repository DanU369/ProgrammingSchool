import java.util.Date;

public class Employee extends Person{
    private int salary;

    public Employee(String name, Date birthDate, int phoneNumber) {
        super(name, birthDate, phoneNumber);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
