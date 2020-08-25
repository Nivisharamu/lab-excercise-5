package labexe5;

import java.util.Scanner;

public class money {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
      
        {
            System.out.println("ENTER ANY NUMBER FROM 1 TO 3");
              int e=obj.nextInt();
        switch(e)
        {             
            case 1:
            {
                System.out.println("AMOUNT IN BANK A:");
                BankA b1=new BankA();
                System.out.println(b1.getbalance());
                break;
            }
            case 2:
            {
                
                System.out.println("AMOUNT IN BANK B:");
                BankB b2=new BankB();
                System.out.println(b2.getbalance()); 
                break;
            }
            case 3:
            {
                System.out.println("AMOUNT IN BANK C:");
                BankC b3=new BankC();
                System.out.println(b3.getbalance());
                break;
            }
            default:
            {
                System.out.println("ENTER BANK A or B or C");
                break;
            }
        }
            }
    }
}
class Bank
{
     

    int getbalance()
    {
        return 0;
    }
}
class BankA extends Bank
{
    
    int getbalance()
    {
        return 1000;
    }
}
class BankB extends Bank
{
    @Override
    int getbalance()
    {
        return 1500;
    }
}
class BankC extends Bank
{
    @Override
    int getbalance()
    {
        return 2000;
    }
}

