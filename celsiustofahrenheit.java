import java.util.Scanner;
class celsiustofahrenheit{
    public static void main(String args[]){
        Scanner ha = new Scanner(System.in);
        Double celsius,fahrenheit;
        System.out.println("Enter your value in FAHRENHEIT");
        fahrenheit=ha.nextDouble();
        celsius=(fahrenheit-32)/9*5;
        System.out.println("The given temperature in celsius is "+ celsius);
    }
}
        
        
        