import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year; //연도 저장변수
        boolean res; //윤년 판단 정보 저장 변수
        String outString; //결과 문자열

        Scanner scanner = new Scanner(System.in);

        //타이틀 출력
        System.out.println("♥윤년 계산기♥");
        System.out.println("====================");

        //연도 입력
        System.out.print("연도 : ");
        year = scanner.nextInt();

        res = ((year % 4 == 0) && (year % 100 !=0)) || (year % 400 == 0);

        outString = (res) ? "윤년입니다." : "윤년이 아닙니다.";

        //결과 출력
        System.out.println(outString);
        System.out.println("프로그램 종료");
    }
}
