import java.util.*;
public class variableassign {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println(avg);

// Quest:2
        int side=sc.nextInt();
        int area=side*side;
        System.out.println(area);

// Quest:3
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total_bill=pencil+pen+eraser;
        System.out.println(total_bill);

// Quest:4
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000 ;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f*b)+(i%c)-(d*s);
        
        System.out.println(result);
        int $ = 24;
        System.out.print($);
    }
}
