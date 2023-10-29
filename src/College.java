import java.util.ArrayList;
import java.util.List;

public class College {
    private String name;
    private List<Student> students;
    private List<Teacher> teachers;

    public College(String name, List<Student> students, List<Teacher> teachers) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}