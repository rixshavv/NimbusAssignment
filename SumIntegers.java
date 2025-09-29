import java.util.ArrayList;
import java.util.Scanner;

public class SumIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter integers separated by space:");
        String[] inputs = sc.nextLine().split(" ");
        for (String str : inputs) {
            numbers.add(Integer.parseInt(str));
        }
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("Total Sum: " + sum);
    }
}