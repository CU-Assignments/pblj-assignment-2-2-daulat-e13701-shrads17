import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxing {

    public static List<Integer> convertToIntegerList(String[] numbers) {
        List<Integer> intList = new ArrayList<>();
        for (String num : numbers) {
            intList.add(Integer.parseInt(num));
        }
        return intList;
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] strNumbers = { "40", "10", "20", "20", "60" };

        List<Integer> integerList = convertToIntegerList(strNumbers);

        int sum = calculateSum(integerList);

        System.out.println("Sum of numbers: " + sum);
    }
}