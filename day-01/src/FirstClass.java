import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {

        //출력 명령문
        //System.out.println("안녕하세요~");
        //System.out.print(1000);
        //System.out.print('a');


        //입력 명령문 - 키보드로부터 입력
        Scanner scan = new Scanner(System.in);
        //문자열 입력
        //String str = scan.nextLine();
        //숫자 입력
        //int num = scan.nextInt();

        //입력받은 값 출력
        //System.out.println(str);
        //System.out.println(num);

        ////////////////////////////////////////
        //변수의 선언과 사용
        // 변수 선언 : 타입 변수명;
        int age;
        double value;

        //변수 사용 : 대입, 출력
        age = 25;
        value = 3.14;

        //입력시 주의해야 할 타입들
        float fvalue = 3.14f; //float는 접미사 'f'를 붙여야 한다.
        long lvalue = 100000L; //long은 접미사 'L'을 붙여야 한다.

        //문자 변수
        char ch = 'A';

        //boolean
        //초기화 - 시작하는 값. 최초로 넣은 값.
        boolean b = true;

        //문자열
        String str1 = "이건 문자열 입니다.";

        //여러 변수를 함께 선언
        int a1, a2, a3; //같은 타입의 변수는 함께 선언할 수 있음
        int iv1 = 1, iv2 = 6, iv3 = 8;

        // int a4, char ch2; //이것은 오류!!!!!!!

        // 이스케이프 문자 사용
        // 출력하고 싶은 문자열 - 우리 아빠는 "변호사"입니다.
        System.out.println("우리 아빠는 \"변호사\"입니다.");
        System.out.println("첫번째 문장");
        System.out.print("두번째 문장\n");
        System.out.println("세번째 문장");

        //print를 사용하는 경우
        System.out.print("입력값 : ");
        int num2 = scan.nextInt();
        System.out.println("입력값은"+num2+"입니다.");
    }
}
