import java.util.Scanner;
public class Repetitions {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();
        int best = 0;
        int current = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                if (current > best) {
                    best = current;
                } 
                current = 0;
            }
            current++;
        }
        if (current > best) {
            best = current;
        }  
        System.out.println(best);
    }
}
