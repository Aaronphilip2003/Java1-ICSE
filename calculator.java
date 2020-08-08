import java.util.Scanner;
class calculator{
    public static void main(String args[]){
        int num1,num2,answer;
        Scanner aaron=new Scanner(System.in);
        System.out.println("Enter a number");
        num1=aaron.nextInt();
        System.out.println("Enter another number");
        num2=aaron.nextInt();
        answer=num1+num2;
        System.out.println("The sum of the following is " + answer);
    }
}
       
        
