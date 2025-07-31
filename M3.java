import java.util.Scanner;

public class M3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ป้อนตัวเลข");

        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out. println(number + " เป็นเลขคู่");
        } else {
            System.out. println(number + " เป็นเลขคี่");
        }
    }
}