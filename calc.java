import java.util.Scanner;
class calc{
public static void main(String args[]){
    int a,b,c;
    Scanner aaron=new Scanner(System.in);
    System.out.println("Please enter a number");
    a=aaron.nextInt();
    System.out.println("Please enter another number");
    b=aaron.nextInt();
    c=a+b;
    System.out.println("The addition of the two entered numbers is " + c);
}
}