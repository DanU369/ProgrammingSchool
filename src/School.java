import java.util.ArrayList;

public class School {
    ArrayList<Student> students=new ArrayList<>();
    ArrayList<Mentor> mentors=new ArrayList<>();
    ArrayList<SalesPeople> salesPeople=new ArrayList<SalesPeople>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void addMentor(Mentor mentor){
        mentors.add(mentor);
    }

    public void addSalesPeople(SalesPeople salePeople){
        salesPeople.add(salePeople);
    }

    public ArrayList<Student> studentsInModule(Module module){
        ArrayList<Student> studentsList = new ArrayList<>();
        for (Student student:students
             ) {
            if (student.getCurrentModule()==module){
                studentsList.add(student);
        }

        }
        return studentsList;
    }
}
