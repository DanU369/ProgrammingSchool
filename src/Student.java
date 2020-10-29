import java.util.Date;

public class Student extends Person{
    private Module currentModule;
    private int progression;
    private boolean gotJob;
    private boolean finnishedSchool;

    public Student(String name, Date birthDate, int phoneNumber) {
        super(name, birthDate, phoneNumber);
        this.currentModule=Module.PB;

    }

    public void progressionUpdate(int progression){
        this.progression+=progression;
        if (this.progression>=100 && currentModule!=Module.ADV){
            nextModule();
        }else {
            this.finnishedSchool=true;
        }
    }

    public void nextModule(){
        if (currentModule==Module.PB){
            this.currentModule=Module.WEB;
        } else if (currentModule==Module.WEB){
            this.currentModule=Module.JAVA;
        }else {
            this.currentModule=Module.ADV;
        }
    }

    public boolean hasJob() {
        return gotJob;
    }

    public void setJob(boolean gotJob) {
        this.gotJob = gotJob;
    }

    public Module getCurrentModule() {
        return currentModule;
    }
}
