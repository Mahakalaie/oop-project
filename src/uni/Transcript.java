package uni;

import base.Person;

import java.util.HashMap;

public class Transcript {
    public int studentID;
    public HashMap<Integer, Double> transcript = new HashMap<>();

    public Transcript(int studentID)
    {
        this.studentID = studentID;

    }

    public void setGrade(int presentedCourseID, double grade)
    {
        PresentedCourse presentedCourse = PresentedCourse.findByID(presentedCourseID);
        if(presentedCourse != null)
        {
            transcript.put(presentedCourseID, grade);
        }
        else
            System.out.println("the student doesn't have this course");
    }

    public void printTranscript()
    {
        if(Student.findByID(studentID) != null)
        {
            int personID = Student.findByID(studentID).personID;
            if(Person.findByID(personID) != null) {
                System.out.println("Student's name = " + Person.findByID(personID).name);
            }

            System.out.println("Student Number:" + Student.findByID(studentID).studentID);
        }

        for(PresentedCourse presentedCourse: PresentedCourse.presentedCourseList)
        {
            for(int studentID: presentedCourse.studentIDs)
            {
                if(this.studentID == studentID)
                {
                    Course course = Course.findByID(presentedCourse.courseID);
                    if(course != null)
                    System.out.println(course.title + " : " + transcript.get(presentedCourse.id));
                }
            }
        }
        System.out.println();
    }

    public double getGPA()
    {
        int sumOfUnits = 0;
        double sumOfGrades = 0.0;
        int courseUnits;
        double courseGrade;

        for(PresentedCourse presentedCourse: PresentedCourse.presentedCourseList)
        {
            for(int studentID: presentedCourse.studentIDs)
            {
                if(this.studentID == studentID)
                {
                    Course course = Course.findByID(presentedCourse.courseID);
                    if(course != null) {
                        courseUnits = course.units;
                        //should the below lines be in the if or should i move them out?

                        courseGrade = transcript.get(presentedCourse.id);

                        sumOfGrades += courseGrade * courseUnits;

                        sumOfUnits += courseUnits;
                    }
                }
            }
        }

        return sumOfGrades / sumOfUnits;
    }
}
