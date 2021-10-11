import java.util.Scanner;

public class TwoKnights {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long input = myObj.nextLong();
        for (long i = 1; i <= input; i++) {
            long bruh1 = ((i*i * (i*i - 1)) / 2);
            //System.out.println("bruh1 is:" + bruh1);
            long bruh2 = (4*(i-1)*(i-2));
            //System.out.println("bruh2 is:" + bruh2);
            long result = bruh1 - bruh2;
            System.out.println(result);
        }
    }
}
