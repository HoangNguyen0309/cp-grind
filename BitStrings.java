import java.util.Scanner;
import java.lang.Math;
public class BitStrings {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long input = myObj.nextLong();
        System.out.println( (Math.pow(2, input) % (Math.pow(10, 9) + 7)));
    }
}