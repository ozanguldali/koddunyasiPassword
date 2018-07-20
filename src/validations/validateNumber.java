package validations;

import java.util.ArrayList;
import java.util.List;

public class validateNumber {

    public static boolean distinctValues(int number){

        String strN = Integer.toString(number);
        int dim = strN.length();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < dim; i++) {
            int power = (int) Math.round(Math.pow(10, dim - i - 1));
            arr.add(number / power);
            number = number - arr.get(i) * power;
        }
        if ( arr.contains(0) )
            return false;
        else {
            for (int i = 0; i < arr.size() - 1; i++) {
                for (int j = i + 1; j < arr.size(); j++) {
                    if (arr.get(i).equals(arr.get(j))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

}
