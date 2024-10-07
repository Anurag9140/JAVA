import java.util.*;
public class conditional{
    public static void main(String[] args) {
        int age=23;
        if(age>=18){
            System.out.println("Adult:Can vote");
        
        }
        else{
            System.out.println("Not Adult");
        }

        int a=10;
        int b=4;
        if(a>b){
            System.out.println("a is larger than 2");
        }
        else{
            System.out.println("b is larger than 2");
        }
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        
        if(number%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}