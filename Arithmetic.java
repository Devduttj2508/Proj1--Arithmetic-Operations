import java.util.Scanner;

public class Arithmetic{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a :- ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b :- ");
        int b=sc.nextInt();
        System.out.println("Please choose one  operation :- ");
        System.out.println("1. Addition");
        System.out.println("2. Subtrction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choose= sc.nextInt();
        switch(choose){
            case 1:{
               int c=a+b;
               System.out.println("Addition :- " +c);
               //int add=Addition(a,b);
               break;
            }
            case 2:{
                int c=a-b;
                System.out.println("Subtraction:- " +c);
                break;
            }
            case 3:{
                int c=a*b;
                System.out.println("Multiplication:- " +c);
                break;
            }
            case 4:{
                int c=a/b;
                System.out.println("Division :- " +c);
                break;
            }
            default:{
                System.out.println("Invalid options");
                break;
            }
        }//swtich
    }
}