package ru.ikbo1319.experement.ex_13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentTest {
    public static final Comparator<Student>STUDENT_ID_COMPARATOR = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getiDNumber() - o1.getiDNumber();
        }
    };


    StudentTest(){
        Scanner scanner = new Scanner(System.in);
        int IDStudent = 0;
        double[] marksStudent = new double[0];
        String nameStudent;
        int gradeStudent;

        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Type the number of students you want to type.");
        int n = scanner.nextInt();
        System.out.println("Type the name, the grade and marks of the student.");
        for (int i = 0; i < n; i++){
            System.out.println("Type the name");
            nameStudent = scanner.nextLine();
            System.out.println("Type the grade");
            gradeStudent = scanner.nextInt();
            System.out.println("Type the number of marks");
            int num = scanner.nextInt();
            for(int j = 0; j < num; j++){
                marksStudent[j] = scanner.nextDouble();
            }
            IDStudent++;
            students.add(new Student(nameStudent, gradeStudent,marksStudent,IDStudent));
        }

        //сортировка по IDNumber
        Collections.sort(students,StudentTest.STUDENT_ID_COMPARATOR);
        System.out.println("There is a sorted list of students:");
        for (int i = 0; i < n;i++){
            System.out.println(students.get(i));
        }

        //сортировка по MarksGPA
        Collections.sort(students,SortingStudentsByGPA.STUDENT_MARKSGPA_COMPARATOR);
    }

    public static void main(String[] args){
        new StudentTest();
    }
}
