package DataProvider;

public class Conversion {

    public static String makeIntegerWithoutDecimal(String number)
    {
        String convertedNumber=number;

        try
        {
            int i = Integer.parseInt(number);
            convertedNumber = ""+i;
        }
        catch (Exception e)
        {

        }


        return  convertedNumber;
    }
}
