public class FizzBuzz {
    public String[] execute() {
        String[] result = new String[100];

        for(int i = 1; i< 100; i++){
            if(i%3 == 0 && i%5 == 0){
                result[i] = "FizzBuzz";
            }
            else if(i%3 == 0){
                result[i] = "Fizz";
            }
            else if(i%5 == 0){
                result[i] = "Buzz";
            }
            else{
                result[i] = Integer.toString(i);
            }
        }
        return result;
    }
}
