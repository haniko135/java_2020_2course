package ru.ikbo1319.experement.ex_13;

public class SortingStudentsByGPA implements Comparator{
    private Student p1;
    private Student p2;

    public SortingStudentsByGPA(Student p1, Student p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public static int compare(Student p1, Student p2) {
        if (p2.getMarksGPA() > p1.getMarksGPA())
            return 1;
        else if (p1.getMarksGPA() > p2.getMarksGPA())
            return -1;
        else {
            return 0;
        }
    }

    /*public static final Comparator<Student> STUDENT_MARKSGPA_COMPARATOR = new Comparator<Student>() {
        @Override
        public int compare(Student p1, Student p2) {
            if (p2.getMarksGPA() > p1.getMarksGPA())
                return 1;
            else if (p1.getMarksGPA() > p2.getMarksGPA())
                return -1;
            else {
                return 0;
            }
        }
    };*/

}
