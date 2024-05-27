import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String indexNumber;
    private String firstName;
    private String lastName;
    private List<Integer> grades;

    public Student(String indexNumber, String firstName, String lastName, List<Integer> grades) {
        this.indexNumber = indexNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        return grades.stream().mapToInt(val -> val).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + indexNumber + ") - Average: " + getAverageGrade();
    }
}

public class Task2 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        Student topStudent = students.stream()
                .max(Comparator.comparing(Student::getAverageGrade))
                .orElse(null);

        double averageGradeAllStudents = students.stream()
                .mapToDouble(Student::getAverageGrade)
                .average()
                .orElse(0.0);

        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparing(Student::getLastName))
                .collect(Collectors.toList());

        System.out.println("Student with the highest average:");
        if (topStudent != null) {
            System.out.println(topStudent);
        }

        System.out.println("Average grade of all students: " + averageGradeAllStudents);

        System.out.println("Students sorted by last names:");
        sortedStudents.forEach(System.out::println);
    }
}
