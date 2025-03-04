package uni;

import java.util.ArrayList;

public class PresentedCourse {

    public int id;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>();
    public int courseID;
    public int professorID;
    public int capacity;
    public ArrayList<Integer> studentIDs = new ArrayList<>();
    static int presentedCourseIDCreate = 1;

    public PresentedCourse(int courseID, int professorID, int maxCapacity)
    {
        id = presentedCourseIDCreate;
        this.courseID = courseID;
        this.professorID = professorID;
        capacity = maxCapacity;
        presentedCourseIDCreate ++ ;

        presentedCourseList.add(this);

        // to doc gofte bood list besazim inja

    }

    public static PresentedCourse findByID(int id)
    {
        for(PresentedCourse presentedCourse: presentedCourseList)
        {
            if(presentedCourse.id == id)
            {
                return presentedCourse;
            }
        }
        return null;
    }

    public void addStudent(int studentID)
    {
        if(studentIDs.size() < capacity)
        {
            studentIDs.add(studentID);
        }
        else
        {
            System.out.println("This course has reached its full capacity.We can't add any more students");
        }
    }
}
