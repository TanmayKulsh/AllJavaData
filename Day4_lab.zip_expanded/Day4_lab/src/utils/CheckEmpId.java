package utils;
import com.app.org.*;
import custom_exception.*;
public class CheckEmpId {
	
/* public static void checkId(int counter,int index) throws WrongEmpId {
        
        if (index<counter && index >=0) {
        return;
        }
        else
            System.out.println("Error:Entered wrong emp id");
            
    }*/
 public static void checkId(int index,Employee list[]) throws WrongEmpId {
     
     if (index<list.length && index >=0 && list[index] != null) {
         System.out.println("Employee Exist");
     return;
     }
     else
         System.out.println("Error:Entered wrong emp id");  
 }
}
