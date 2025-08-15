import java.util.Scanner;
public class NetPay {
    public static void main(String[] ares){
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter your price : ");
        float price = SC.nextFloat();

        System.out.println("Enter your num : ");
        float num = SC.nextFloat();

        System.out.println("Enter your discount : ");
        float discount = SC.nextFloat();

        float total = price*num;
        float discountAmount = discount*num;
        float NetPay = total-discountAmount;
        System.out.println("Enter price of one dress : "+price);
        System.out.println("Enter number of dress to buy : "+num);
        System.out.println("Enter discount rate : "+discount);
        System.out.println(".....................................");
        System.out.println("Total cost = "+total+" Bah");
        System.out.println("discountAmount : "+discountAmount+" Bath");
        System.out.println("Ney Pey : "+NetPay+" Bath");
    }
}