//package hust.soict.hedspi.aims.utils;
//
//import java.time.LocalDate;
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class DateUtils {
//
//  public static int compareTwoDate(MyDate date1, MyDate date2) {
//	  int ngay1, ngay2, thang1, thang2;
//		String arrMonth[] = {"January", "February", "March","April","May","June","July","August","September","October","November","December"};
//		String arrDay[] = {"1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th","13th","14th","15th","16th","17th","18th","19th","20th","21st","22nd","23rd","24th","25th","26th","27th","28th","29th","30th","31st"};
//		int ngay=0, thang=0;
//		for(int i =0; i< 31;i++) {
//			if(date1.getDay().equals(arrDay[i])) {
//				ngay1 = i + 1;
//			}
//		}
//		for(int i =0; i< 12; i++) {
//			if(date1.getMonth().equals(arrMonth[i])) {
//				thang1 = i + 1;
//			}
//		}
//		date1 = new My(date1.getYear(), thang1, ngay1);
//
//    int compare = Integer.compare(date1.getYear(), date2.getYear());
//    if (compare != 0) {
//      return compare;
//    }
//    compare = Integer.compare(date1.getMonth(), date2.getMonth());
//    if (compare != 0) {
//      return compare;
//    }
//    compare = Integer.compare(date1.getDay(), date2.getDay());
//    return compare;
//  }
//
//  public static void SortingANumberOfDates(MyDate[] dates) {
//    Arrays.sort(dates, new Comparator<MyDate>() {
//      @Override
//      public int compare(MyDate date1, MyDate date2) {
//        return DateUtils.compareTwoDate(date1, date2);
//      }
//    });
//    for (MyDate date : dates
//    ) {
//      date.printDate("MMMM-dd-yyyy");
//    }
//  }
//}