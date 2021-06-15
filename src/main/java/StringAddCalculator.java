import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public int splitAndSum(String str) throws RuntimeException {
        String[] numbers;
        if(str == null || str.isEmpty()) return 0;
        numbers = str.split(",|:");
        
        if(str.startsWith("//")) {
            numbers = makeString(str);
        }

        return StringToIntSum(numbers);

    }
    
    public String[] makeString(String str) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(str);
        String[] num = new String[0];
        if (m.find()) {
            String customDelimiter = m.group(1);
            num = m.group(2).split(customDelimiter);
        }
        return num;
    }

    public int StringToIntSum(String[] numbers) {
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            int num = Integer.parseInt(numbers[i]);
            if(num < 0) {
                throw new RuntimeException();
            }
            sum += num;
        }
        return sum;
    }
}
