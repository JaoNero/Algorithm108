import java.util.Scanner;

public class M2 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("ปเอนตัวเลขตัวที่ 1 : ");
        double A = input.nextDouble();

        System.out.print("ปเอนตัวเลขตัวที่ 2 : ");
        double B = input.nextDouble();

        double Q = A + B;

        double W = A - B;

        double T = A * B;

        double R;
        if (B !=0) {
            R = A / B;
        } else {
            R = Double.NaN;
            System.out.println("ไม่สามารถหารด้วยศูนย์ได้!");
        }
        System.out.println("ผลบวก:" + Q);
        System.out.println("ผลลบ:" + W);
        System.out.println("ผลคูณ:" + T);
        System.out.println("ผลหาร:" + R);
    }
        
}