import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("a12.12a@codegym.vn");
        emails.add("abc.xyz@codegym.co.in");
        emails.add("1ab.xyz@codegym.vn");
        emails.add("abc_xyz@codegym.vn");
        emails.add("abc#xyz@codegym.co.in");
        emails.add("abc.xyz@codegymvn");
        emails.add("abc.xyz@codegym.co");
        emails.add("abc.xyz@codegym.com");
        emails.add("abc.xyz@codegym.v");

        String regex = "^[a-z][a-z0-9]{0,9}\\.[a-z0-9]{1,10}[a-z]@[a-z]+\\.(com|vn)+$";

        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
    }
}
