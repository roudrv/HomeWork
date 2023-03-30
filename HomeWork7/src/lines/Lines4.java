package lines;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lines4 {
    public static void main(String[] args) {
        String val = "'ab abab abab abababab abea";
        Pattern pattern = Pattern.compile("(ab)+");
        Matcher matcher = pattern.matcher(val);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
