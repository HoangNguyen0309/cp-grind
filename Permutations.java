import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long input = myObj.nextInt();
        if (input == 1) {
            System.out.println("1");
        } else if (input < 4) {
            System.out.println("NO SOLUTION");
        } else if (input == 4) {
            System.out.println("2 4 1 3");
        } else {
            String result = "";
            for (long i = 1; i <= input; i+=2) {
                result = result + i + " ";
            }
            for (long i = 2; i <= input; i+=2) {
                result = result + i;
                if (i + 2 <= input) {
                    result = result + " ";
                } else {
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
