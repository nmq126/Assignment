package AssignmentADF1.util;

import java.util.Arrays;

public class Validator {
    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            System.err.println("Error! Please enter an INTEGER");
        }
        return false;
    }
    public static boolean isOfStatusValue(String str){
        String arr[] = {"0", "1", "2"};
        if (!Arrays.asList(arr).contains(str)){
            System.err.println("Please enter 0/1/2 only");
            return false;
        }
        return true;
    }
    public static boolean maxLength(String str, int length) {
        if (str.length() > length) {
            System.err.println("Error! Maximum length is " + length);
            return false;
        }
        return true;
    }

    public static boolean isEmpty(String str) {
        if (str.trim().isEmpty()) {
            System.err.println("Error! Please enter something");
            return true;
        }
        return false;
    }
}
