import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public String[] execute() {
        String[] result = new String[100];
//        var resultList = new ArrayList<>();

        for(int i = 1; i< 100; i++){
            result[i] = Integer.toString(i);
//            resultList.add(String.valueOf(i));
//            var number = "";

            if(i%3 == 0 || Integer.toString(i).contains("3")){
                result[i] = "Fizz";
//                resultList.add("Fizz");
//                number += "Fizz";
            }
            if(i%5 == 0 || Integer.toString(i).contains("5")){
                if(result[i].equals("Fizz")){
                    result[i] += "Buzz";
                }
                else {
                    result[i] = "Buzz";
//                    resultList.add(String.valueOf(i));
//                    resultList.add(result[i].isEmpty() ? String.valueOf(i) : i);
                }
            }
        }
        return result;
    }
}
