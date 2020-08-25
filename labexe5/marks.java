package labexe5;

import java.util.Scanner;

public class marks {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of n:"); 
        int n=obj.nextInt();

    for(int i=0;i<n;i++)
    {
       sports s=new sports();
       System.out.println(s);
    }
      
    }
}
class student
{
   
    String name;
    String rollno;
    
    student()
    {
      Scanner obj=new Scanner(System.in);
      name=obj.next();
      rollno=obj.next();
    }
  
    
   
}

class result  extends student
{ 
    int mark1,mark2,mark3;
  
    result()
    {
      super();  
    Scanner obj=new Scanner(System.in);
    mark1=obj.nextInt();
    mark2=obj.nextInt();
    mark3=obj.nextInt();
    }
   
    
  
 
    }

class sports extends result
{
   int sm;
   int a;
   
   
    sports()
    {
        super();
       
        Scanner obj=new Scanner(System.in);
        sm=obj.nextInt();
        
          a=mark1+mark2+mark3;
           System.out.println("\nGrade:");
          
         if(a>75)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
         
    @Override
   public String toString()
   {
       return  "\nName:"+name+"\nRollno:"+rollno+"\nMark1:"+mark1+"\nMark2:"+mark2+"\nMark3:"+mark3+"\nSportsmarks:"+sm;
   }
   
    
}
