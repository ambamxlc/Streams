import java.util.ArrayList;
import java.util.Scanner;

public class PrintUserInp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("enter strings then an empty line when done ");

        while (true) {
            String input = in.nextLine();
            if (input.isEmpty()) {
                break;
            }
            inputs.add(input);
        }

        System.out.println("resukt- ");
        inputs.stream()
            .forEach(str -> System.out.println(str));

        in.close();
    }
}