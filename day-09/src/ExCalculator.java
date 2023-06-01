import java.util.Scanner;

public class ExCalculator {
    static Scanner scan = new Scanner(System.in);
    static int res;//결과값 저장변수

    public static void main(String[] args) {
        String menu = null; //menu값 초기화

        System.out.println("<<예외처리 되는 계산기>>");

        while (true){
            System.out.println("1. 덧셈");
            System.out.println("2. 뺄셈");
            System.out.println("3. 곱셈");
            System.out.println("4. 나눗셈");
            System.out.println("0. 종료");
            System.out.println("선택> ");
            menu = scan.nextLine();

            if(menu.equals("0")){
                System.out.println("계산기 종료");
                break;
            }//계산기 종료

            switch (menu) {
                case "1" : //덧셈(예외사항 자체 처리)
                    add();
                    break;
                case "2" : //호출한 메소드에서 예외를 처리하는 방식
                    sub();
                    break;
                case "3" :
                    mul();
                    break;
                case "4" :
                    div();
                    break;
                default:
                    System.out.println("0~4까지 입력하세요.");

            }//switch end
        }//while end
    }//main end

    private static void add() {
        //try, catch 자체 처리
        int n1, n2, r = 0;
        String str = null;

        System.out.println("<덧셈 연산>");

        try{
            System.out.println("N1 : ");
            str = scan.nextLine();
            n1 = Integer.parseInt(str); //예외 발생할 수 있는 구간

            System.out.println("N2 : ");
            str = scan.nextLine();
            n2 = Integer.parseInt(str); //예외 발생할 수 있는 구간

            r = n1 + n2;
            System.out.println("결과 : " + r);
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력하세요.");
        } finally {
            System.out.println("덧셈 종료. 이전 메뉴로...");
        }
    }//add end

    private static void sub() throws NumberFormatException{
        //호출한 메소드에서 예외를 처리하는 방식
        int n1, n2, r = 0;
        String str = null;

        System.out.println("<뺄셈 연산>");

        System.out.println("N1 : ");
        str = scan.nextLine();
        n1 = Integer.parseInt(str); //예외 발생할 수 있는 구간

        System.out.println("N2 : ");
        str = scan.nextLine();
        n2 = Integer.parseInt(str); //예외 발생할 수 있는 구간

        r = n1 + n2; //연산
        System.out.println("결과 : " + r); //결과문 출력
    }//sub end

    private static void mul_run() throws NumberFormatException {
        int n1, n2, r = 0;
        String str = null;

        System.out.println("<곱셈 연산>");

        System.out.println("N1 : ");
        str = scan.nextLine();
        n1 = Integer.parseInt(str);

        System.out.println("N2 : ");
        str = scan.nextLine();
        n2 = Integer.parseInt(str);
        r = n1 * n2;
        System.out.println("결과 : " + r);
    }//mul end

    private static void mul() throws NumberFormatException {
        mul_run();
    }

    private static void div(){
        //다중 예외 사항 처리(2개 이상의 예외를 처리하자)
        int n1, n2, r = 0;
        String str = null;

        System.out.println("<나눗셈 연산>");

        try{
            System.out.println("N1 : ");
            str = scan.nextLine();
            n1 = Integer.parseInt(str);

            System.out.println("N2 : ");
            str = scan.nextLine();
            n2 = Integer.parseInt(str);
            r = n1 / n2;
            System.out.println("결과 : " + r);
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력하세요.");
        } catch (ArithmeticException ae) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("나눗셈 종료. 이전 메뉴로...");
        }
    }//div end

}//class end
