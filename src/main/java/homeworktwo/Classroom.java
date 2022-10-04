package homeworktwo;

import java.util.*;

public class Classroom {
    private int maxNumberOfStudents;
    private Student[] students;


    public Classroom(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
        this.maxNumberOfStudents = students.length;
    }

    public Classroom() {
        this.maxNumberOfStudents = 30;
        this.students = new Student[maxNumberOfStudents];
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore() {
        Double sum = 0.0;

        for (Student student : students) {
            sum += student.getAverageExamScore();
        }
        return sum / students.length;
    }

    public void addStudent(Student student ) {
        int counter = 0;
        for (int i = 0; i < students.length; ++i) {
            if (students[i] == null) {
                students[i] = student;
            }

        }
    }

    public void removeStudent(String firstName, String lastName) {
        List<Student> stud = new ArrayList<>();
        // ArrayList<Student>(Arrays.asList(this.students));

        if (this.students != null) {
            stud = new ArrayList<>(Arrays.asList(this.students));
        }
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                stud.remove(student);
                break;
            }
        }
        this.students = stud.toArray(new Student[]{});
    }

    public Student[] getStudentbyScore() {
        Comparator<Student> compareByName = Comparator.comparing(studentbyScore -> studentbyScore.getAverageExamScore());
        compareByName.reversed();
        Student[] sorted = getStudents();
        Arrays.sort(sorted, compareByName);

        return sorted;


    }

    public Map<Student, Character> getGradeBook() {
        Map<Student, Character> gradeBook = new HashMap<>();
        char grade;

        for( Student i : students){
            double score = getAverageExamScore();
            if(score>=90)
                grade= 'A';
            else if(score>=80)
                grade= 'B';
            else if(score>=70)
                grade= 'C';
            else if(score>=60)
                grade= 'D';
            else
                grade='F';
            gradeBook.put(i, grade);
        }
        return gradeBook;
    }








    @Override
    public String toString() {
        return "Classroom{" +
                "maxNumberOfStudents=" + maxNumberOfStudents +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
