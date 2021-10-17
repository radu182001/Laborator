package task2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Course course = new Course();

        Student student1 = new Student();
        student1.setName("Radu");
        student1.setYear(2);

        Student student2 = new Student();
        student2.setName("Alex");
        student2.setYear(2);

        Student student3 = new Student();
        student3.setName("Mihai");
        student3.setYear(1);

        Student student4 = new Student();
        student4.setName("Andra");
        student4.setYear(3);

        course.setTitle("Lol");
        course.setDescription("Cea mai tare!");
        course.setStudents(student1, 0);
        course.setStudents(student2, 1);
        course.setStudents(student3, 2);
        course.setStudents(student4, 3);

        String res = new String(Arrays.toString(course.filterYear(args[0], 4)));

        System.out.println("Studentii din anul " + args[0] + " sunt " + res);

    }
}
