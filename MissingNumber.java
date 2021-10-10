import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long input = myObj.nextInt();
        myObj.nextLine();
        String input2 = myObj.nextLine();
        String[] bruh = input2.split("\\s+");
        int[] bruh2 = new int[bruh.length];
        for(int i = 0;i < bruh.length; i++) {
            bruh2[i] = Integer.parseInt(bruh[i]);
        }
        long total = (input * (input + 1) ) / 2;
        for (int i = 0; i < bruh.length; i++) {
            total = total - bruh2[i];
        }
        System.out.println(total);
    }
}
