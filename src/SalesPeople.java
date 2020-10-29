import java.util.Date;

public class SalesPeople extends Employee{

    public SalesPeople(String name, Date birthDate, int phoneNumber) {
        super(name, birthDate, phoneNumber);
    }

    public void getJob(Student student){
        if (!student.hasJob()){
            student.setJob(true);
        }
    }
}
