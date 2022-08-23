package students;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private ArrayList<Integer> grades;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }


    // returns the student's id
    public String getId() {
        return this.id;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (int grade: this.grades) {
            sum += grade;
        }
        return sum / this.grades.size() ;
    }
}
