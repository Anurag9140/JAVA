// INCOME TAX CALCULATOR
import java.util.*;
public class ifelse_ques {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int income =sc.nextInt();
     int tax;
    if(income<500000){
        tax=0;

    }
    else if(income>=500000 && income<1000000){
        tax=(int)(income * 0.2);

    }
    else{
        tax=(int)(income*0.3);
    }
    System.out.println("Your tax is:" + tax);
   
// PRINT THE LARGEST OF 3
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b){
        System.out.println("The largest number is :"+ a);
    }
    else if(a<b && b>c){
    System.out.println("The largest number is "+ b);
    }
    else {
        System.out.println("The largest number is "+ c);
    }     
    // TERNARY OPERATOR
    int marks=sc.nextInt();
    String status=marks>=33 ? "pass":"fail";
    System.out.println(status);
    

}
    
}


