package operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static validations.validateNumber.distinctValues;

public class duplicateNumber {

    public static HashMap<Integer, Boolean> duplicateControl (int number){

        int integerValue = number * 2;
        HashMap<Integer, Boolean> response = new HashMap<>();

        int controlNumberFour = number;
        int controlNumberFive = integerValue;
        String strFour = Integer.toString(controlNumberFour);
        String strFive = Integer.toString(controlNumberFive);
        int dimFour = strFour.length();
        int dimFive = strFive.length();
        List<Integer> arrFour = new ArrayList<>();
        List<Integer> arrFive = new ArrayList<>();

        for (int i = 0; i < dimFour; i++) {
            int power = (int) Math.round(Math.pow(10, dimFour - i - 1));
            arrFour.add(controlNumberFour / power);
            controlNumberFour = controlNumberFour - arrFour.get(i) * power;
        }

        for (int i = 0; i < dimFive; i++) {
            int power = (int) Math.round(Math.pow(10, dimFive - i - 1));
            arrFive.add(controlNumberFive / power);
            controlNumberFive = controlNumberFive - arrFive.get(i) * power;
        }

        boolean booleanKey = distinctValues(integerValue) && (arrFour.get(3) < arrFive.get(2));

        response.put(integerValue, booleanKey);

        return response;

    }

}


