import java.util.ArrayList;
import java.util.Scanner;
 
public class AvgofSelNums {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("enter some numbers one at a time, then write \"end\" when finished ");
        ArrayList<String> values = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            values.add(input);
        }
        System.out.println("for avg of the pos numbers, write letter p. for avg of neg numbers, write letter n and then enter ");
        String sign = scanner.nextLine();
        double average = 0.0;
        
        if (sign.equals("n")) {
            average = values.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number < 0)
                        .average()
                        .getAsDouble();
            System.out.println("neg numbs avg is-" + average);
        } else {
            average = values.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number > 0)
                        .average()
                        .getAsDouble();
            System.out.println("pos numbs avg is-" + average);
        }
    }
}