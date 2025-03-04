package uni;

import base.Person;

import java.util.ArrayList;

public class Major {

    public int id;
    public static ArrayList<Major> majorList = new ArrayList<>();
    public String name;
    public final int capacity;
    public int numberOfStudents;
    static int majorIDCreate = 1;

    public Major(String name, int capacity)
    {
        this.name = name;
        this.capacity = capacity;
        id = majorIDCreate;
        majorIDCreate++ ;
        majorList.add(this);
        numberOfStudents = 0;

    }

    public static Major findByID(int id)
    {
        for(Major major: majorList)
        {
            if(major.id == id)
            {
                return major;
            }
        }
        return null;
    }

    public void addStudent()
    {
        if(numberOfStudents < capacity)
        {
            numberOfStudents++;
        }
        else
        {
            System.out.println("This major has reached its full capacity.We can't add any more students");
        }
    }
}
