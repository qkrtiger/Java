import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import문에 '*'은 패키지 내의 모든 클래스를 포함시킨다는 의미

public class GuiButtonEx extends JFrame {
    //기본적인 화면 구성은 생성자로 처리
    public GuiButtonEx(){
        //제목 표시줄에 타이틀 출력
        setTitle("GUI 버튼 예제");
        //종료 버튼 클릭 시 프로그램 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //화면에 보여질 요소를 담는 Container 생성.
        Container c = getContentPane();
        //요소를 배치하는 레이아웃 설정.(FlowLayout)
        c.setLayout(new FlowLayout());

        //요소 화면에 추가(버튼)
        JButton btn1 = new JButton("Action");//생성
        c.add(btn1);//추가

        //이벤트 처리 인스턴스 생성(내부클래스 사용)
        MyActionListener mal = new MyActionListener();
        //버튼에 이벤트 처리 인스턴스 넣기(연결하기)
        btn1.addActionListener(mal);

        JButton btn2 = new JButton("Action2");
        c.add(btn2);
        InnerActionListener ial = new InnerActionListener();
        btn2.addActionListener(ial);

        JButton btn3 = new JButton("Action3");
        c.add(btn3);
        //익명 클래스로 이벤트 처리 인스턴스 생성
        btn3.addActionListener(new ActionListener() {
            //btn3 전용의 객체(인스턴스)를 생성하는 익명 클래스
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                if(b.getText().equals("Action3")){
                    b.setText("액션3");
                }
                else {
                    b.setText("Action3");
                }
                //제목 바꾸기(버튼의 글자로 바꾸기)
                setTitle(b.getText());
            }
        });

        //프로그램(창)의 크기 설정
        setSize(500, 200); //픽셀 단위로 설정(너비, 높이)
        //모니터에 프로그램 출력
        setVisible(true);
    }//생성자 끝

    public static void main(String[] args) {
        new GuiButtonEx();//Self Create Instance.
    }//main end

    //내부클래스로 이벤트 처리 객체 작성
    private class InnerActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //프로그램 제목을 바꿔보자
            GuiButtonEx.this.setTitle("바뀐 제목!");
        }
    }

}//class end

//버튼 이벤트 처리용 객체(클래스) - 원래는 따로 작성할 것
class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        //이벤트가 발생했을 때 그 이벤트에 대한 처리
        //명령을 작성하는 메소드
        //ActionEvent 객체 : 이벤트가 발생된 요소의 정보와 어떤 이벤트인지의 정보를 가진 객체
        JButton b = (JButton) e.getSource();
        //버튼을 클릭하면 버튼의 글자를 'Actioni <-> 액션'이 되도록 처리
        if(b.getText().equals("Action")){
            b.setText("액션");
        }
        else {
            b.setText("Action");
        }
    }

}

