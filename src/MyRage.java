import java.util.ArrayList;
import java.util.List;

public class MyRage {
    private final String input;

    public MyRage(String input) {
        this.input = input;
    }

    public boolean checkStartWithInclude() {
        return input.startsWith("[");
    }


    public int getFistNumber() {
        int firstNumber = Integer.parseInt(String.valueOf(input.charAt(1)));
        if(checkStartWithInclude()){
            return firstNumber;
        }
        return firstNumber + 1;
    }

    public boolean checkEndWithInclude() {
        return input.endsWith("]");
    }

    public int getSecondNumber() {
        int secondNumber = Integer.parseInt(String.valueOf(input.charAt(3)));
        if(checkEndWithInclude()){
            return secondNumber;
        }
        return secondNumber - 1;
    }

    public String getResult() {
        int firstNumber = getFistNumber();
        int secondNumber = getSecondNumber();
//        String result = "";
        List<String> results = new ArrayList<>();
        for (int i = firstNumber; i <= secondNumber ; i++) {
//            result += i;
//            if(i != secondNumber){
//                result += ",";
//            }
            results.add(String.valueOf(i));
        }

//        return result;
        return String.join(",", results);
    }

//    public static void main(String[] args) {
//        String params = args[0];
//        Character firstParam = params.charAt(0);
//        Character lastParam = params.charAt(4);
//
//        Character firstNumber = params.charAt(1);
//        Character lastNumber = params.charAt(3);
//
//        Integer num_from = Integer.parseInt(String.valueOf(firstNumber));
//        Integer num_to = Integer.parseInt(String.valueOf(lastNumber));
//
//        Character notInclude_from = '(';
//        Character notInclude_to = ')';
//
//        if(notInclude_from.equals(firstParam)){
//            num_from = num_from + 1;
//        }
//
//        if(notInclude_to.equals(lastParam)){
//            num_to = num_to - 1;
//        }
//
//        for (int i = num_from; i <= num_to; i++) {
//            System.out.print(i);
//            if(i != num_to){
//                System.out.print(",");
//            }
//        }
//
//    }
}
