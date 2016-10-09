package StudentRegistration;

/*
 * CAROLINE RICHARDSON
 * 13358846
 * 4BCT
 * 
 */

import org.joda.time.*;


//student - Name, Age, DOB, ID, username 
public class Student 
{

	//variables
    private String name;
    private int age;
    private DateTime dob;
    private int id;
    static int sid = 100;
    private String username;
    private String studentDetails;


    //constructor
    public Student(String name, int age, DateTime dob)
    {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = sid++;
        this.setUsername();
                       
    }
    
   
    public void setName(String name) 
    {
        this.name = name;
    }
    
    public void setAge(int age) 
    {
        this.age = age;
    }
    
    public void setDob(DateTime dob) 
    {
        this.dob = dob;
    }
    
    public void setID (int sid) 
    {
        this.id = sid;
     }
    
    public String setUsername() 
    {
        this.username = this.name + Integer.toString(this.age);
        return this.username;
    }
    
    
    public String getName() 
    {
        return name;
    }
    
    public int getAge() 
    {
        return age;
    }

    public DateTime getDob() 
    {
        return dob;
    }

    public String getUsername() 
    {
        return username;
    }

    public int getId() 
    {
        return sid;
    }
    
    
    public String toString()
    {
        return studentDetails = "Student: " + this.name + "\n" + "Age: " + this.age + "\n" + "DOB: " + this.dob + "\n" + "ID: " + this.id + "\n";
   
    }
    
	
}
