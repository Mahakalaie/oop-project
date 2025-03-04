package uni;

import java.util.ArrayList;

public class Course {

    int id;
    public static ArrayList<Course> courseList = new ArrayList<>();
    public String title;
    public int units;
    static int courseIDCreate = 1;

    public Course(String title, int units)
    {
        id = courseIDCreate;
        this.title = title;
        this.units = units;

        courseList.add(this);

        courseIDCreate ++ ;
    }

    public static Course findByID(int id)
    {
        for(Course course: courseList)
        {
            if(course.id == id)
            {
                return course;
            }
        }
        return null;
    }
}
