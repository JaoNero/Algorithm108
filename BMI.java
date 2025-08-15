import java.util.Scanner;
public class BMI{
    public static void main(String[] ares){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ใส่น้ำหนัก");
        float weight = scanner.nextFloat();

        System.out.println("ใส่ความสูง");
        float height = scanner.nextFloat();

        float BMI = weight/(height*height);
        System.out.println("Your BMI for weight = "+weight+" kg and height = "+height+" meters is : "+BMI+" bmi.");

    }
}