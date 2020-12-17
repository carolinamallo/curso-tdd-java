public class FizzBuzz {
    public String[] execute() {
        String[] result = new String[100];

        for(int i = 1; i< 100; i++){

            result[i] = Integer.toString(i);

            if(i%3 == 0 || Integer.toString(i).contains("3")){
                result[i] = "Fizz";
            }
            if(i%5 == 0 || Integer.toString(i).contains("5")){
                if(result[i].equals("Fizz")){
                    result[i] += "Buzz";
                }
                else {
                    result[i] = "Buzz";
                }
            }
        }
        return result;
    }
}
