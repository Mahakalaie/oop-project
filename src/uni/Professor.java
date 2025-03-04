package uni;

import java.util.ArrayList;

public class Professor {

    public int id;
    public static ArrayList<Professor> professorList = new ArrayList<>();
    public int personID;
    public int majorID;
    static int professorIDCreate = 1;

    public Professor(int personID, int majorID)
    {
        id = professorIDCreate;

        professorList.add(this);

        this.personID = personID;
        this.majorID = majorID;

        professorIDCreate ++ ;

    }

    public static Professor findByID(int id)
    {
        for(Professor professor: professorList)
        {
            if(professor.id == id)
            {
                return professor;
            }
        }
        return null;
    }
}
