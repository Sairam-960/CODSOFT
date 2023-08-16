import java.io.*;
import java.util.Scanner;
public class ATM {
    Scanner sc=new Scanner(System.in);
    int amt=5000;   
    int min_amt=500;
    int w_amt=0;
    int d_amt=0;
    void withdraw(){
        w_amt=sc.nextInt();
        int diff=amt-w_amt;
        while((diff<min_amt)||(w_amt>amt)||(w_amt<0)){
            System.out.println("You cannot give the more than amt and difference in balance is 500 \n So give the input again\n");
            w_amt=sc.nextInt();
            diff=amt-w_amt;

        }
amt=amt-w_amt;
        System.out.println("You have sucessfully withdrawn the money");


    }
    void deposit(){
        System.out.println("You are in the block of deposit");
        d_amt=sc.nextInt();
        amt=amt+d_amt;
        while(d_amt<0){
            System.out.println("you can not give negative amount\nSo give the amount again\n");
            d_amt=sc.nextInt();
            amt=amt+d_amt;
        }

    }
    void display(){
        System.out.println("You have selected withdrawn option\n");
        System.out.println(amt);

    }

}
class Atm
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ATM obj=new ATM();
        boolean status=true;
        int pin1=1234;
        int pin2;
        System.out.println("Enter the pin");
        pin2=s.nextInt();
        if(pin1==pin2){
            while(status){
                System.out.println("Enter the number\n1.Withdraw\n2.Deposit\n3.Display");
                int choice=s.nextInt();
                switch (choice) {
                    case 1:obj.withdraw();break;
                    case 2:obj.deposit();break;
                    case 3:obj.display();break;
                    default:System.out.println("invalid input");break;
                }
                System.out.println("If you want to continue true/false");
                status=s.nextBoolean();

            }
        }
    }
}
