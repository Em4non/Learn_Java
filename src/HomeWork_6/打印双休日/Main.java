package HomeWork_6.打印双休日;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();

        int month = scan.nextInt();

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, year);

        calendar.set(Calendar.MONTH, month - 1);

        int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        for (int i = 1; i <= day; i++) {

            calendar.set(Calendar.DAY_OF_MONTH, i);

            int week = calendar.get(Calendar.DAY_OF_WEEK);

            if (week == 1 || week == 7)

                System.out.println(df.format(calendar.getTime()));

        }

        scan.close();

    }

}