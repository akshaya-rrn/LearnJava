import java.lang.String;
import java.text.NumberFormat;
import java.util.Locale;

public class StringOperations {
    public static void main(String[] args ) {
        String strVar = new String("Hello String");
        String s1 = "Hell";
        String s2 = "concatenate";
        String s3 = s1 + s2;
        System.out.println(strVar.toLowerCase());
        System.out.println(strVar.toUpperCase());
        System.out.println(s3);

        StringBuilder sb = new StringBuilder("hellstring");
        sb.append(" builder");
        System.out.println(sb);

        Locale locale_ = new Locale("en", "IN");
        NumberFormat nf = NumberFormat.getNumberInstance(locale_);
        System.out.println("Number " + nf.format(2) );

    }
}
