import java.util.Scanner;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = null;
        int num = 0;


        try {
            System.out.println("--- 입력 전 ---");
            System.out.print("숫자입력 : ");
            str = scan.nextLine();
            System.out.println("--- 변환 전 ---");
            num = Integer.parseInt(str);//숫자변환
            System.out.println("--- 변환 후 ---");
            System.out.println("여러가지 작업들...");
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            //예외사항 관련 출력 메소드 printStackTrace()
            //e.printStackTrace();//콘솔일 때는 안 쓴다
        }//catch end
        finally {
            //예외사항과 상관없이 실행할 문장들
            System.out.println("예외처리 끝!");
        }
        System.out.println("프로그램 끝!");
    }//main end
}//class end
