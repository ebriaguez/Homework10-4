package homeworktwo;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
    //Part 1.1
    private String firstName, lastName;
    private ArrayList<Double> examScores;

    //Part 1.2
    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    //Part 1.3
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getExamScores() {
        //return string of all exams taken
        return examScores;
    }

//    public void setExamScores(ArrayList<Double> examScores) {
//        this.examScores = examScores;
//    }

    public int getNumberOfExamsTaken(){
        //returns total number of exams taken by student
        return examScores.size();
    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public void setExamScore(int evamNumber, double newScore) {
        this.examScores.set(evamNumber, newScore);
    }

    public double getAverageExamScore() {
        double sum = 0.0;

        for (int i = 0; i < examScores.size(); ++i) {
            sum += examScores.get(i);
        }
        return sum / examScores.size();
    }


    @Override
    public String toString() {
        return "> Class.Student Name: " + firstName + " " + lastName +
                "\n> Average score:" + " " + getAverageExamScore() +
                "\nExam Scores:" +
                "\n" + getExamScores();

    }
}
