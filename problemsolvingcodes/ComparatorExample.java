import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}

class MarksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.marks - s1.marks; // Sort by marks (Descending)
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 80));

        Collections.sort(students, new MarksComparator()); // Uses Comparator

        System.out.println(students);
    }
}
 
