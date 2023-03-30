package lines;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lines3 {
    public static void main(String[] args) {
        String val = "ahb acb aeb aeeb adcb axeb";
        Pattern pattern = Pattern.compile("a\\wb");
        Matcher matcher = pattern.matcher(val);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
