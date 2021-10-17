package task2;

public class Course {
    private String title = new String();
    private String description = new String();
    private Student[] students = new Student[20];

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student stud, int i) {
        this.students[i] = stud;
    }

    public String[] filterYear(String y, int size){
        int year = Integer.parseInt(y);
        int j = 0;
        String[] res = new String[size];
        for (int i = 0; i < size; i++)
            if (students[i].getYear() == year) {
                res[j] = students[i].getName();
                j++;
            }

        return res;
    }
}
