package base;

import java.util.ArrayList;

public class Person {
    public int id;
    public static ArrayList<Person> personList = new ArrayList<>();
    public String name;
    public String nationalID;
    static int personIDCreate = 1;

    public Person(String name, String nationalID)
    {
        this.name = name;
        this.nationalID = nationalID;
        id = personIDCreate;
        personIDCreate++;
        personList.add(this);
        //in doroste?
    }

    public static Person findByID(int id)
    {
        for(Person person: personList)
        {
            if(person.id == id)
            {
                return person;
            }
        }
        return null;
    }
}
