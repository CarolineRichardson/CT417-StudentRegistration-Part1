package StudentRegistration;

/*
 * CAROLINE RICHARDSON
 * 13358846
 * 4BCT
 * 
 */

import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;


public class UsernameTest 
{
	   
     @Test
     public void getUsername() 
     {
	     Student s = new Student("Caz", 21, new DateTime("1995-04-19"));
	     assertEquals("Caz21", s.getUsername());
     }
     
     
}

