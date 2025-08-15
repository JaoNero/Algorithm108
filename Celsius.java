import java.util.Scanner;
public class Celsius{
    public static void main(String[] ares){
        Scanner SC = new Scanner(System.in);

        System.out.println("ใส่ fahrenheit ");
        double fahrenheit = SC.nextDouble();

        double celsius = (5.0f/9.0f)*(fahrenheit-32.0f);
        System.out.println("Your celsius : "+celsius);
    }
}