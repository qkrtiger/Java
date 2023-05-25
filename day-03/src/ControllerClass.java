import java.util.Scanner;

public class ControllerClass {
    //프로그램의 모든 부분을 처리하는 인스턴스를 설계한 클래스
    //타이틀 : 관리프로그램
    //메뉴 : 1.입력, 2.출력, 0.종료

    public void run(){
        String menu; //메뉴를 입력받아 저장하는 변수.
        //입력 객체(Scanner) 준비
        Scanner scanner = new Scanner(System.in);

        //프로그램의 타이틀 출력
        System.out.println("관리 프로그램");
        System.out.println("===========");

        //메뉴 출력부터 종료까지 무한 반복
        while(true){//조건식이 true이기 때문에 종료하지 않음
            //메뉴 출력
            System.out.println("1. 입력");
            System.out.println("2. 출력");
            System.out.println("0. 종료");
            //메뉴 입력
            System.out.println("입력> ");//안내문구
            menu = scanner.nextLine();//문자열로 입력

            //메뉴 입력에 따른 기능 분기. if, switch로 처리.
            //종료 처리.
            if(menu.equals("0")){
                System.out.println("프로그램 종료");
                break; //또는 return;
            }
            //나머지 메뉴 처리.
            switch (menu){
                case "1": //입력 처리 기능
                    System.out.println("입력을 실행합니다.");
                    break;
                case "2": //출력 처리 기능
                    System.out.println("출력을 실행합니다.");
                    break;
                default:
                    System.out.println("잘못 입력하였습니다.");
            }
        }
    }
}
