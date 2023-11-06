package codsoftTask2;

import java.util.*;

public class StudentGradeCalaculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Subjects:");
        int numpercentage=sc.nextInt();
        int[] grade=new int[numpercentage];
        for(int i=0;i<numpercentage;i++){
            System.out.println("Enter the grades"+(i+1)+":");
            grade[i]=sc.nextInt();
        }
        sc.close();
        int total=0;
        for(int i=0;i<numpercentage;i++){
            total+=grade[i];

        }
        double average=(double) total/numpercentage;
        int sum=(int)total;
        System.out.println("Total marks obtained by students:"+sum);
        System.out.println("Average percentage obtained by students:"+average);
        if(average>=95)
            System.out.println("Grade:A+ \n Excellent performance");
        else if(average>=90)
                System.out.println("Grade:A");
        else if(average>=80)
                System.out.println("Grade:B");
        else if(average>=70)
                 System.out.println("Grade:C");
        else if(average>=60)
               System.out.println("Grade:D");
        else if(average>=50)
        System.out.println("Grade:E");
        else
        System.out.println("Grade: \n You are Fail!");
    }
}


