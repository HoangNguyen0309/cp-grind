import java.util.Scanner;
class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long input = myObj.nextInt();
        String result = "";
        while (input != 1) {
            result = result + input + " ";
            if (input % 2 == 0) {
                input = input / 2;
            } else {
                input = input * 3 + 1;
            }
        }
        result = result + "1"; 
        System.out.println(result);
    }
}