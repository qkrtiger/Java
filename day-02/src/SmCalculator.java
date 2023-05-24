import java.util.Scanner; //라이브러리 사용.

public class SmCalculator {
    public static void main(String[] args) {
        //2개의 정수를 입력 받아서 덧셈 후 결과 출력
        int num1, num2, result;

        //입력장치(Scanner) 인스턴스 생성
        Scanner scanner = new Scanner(System.in);
        //new : heap 영역에 인스턴스를 생성하는 명령어

        //프로그램의 이름(Title) 출력이 필요.
        System.out.println("간단한 덧셈 계산기");
        System.out.println("================");

        //입력 처리.
        System.out.print("Number1 : ");//안내문구
        num1 = scanner.nextInt();
        System.out.print("Number2 : ");//안내문구
        num2 = scanner.nextInt();

        //연산처리 : 덧셈
        result = num1 + num2;

        //결과 출력
        System.out.println("덧셈 결과 : " + result);

        //종료 문구 출력
        System.out.println("프로그램을 종료합니다.");

        int n1 = 5;
        float f1 = 2.0f;

        float resf = n1 / f1;
        System.out.println(resf);

        //숫자형 변수와 문자열 변수의 연산(결합)
        //최종 결과는 무조건 문자열
        String s = 1 + 5 + 6 * 2 + "개";
        System.out.println(s);
        s = "갯수 : " + (1 + 5 + 6 * 2);
        System.out.println(s);

        //숫자 -> 문자열 : String.valueOf(숫자)
        s = "갯수 : " + String.valueOf(50); //굳이 String 써주지 않아도 자동형변환 됨
        System.out.println(s);
    }
}
