import java.util.Scanner;

public class CheckDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        // String[] nameMonth = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
        //         "October", "November", "December", "Jan.", "Feb.", "Mar.", "Apr.", "Aug.", "Sept.", "Oct.", "Nov.",
        //         "Dec.", "Jan", "Feb", "Mar", "Apr", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "1", "2", "3", "4",
        //         "5", "6", "7", "8", "9", "10", "11", "12" };
        System.out.println("Nhap vao thang: ");
        String month = in.nextLine();
        if (month.compareTo("February") == 0 || month.compareTo("Feb") == 0 || month.compareTo("Feb.") == 0
                || month.compareTo("2") == 0) {
            do {
                System.out.println("Nhap vao nam: ");
                year = in.nextInt();
                if (year <=0) {
                    System.out.println("Nhap sai.Hay nhap lai!");
                }
            } while (year <=0);
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(month + ", " + year + ": 29 day");
                    } else {
                        System.out.println(month + ", " + year + ": 28 day");
                    }
                } else {
                    System.out.println(month + ", " + year + ": 29 day");
                }
            } else {
                System.out.println(month + ", " + year + ": 28 day");

            }
        } else if (month.compareTo("January") == 0 || month.compareTo("Jan.") == 0 || month.compareTo("Jan") == 0
                || month.compareTo("1") == 0 || month.compareTo("March") == 0 || month.compareTo("Mar") == 0
                || month.compareTo("Mar") == 0
                || month.compareTo("3") == 0 || month.compareTo("May") == 0 || month.compareTo("5") == 0
                || month.compareTo("July") == 0
                || month.compareTo("Jul") == 0 || month.compareTo("7") == 0 || month.compareTo("August") == 0
                || month.compareTo("Aug") == 0
                || month.compareTo("Aug.") == 0 || month.compareTo("8") == 0 || month.compareTo("October") == 0
                || month.compareTo("Oct") == 0 || month.compareTo("Oct.") == 0 || month.compareTo("10") == 0
                || month.compareTo("December") == 0 || month.compareTo("Dec.") == 0 || month.compareTo("Dec") == 0
                || month.compareTo("12") == 0) {
            do {
                System.out.println("Nhap vao nam: ");
                year = in.nextInt();
                if (year <=0) {
                    System.out.println("Nhap sai.Hay nhap lai!");
                }
            } while (year <=0);
            System.out.println(month + ", " + year + ": 31 day");
        } else if (month.compareTo("April") == 0 || month.compareTo("Apr.") == 0 || month.compareTo("Apr") == 0
                || month.compareTo("4") == 0 || month.compareTo("June") == 0 || month.compareTo("Jun") == 0
                || month.compareTo("6") == 0
                || month.compareTo("September") == 0 || month.compareTo("Sept.") == 0 || month.compareTo("Sep") == 0
                || month.compareTo("9") == 0
                || month.compareTo("November") == 0 || month.compareTo("Nov.") == 0 || month.compareTo("Nov") == 0
                || month.compareTo("11") == 0) {
            do {
                System.out.println("Nhap vao nam: ");
                year = in.nextInt();
                if (year <=0 ) {
                    System.out.println("Nhap sai.Hay nhap lai!");
                }
            } while (year <=0);
            System.out.println(month + ", " + year + ": 30 day");
        } else {
            System.out.println("Nhap sai.Hay nhap lai!");
            CheckDay.main(args);
        }
    }
}
