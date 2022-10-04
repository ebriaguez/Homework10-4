package homeworktwo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String firstName = "Emily";
        String lastName = "Briaguez-Agurto";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(99.9);
        examScores.add(95.7);
        examScores.add(94.2);
        Student studentOne = new Student(firstName, lastName, examScores);
        System.out.println(studentOne.getExamScores());
        System.out.println(studentOne.getNumberOfExamsTaken());
        studentOne.addExamScore(99.3);
        System.out.println(studentOne.getExamScores());
        studentOne.setExamScore(1, 99.8);
        System.out.println(studentOne.getExamScores());
        studentOne.setExamScore(0,1.7);
        System.out.println(studentOne.getExamScores());
        System.out.println(studentOne.getAverageExamScore());
        System.out.println(studentOne);
        Double output = studentOne.getAverageExamScore();
        System.out.println(output);
        System.out.println(studentOne);
    }
}
