package HomeWork_6.比较日期;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String d1 = sc.next();
        String d2 = sc.next();
        DateFormat format = new SimpleDateFormat("MM,dd,yyyy");
        Date date1 = format.parse(d1);
        Date date2 = format.parse(d2);
        if (date1.equals(date2)) System.out.println("=");
        else if (date1.before(date2)) System.out.println("<");
        else System.out.println(">");
        int day = (int) ((date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24));
        System.out.println(Math.abs(day));
    }
}
