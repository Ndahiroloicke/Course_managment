import java.util.ArrayList;
import java.util.List;

// Base GradeBook class
class GradeBook {
    private String subject;

    public GradeBook(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

// Trackable interface
interface Trackable {
    void addGrade(Object grade);

    void displayGrades();
}

// GenericGradeBook class that extends GradeBook and implements Trackable
class GenericGradeBook<T> extends GradeBook implements Trackable {
    private List<T> grades;

    public GenericGradeBook(String subject) {
        super(subject);
        this.grades = new ArrayList<>();
    }

    @Override
    public void addGrade(Object grade) {
        // Safe casting to ensure correct type
        @SuppressWarnings("unchecked")
        T castedGrade = (T) grade;
        grades.add(castedGrade);
    }

    @Override
    public void displayGrades() {
        System.out.println("Grades for " + getSubject() + ": " + grades);
    }
}

// Main class to demonstrate usage
public class Main {
    public static void main(String[] args) {
        // Numeric grades for Math
        GenericGradeBook<Integer> mathGradeBook = new GenericGradeBook<>("Math");
        mathGradeBook.addGrade(95);
        mathGradeBook.addGrade(88);
        mathGradeBook.addGrade(72);
        mathGradeBook.displayGrades();

        // Letter grades for English
        GenericGradeBook<String> englishGradeBook = new GenericGradeBook<>("English");
        englishGradeBook.addGrade("A");
        englishGradeBook.addGrade("B+");
        englishGradeBook.addGrade("A-");
        englishGradeBook.displayGrades();

        // Percentage grades for Science
        GenericGradeBook<Double> scienceGradeBook = new GenericGradeBook<>("Science");
        scienceGradeBook.addGrade(89.5);
        scienceGradeBook.addGrade(92.3);
        scienceGradeBook.addGrade(78.0);
        scienceGradeBook.displayGrades();
    }
}
