import java.util.ArrayList;
import java.util.Date;

public class Mentor extends Employee{
    private ArrayList<Knowledge> knowledge=new ArrayList<>();
    private Module teachingInModule;

    public Mentor(String name, Date birthDate, int phoneNumber) {
        super(name, birthDate, phoneNumber);
    }

    public void assignToModule(Module module){
        if (this.knowledge.contains(module)){
            this.teachingInModule=module;
        } else {
            System.out.println("This mentor is not prepared to teach in "+module+" module");
        }
    }
}
