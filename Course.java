import java.util.*;


public class Course{
    List<Student> students;

    public Course(List<Student> students) {
        this.students = students;
    }
    public void addStudent(Student s){
        students.add(s);
    }
    public void deleteStudent(Student s){
        students.remove(s);
    }
    public long getNumberOfSinguters(){
        return students.stream().filter(Student::hasSignature).count();
    }
}
