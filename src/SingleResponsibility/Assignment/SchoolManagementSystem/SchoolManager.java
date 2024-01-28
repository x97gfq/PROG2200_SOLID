package SingleResponsibility.Assignment.SchoolManagementSystem;


import java.util.ArrayList;
import java.util.List;

public class SchoolManager {
    private List<Student> students;
    private List<Class> classes;
    private List<Event> events;

    public SchoolManager() {
        students = new ArrayList<>();
        classes = new ArrayList<>();
        events = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println("Student enrolled: " + student.getName());
    }

    public void scheduleClasses(Class classInfo) {
        classes.add(classInfo);
        System.out.println("Class scheduled: " + classInfo.getClassName());
    }

    public void recordGrades(Student student, Grade grade) {
        // Simulate recording a grade for a student
        System.out.println("Grade recorded for " + student.getName() + ": " + grade.getGrade());
    }

    public void handleSchoolEvents(Event event) {
        events.add(event);
        System.out.println("Event scheduled: " + event.getEventName());
    }
}
