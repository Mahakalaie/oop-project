package uni;

//import base.Person;
//import uni.Major;
import java.util.ArrayList;

public class Student {

    public int id;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public int personID;
    public final int entranceYear;
    public int majorID;
    public String studentID;
    static int studentIDCreate = 1;

    public Student(int personID, int entranceYear, int majorID)
    {
        id = studentIDCreate;

        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;

        Major studentMajor = Major.findByID(majorID);
        studentMajor.numberOfStudents++ ;

        setStudentCode();

        studentIDCreate++ ;

        studentList.add(this);
    }

    public static Student findByID(int id)
    {
        for(Student student: studentList)
        {
            if(student.id == id)
            {
                return student;
            }
        }
        return null;
    }

    public void setStudentCode()
    {
        int entranceYearCode;
        String studentIDStr;
        String entranceYearStr;
        String majorIDStr;

        if(entranceYear >= 1400)
            entranceYearCode = entranceYear % 1000;
        else
            entranceYearCode = entranceYear % 100;

        entranceYearStr = String.valueOf(entranceYearCode);

        if(majorID / 10 == 0)
            majorIDStr = "0" + String.valueOf(majorID);
        else
            majorIDStr = String.valueOf(majorID);

        if(studentIDCreate / 10 == 0)
            studentIDStr = "0" + String.valueOf(studentIDCreate);
        else
            studentIDStr = String.valueOf(studentIDCreate);

        studentID = entranceYearStr + majorIDStr + studentIDStr;
    }

}
