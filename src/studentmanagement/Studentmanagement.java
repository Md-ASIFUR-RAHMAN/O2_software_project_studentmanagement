
package studentmanagement;
import studentmanagement.mysql;
import studentmanagement.insert;
import studentmanagement.delete;
import studentmanagement.update;
import java.util.Scanner;

public class Studentmanagement {
Scanner sc = null;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
while(1>0)
{
    
    System.out.println("1.Display \n");
        System.out.println("2.Insert \n");
            System.out.println("3.Delete \n");
                System.out.println("4.Update \n");
                    System.out.println("5.Exit \n");
                    
    System.out.println("Press Number :  ");                
    int n = sc.nextInt();
    if(n == 1)
    {
        mysql db = new mysql();
        db.readata();
    }
    if(n == 2)
    {
        insert in = new insert();
        in.insertt();
    }
    if(n == 3)
    {
        delete de = new delete();
        de.deletee();
    }   
            
    if(n == 4)
    {
        update up = new update();
        up.updatee();
    }
    if(n == 5)
    {
         break;

    }

        

       
    }
   }
    
}
