import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiButtonEx2 extends JFrame {
    //기본적인 화면 구성은 생성자로 처리
    public GuiButtonEx2(){
        //제목 표시줄에 타이틀 출력
        setTitle("GUI 버튼 예제");
        //종료 버튼 클릭시 프로그램 종료

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //화면에 보여질 요소를 담는 Container 생성
        Container c = getContentPane();
        //요소를 배치하는 레이아웃 설정.(FlowLayout)
        c.setLayout(new FlowLayout());

        //요소 화면에 추가(버튼)
        JButton btn1 = new JButton("Action");//생성
        c.add(btn1);//추가

        //이벤트 처리 인스턴스 생성(내부클래스 사용)

    }//생성자 끝
}//class end
