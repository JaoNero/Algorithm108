import java.util.Scanner;

public class M1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("กรุณาใส่ปีเกิดของคุณ (Please enter your birth year): ");
        int birthYear = input.nextInt();

        System.out.print("ค.ศ.ปัจจุบัน (Current year): ");
        int currentYear = input.nextInt();

        int age = currentYear - birthYear;

        System.out.println("คุณอายุ " + age + " ปี");

        input.close();
    }
}