package StudentRegistration;

/*
 * CAROLINE RICHARDSON
 * 13358846
 * 4BCT
 * 
 */

import java.util.ArrayList;
import org.joda.time.DateTime;
	

//Course Name (CS & IT or ECE, etc), List of modules, Academic Start date and End dates
public class CourseProgramme 
{
	    
	private String courseName;
    private DateTime startDate;
    private DateTime endDate;
    private ArrayList<Module> modules;

    
    public CourseProgramme(String name, DateTime start, DateTime end)
    {
        this.courseName = name;
        this.startDate = start;
        this.endDate = end;
        modules = new ArrayList<Module>();
        
    }
    
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    
    public void addModule(Module m)
    {
        modules.add(m);
    }

    public void setStartDate(DateTime start) 
    {
        this.startDate = start;
    }
    
    public DateTime getStartDate() 
    {
        return startDate;
    }

    public void setEndDate(DateTime end) 
    {
        this.endDate = end;
    }
    
    public DateTime getEndDate() 
    {
        return endDate;
    }

    public void setModules(ArrayList<Module> modules) 
    {
        this.modules = modules;
    }


    public ArrayList<Module> getModules() 
    {
        return modules;
    }
    
    
    
    public void printCourseDetails()
    {
    	
    	//course details
    	System.out.println("------------------------------------------------------------");
        System.out.println("Course: " + this.courseName + "\n" + "Start date: " + this.startDate + "\n" + "End Date: " + this.endDate + "\n");
        
        for(Module m : modules) 
        {
           
        	//module details
        	System.out.println(m.toString());
        	
            ArrayList<Student> students = m.getStudents();
            
            for(Student s : students) 
            {
            	//students in module
            	System.out.println(s.toString());
            }
            
        }
        
        
    }
	
	
	
}
