package datetime;

import org.w3c.dom.ls.LSOutput;

import java.util.Calendar;


public class MyCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        //연, 월, 일 구하기
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) +1;
        int date = cal.get(Calendar.DATE);
        System.out.println(year + "-" + month + "-" + date);

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        //System.out.println(hour+":"+minute+":"+second);

        System.out.printf("%d-%02d-%02d",year,month,date);

        //요일 출력
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(dow);

        //현재 '일'을 포함한 달의 마지막날
        int lastDay = cal.getActualMaximum(Calendar.DATE);
        int startDay = cal.getActualMinimum(Calendar.DATE);
        System.out.println(startDay + ", " + lastDay);

        //Calendar 날짜 지정.
        //set(상수, 값)
        //연, 월, 일 지정
        cal.set(Calendar.YEAR, 2022);
        cal.set(Calendar.MONTH, 11);//실제 월 -1 값 입력
        cal.set(Calendar.DATE, 1);

        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) +1;

    }//main end
}//class end
