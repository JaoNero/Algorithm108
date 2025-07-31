import java.util.Scanner;

public class M4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("กรอกความยาว (Enter length): ");
        double length = input.nextDouble();

        System.out.print("กรอกความกว้าง (Enter width): ");
        double width = input.nextDouble();

        double area = length * width;

        System.out.println("พื้นที่สี่เหลี่ยมผืนผ้า = " + area);

    }
}