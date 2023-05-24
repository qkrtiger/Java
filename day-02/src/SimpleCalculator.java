import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        //사용자로부터 2개의 값을 입력받아서 덧셈하고 출력하는 프로그램
        int num1, num2, result;

        //입력을 받는 장치 객체 Scanner
        Scanner scanner = new Scanner(System.in);

        //Scanner의 문제
        System.out.print("정수 입력 : ");
        int num = scanner.nextInt();
        scanner.nextLine();//엔터 문자 없애기

        System.out.print("문자열 입력 : ");
        String str = scanner.nextLine();

        System.out.println("문자열 - "+ str);
        System.out.println("정수 - "+ num);
        //숫자문자열을 정수로 변환
        int num3 = Integer.parseInt(str);
    }
}
