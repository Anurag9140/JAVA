import java.util.Scanner;

public class problems_cond{
    public static void main(String args[]){

        // PROGRAMM FOR INPUT USERNAME AND PASSWORD
        Scanner sc=new Scanner(System.in);
String correctuser="anurag4444";
String correctpass="mafiya4444";

int attempts=4;
while(attempts>0){
    System.out.println("Enter username:");
   String username=sc.nextLine();

   System.out.println("Enter Password:");
   String password=sc.nextLine();

   if(username.equals(correctuser) && password.equals(correctpass)){
    System.out.println("Welcome,"+username);
    break;
   }else{
    attempts--;
    if(attempts>0){
        System.out.println("Incorrect username!you have "+attempts+"attempts left");
    }else{
        System.out.println("MAA CHUDAO!YOUR ACCOUNT HAS LOCKED");
    }
   }
}

// PROGRAM TO CHECK WHETHER A YEAR IS A LEAP YEAR OR NOT

// String correctuser="anurag9140";
// String correctpass="password12";

int attempt=3;
Scanner sc=new Scanner(System.in);
while(attempt>0){
    System.out.println("Enter your fucking username: ");
    String username=sc.nextLine();

    System.out.println("Enter your fucking password:");
    String password=sc.nextLine();

    if(username.equals(correctuser) && password.equals(password) ){
        System.out.println("Welcome;"+username);
        break;
    }else{
        attempt--;
        if(attempt>0){
            System.out.println("Your entery is incorrecr.You have "+attempt+"attempts left.");
        }else{
            System.out.println("We have locked your profile.MAA CHUDAO");
        }
    }
    
}

}

}
