import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter the number according to your use: ");
        System.out.println("press: 1 for addition");
        System.out.println("press: 2 for subtraction");
        System.out.println("press: 3 for division");
        System.out.println("press: 4 for multiplication");
         int num0 = num.nextInt();
       if(num0==1){
           System.out.println("press the 1st number:");
        int num1 = num.nextInt();
           System.out.println("press the 2nd number:");
           int num2 = num.nextInt();
           System.out.println(num1+num2);
       }
       else if(num0==2){
            System.out.println("press the 1st number:");
            int num1 = num.nextInt();
            System.out.println("press the 2nd number");
            int num2 = num.nextInt();
            System.out.println(num1-num2);
        }
       else if(num0==3){
            System.out.println("enter the 1st number: ");
            int num1 = num.nextInt();
            System.out.println("Enter the 2nd number: ");
            int num2 = num.nextInt();
            System.out.println(num1/num2);
        }
       else if(num0==4){
           System.out.println("Enter the 1st number: ");
            int num1 = num.nextInt();
            System.out.println("Enter the 2nd number: ");
            int num2 = num.nextInt();
            System.out.println(num1*num2);
        }

         }
    }
