import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    long input = myObj.nextLong();
    myObj.nextLine();
    String input2 = myObj.nextLine();
    String[] bruh = input2.split("\\s+");
    long[] bruh2 = new long[bruh.length];
    for(int i = 0;i < bruh.length; i++) {
        bruh2[i] = Integer.parseInt(bruh[i]);
    }
    long moves = 0;
    for (int i = 1; i < input; i++) {
        if (bruh2[i] < bruh2[i - 1]) {
            long cuck = bruh2[i - 1] - bruh2[i];
            //System.out.println(cuck);
            bruh2[i] = bruh2[i] + cuck;
            //System.out.println(bruh[i]);
            moves = moves + cuck;
        }
    }
    System.out.println(moves);
}
}
