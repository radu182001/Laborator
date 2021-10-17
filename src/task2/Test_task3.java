package task2;

import task2.Student;

public class Test_task3 {
    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.setName("Robert");
        stud1.setYear(3);

        Student stud2 = new Student();
        stud2.setName("Robert");
        stud2.setYear(3);

        if (stud1.equals(stud2)){
            System.out.println("Obiectele sunt egale.");
        } else System.out.println("Obiectele nu sunt egale."); //Aici obiectele nu sunt egale

        stud2 = stud1;

        if (stud1.equals(stud2)){
            System.out.println("Obiectele sunt egale.");
        } else System.out.println("Obiectele nu sunt egale."); //Aici obiectele sunt egale
    }
}
