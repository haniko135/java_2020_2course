package ru.ikbo1319.experement.ex_22.pr_2;

import ru.ikbo1319.experement.ex_13.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Student_ex_22 {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Student> students = new ArrayList<>();

    public static final Comparator<Student> STUDENT_ID_COMPARATOR = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getiDNumber() - o1.getiDNumber();
        }
    };

    public static void studentInitialization(){
        String name;
        int grade, ID;
        double[] marks = new double[5];
        for(int i = 0; i < 5; i++) {
            System.out.println("Объявите студента:");
            System.out.println("Введите ФИО студента ");
            name = scanner.nextLine();
            System.out.println("Введите курс студента ");
            grade = scanner.nextInt();
            System.out.print("Введите оценки студента ");
            for (int j = 0; j < 5; j++) {
                marks[j] = scanner.nextDouble();
            }
            System.out.println(" ");
            ID = i;
            Student student = new Student(name, grade, marks, ID);
            students.add(student);
        }
    }

    public static boolean searchStudentsByName(String name){
       for(int i =0; i < students.size(); i++){
           if(students.get(i).getName() == name){
               return true;
           }
       }
       return false;
    }

    public static void sortByGPA(){
        Collections.sort(students, Student_ex_22.STUDENT_ID_COMPARATOR);
    }

    public static void main (String[] args){
        System.out.println("Инициализация студентов.");
        studentInitialization();
        System.out.println("Отсортировать студентов по среднему баллу");
        sortByGPA();
        System.out.println("Проведите поиск по именам студентов.");
        System.out.println("Введите имя студента");
        String searchName = scanner.nextLine();
        try {
            if(searchStudentsByName(searchName)){
                System.out.println(searchName + " найден(а)");
            }
            else {
                throw new StudentNameException();
            }
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
