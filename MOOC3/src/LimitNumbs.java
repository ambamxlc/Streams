import java.util.ArrayList;
import java.util.Scanner;

public class LimitNumbs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();

        System.out.println("write pos numbers out one at a time, then a neg number when finished ");

        while (true) {
            int input = Integer.valueOf(in.nextLine());
            if (input < 0) {
                break;
            }
            inputs.add(input);
        }

        System.out.println("numbs yio selected between 1 and 5-");
        inputs.stream()
            .filter(num -> num > 0 && num < 6)
            .forEach(num -> System.out.println(num));

        in.close();
    }
}