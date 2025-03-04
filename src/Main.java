import base.Person;
import uni.*;

public class Main {
    public static void main(String[] args) {

        Major major1 = new Major("Computer Science", 60);
        Major major2 = new Major("Maths", 80);

        Person person1 = new Person("Mahak Alaie", "0200879562");
        Person person2 = new Person("Maryam Yoosefi", "0200569412");
        Person person3 = new Person("Mahshid Zamani", "0200142536");
        Person person4 = new Person("Dr Mehdi Rezaei", "200789585");
        Person person5 = new Person("Dr Mina Mohammadi", "0200334168");

        Student student1 = new Student(1, 1403, 1);
        Student student2 = new Student(2, 1401, 1);
        Student student3 = new Student(3, 1398, 2);

        System.out.println(Person.findByID(student1.personID).name + "  " + student1.studentID);
        System.out.println(Person.findByID(student2.personID).name + "  " + student2.studentID);
        System.out.println(Person.findByID(student3.personID).name + "  " + student3.studentID);
        System.out.println();

        Professor professor1 = new Professor(4, 1);
        Professor professor2 = new Professor(5, 2);

        System.out.println(Person.findByID(professor1.personID).name + "  " + professor1.id);
        System.out.println(Person.findByID(professor2.personID).name + "  " + professor2.id);
        System.out.println();

        Course course1 = new Course("AP", 3);
        Course course2 = new Course("BP", 3);
        Course course = new Course("General Maths 2", 3);

        PresentedCourse presentedCourse1 = new PresentedCourse(1, 1, 65);
        PresentedCourse presentedCourse2 = new PresentedCourse(2, 1, 70);
        PresentedCourse presentedCourse3 = new PresentedCourse(3, 2, 80);

        presentedCourse1.addStudent(1);
        presentedCourse1.addStudent(2);
        presentedCourse2.addStudent(1);
        presentedCourse2.addStudent(2);
        presentedCourse2.addStudent(3);
        presentedCourse3.addStudent(3);

        Transcript transcript1 = new Transcript(1);
        Transcript transcript2 = new Transcript(2);
        Transcript transcript3 = new Transcript(3);

        transcript1.setGrade(1, 18.5);
        transcript1.setGrade(2, 19.0);

        transcript2.setGrade(1, 17.5);
        transcript2.setGrade(2, 15);

        transcript3.setGrade(2, 17.0);
        transcript3.setGrade(3, 20.0);

        transcript1.printTranscript();
        transcript2.printTranscript();
        transcript3.printTranscript();

        System.out.println("Average Grades of These Students:");
        System.out.println("Average Grade: " + transcript1.getGPA());
        System.out.println("Average Grade: " + transcript2.getGPA());
        System.out.println("Average Grade: " + transcript3.getGPA());

    }
}