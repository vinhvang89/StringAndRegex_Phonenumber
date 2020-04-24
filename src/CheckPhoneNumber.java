import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Phone number :");
        String phone_number = scanner.nextLine();
        final String PHONE_NUMBER_FORM = "^[(]+[0-9]{2,}+[)]+[(]+[0]+[0-9]{9,}+[)]+$";
        Pattern pattern = Pattern.compile(PHONE_NUMBER_FORM);
        Matcher matcher = pattern.matcher(phone_number);
        System.out.println(matcher.matches());
    }
}
