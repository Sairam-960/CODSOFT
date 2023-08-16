import java.io.ObjectInputFilter.Status;
import java.util.Scanner;
public class Atm
{
    Scanner sc=new Scanner(System.in);
    int bal=10000;
    int withdral=0;
    int diposit=0;
    public void withdral()
    {
        System.out.println("entre the amount"); 
        withdral=sc.nextInt();
        if(withdral > bal)
        {            
            System.out.println("insuffent bal");
        }
        else
        {
           System.out.println("success paynebt");
           bal=bal-withdral;
        }
    }
    public void diposit()
    {
        System.out.println("Enter the diposit amount");
        int amount=sc.nextInt();
        bal=bal+amount;
    }
    public void bal()
    {
        System.out.println(bal);
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Atm ob=new Atm();
        boolean s=true;
        int pin=1234;
    int pin2;
    System.out.println("Enter the pin");
    pin2=sc.nextInt();
    if(pin==pin2)
    {
        while(s)
        {
            System.out.println("welcome to atm");
            System.out.println("enter the choice\n1.withdral\n2.diposit\n3.bal");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                        ob.withdral();
                        break;
                case 2:
                    ob.diposit();
                    break;
                case 3:
                    ob.bal();
                    break;
                default:
                    System.out.println("invalid input");
            }
            System.out.println("enter true to con or false to exit");
            s=sc.nextBoolean();
        }
    }
    }

}