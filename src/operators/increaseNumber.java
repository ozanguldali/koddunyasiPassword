package operators;

import java.util.ArrayList;
import java.util.List;

import static validations.validateNumber.distinctValues;

public class increaseNumber {

    public static int increaseControl ( int initialN, int finalN ) {

        int number = initialN;

        while ( number+1 <= finalN ) {

            number = number + 1;
            int controlNumber = number;
            String strN = Integer.toString(controlNumber);
            int dim = strN.length();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < dim; i++) {
                int power = (int) Math.round(Math.pow(10, dim - i - 1));
                arr.add(controlNumber / power);
                controlNumber = controlNumber - arr.get(i) * power;
            }

            if ( distinctValues(number) && (arr.get(3) > arr.get(0)) ) {
                return number;
            }

        }

        return number;

    }

}
