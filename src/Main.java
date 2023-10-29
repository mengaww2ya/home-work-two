import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student("MENGAW WUBETU", 1, new int[]{95, 89, 84});
        Student student2 = new Student("ALEMU KEBEDE", 2, new int[]{54, 80, 90});

        // Create Teacher objects
        Teacher teacher1 = new Teacher("ANTENEH GUDETU", "java");
        Teacher teacher2 = new Teacher("YETIMALE NIGUS", "database");

        // Create College object
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        College college = new College("COLLEGE OF COMPUTING AND INFORMATICS", students, teachers);

        // Print details
        System.out.println("College Name: " + college.getName());

        System.out.println("Students:");
        for (Student student : college.getStudents()) {
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Grades: " + Arrays.toString(student.getGrades()));
            System.out.println();
        }

        System.out.println("Teachers:");
        for (Teacher teacher : college.getTeachers()) {
            System.out.println("Name: " + teacher.getName());
            System.out.println("Subject: " + teacher.getSubject());
            System.out.println();

        }
    }}
