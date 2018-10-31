package CT_417_PartB.assignment1B;

import CT_417.Assignment_1.CourseProgramme;
import CT_417.Assignment_1.student;
import CT_417.Assignment_1.Module;





public class driver {
   
        public static void main( String[] args )
        {
            //System.out.println( "Hello World!" );
            
            student Luke = new student("Luke", 21, "05/12/1999"); 
            student Kevin = new student("Kevin", 20, "01/05/2000");
            student Paddy = new student("Paddy", 22, "02/03/2003");
            student Dave = new student("Dave", 14, "01/07/2004");

            
            Module CT = new Module("Software Engineering", "ct417" );
            CT.AddStudents(Luke);
            CT.AddStudents(Kevin);
            CT.AddStudents(Paddy);
            CT.AddStudents(Dave);
            
            Module EE = new Module("Circuits & Systems", "EE454");
            EE.AddStudents(Luke);
            EE.AddStudents(Paddy);
            EE.AddStudents(Dave);
            
            
            CourseProgramme BP4 = new CourseProgramme("BP4");
            BP4.AddModules(CT);
            BP4.AddModules(EE);
            
            
            	//System.out.println("UserName = " + Luke.getUsername());
            	System.out.println("BP4 Modules = " + BP4.getModules());
            	
            	System.out.println("Circuits & Systems students = " +EE.getStudents());
            	System.out.println("Software Engineering students = " +CT.getStudents());
            	System.out.print("Usernames: " + Luke.getUsername()+" " +Kevin.getUsername()+" "+Paddy.getUsername()+" "+Dave.getUsername());
            	//System.out.print(Luke.module.getModuleID());     
            
            
            
            
            
            
            
            
        }
    }
