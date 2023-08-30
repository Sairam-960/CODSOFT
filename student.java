import java.util.*;
public class student {

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("enter the number of subjects");
        int subjects = sc.nextInt();
        int[] a = new int[subjects];
        int sum=0;
        for(int i=0; i<subjects; i++)
        {
            System.out.println("enter the marks (out of 100)) subject");
            marks=sc.nextInt();
            a[i]=marks;
            sum=sum+a[i];
        }
        System.out.println("total marks obtained in all subjects: "+Integer.toString(sum));
        float average = sum/subjects;
        System.out.println("average obtained: "+Float.toString(average));
        if (average >= 92.0)
        {
            System.out.println("Grade A+");
        }
        else if (average >= 82.0)
        {
            System.out.println("Grade A");
        }
        else if (average >= 72.0)
        {
            System.out.println("Grade B+");
        }
        else if (average >= 62.0)
        {
            System.out.println("Grade B");
        }
        else if (average >= 52.0)
        {
            System.out.println("Grade c");
        }
        else if (average >= 40.0)
        {
            System.out.println("Grade D");
        }
        else 
        {
            System.out.println("Grade F");
        }
       
    }
}
