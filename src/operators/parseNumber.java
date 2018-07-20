package operators;

public class parseNumber {

    public static boolean parseControl (int number) {

        boolean booleanKey;

        String strNumber = Integer.toString(number);

        String strFirstTrio    = strNumber.substring(0,3);
        int firstTrio = Integer.valueOf(strFirstTrio);
        String strSecondTrio   = strNumber.substring(3,6);
        int secondTrio = Integer.valueOf(strSecondTrio);
        String strThirdTrio    = strNumber.substring(6,9);
        int thirdTrio = Integer.valueOf(strThirdTrio);

        booleanKey = ( firstTrio < secondTrio ) && ( secondTrio < thirdTrio );

        return booleanKey;

    }

}
