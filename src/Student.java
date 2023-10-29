public class Student{
    private String name;

    private  int id;
    private int grades[];

    public Student(String name,int id,int grades[]) {
        this.name = name;
        this.id=id;
        this.grades= grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int[] getGrades() {
        return grades;
    }

}