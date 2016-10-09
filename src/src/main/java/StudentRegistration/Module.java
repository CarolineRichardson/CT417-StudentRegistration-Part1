package StudentRegistration;

/*
 * CAROLINE RICHARDSON
 * 13358846
 * 4BCT
 * 
 */


import java.util.ArrayList;

//Module Name, ID, List of students
public class Module 
{

    private String moduleName;
    private String moduleID;
    private String moduleDetails;

    private ArrayList<Student> students;
   
    
    //constructor
    public Module(String name, String id)
    {
        this.moduleName = name;
        this.moduleID = id;    
        this.students = new ArrayList<Student>();
    }
    
    
    public void setMoudleName(String moudleName) 
    {
        this.moduleName = moudleName;
    }
    
    public void setModuleID(String moduleID) 
    {
        this.moduleID = moduleID;
    }
    
    public void registerStudent(Student s)
    {
        students.add(s);
    }
    
    public String getMoudleName() 
    {
        return moduleName;
    }

    public String getModuleID() 
    {
        return moduleID;
    }
    
    public ArrayList<Student> getStudents() 
    {
        return students;
    }
	
    public String toString()
    {
        return moduleDetails = "Module: " + this.moduleName + "\n" + "ID: " + this.moduleID + "\n";
        
    }
	
}
