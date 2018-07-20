import java.util.HashMap;

import static operators.increaseNumber.increaseControl;
import static operators.duplicateNumber.duplicateControl;
import static operators.parseNumber.parseControl;
import static validations.validateNumber.distinctValues;

public class Main {

    public static void main (String[] args) {
        boolean goIncrease = false;
        boolean finishProcess = false;
//        int initialFirstFour = 5617;
        int initialFirstFour = 1000;
//        int finalFirstFour = 9876;
        int finalFirstFour = 9999;

        int firstFour = initialFirstFour;
        
        while ( firstFour < finalFirstFour && !finishProcess ) {
            boolean isDoneDuplicate;
            boolean isDoneParse;

            if ( !goIncrease && distinctValues(firstFour) ) {

                HashMap<Integer, Boolean> duplicateMap = duplicateControl(firstFour);
                isDoneDuplicate = duplicateMap.get(firstFour *2);

                if ( isDoneDuplicate ) {
                    int lastFive = firstFour * 2;
                    int fullPassword = firstFour * 100000 + lastFive;
                    isDoneParse = parseControl(fullPassword);

                    if (isDoneParse && distinctValues(fullPassword)) {
                        System.out.println("\nThe password is:\t" + fullPassword);
                        finishProcess = true;
                    } else
                        goIncrease = true;

                } else
                    goIncrease = true;

            } else {

                firstFour = increaseControl(firstFour, finalFirstFour );
                goIncrease = false;

            }

        }

    }

}
