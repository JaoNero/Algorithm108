import java.util.Scanner;
public class BodySurfaceArea{
    public static void main(String[] ares){
        Scanner input = new Scanner(System.in);

        System.out.println("ใส่ความกว้าง");
        float width = input.nextFloat();

        System.out.println("ใส๋ความยาว");
        float length = input.nextFloat();

        float Area = (width*length)/360;
        System.out.println("Your body surface area for width = "+width+" cm. and length = "+length+" cm. is : "+Area+" cm.");
    }
}