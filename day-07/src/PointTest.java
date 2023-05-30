public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 10;
        p1.y = 15;
        p1.color = "red";
        p1.showPoint();
        System.out.println(p1);

        Point po2 = new Point(34, 27);
        po2.color = "green";
        po2.showPoint();

        Point3d p2 = new Point3d();
        p2.x = 20;
        p2.y = 25;
        p2.z = 30;
        p2.color = "blue";
        p2.showPoint();
        System.out.println(p2);

        p2.aprint();
    }
}

class Point {//2D 그래픽용 점 객체
    int x;
    int y;
    String color;

    int a = 1000;

    //생성자를 작성하면 컴파일러가 기본생성자 작성하지 않음.
    //기존 코드에 기본생성자를 사용하는 부분에 문제가 발생.
    public Point(){
        super();//Object 클래스의 생성자. 자동으로 처리(생략)
    }//이 경우 기본생성자를 작성하자.
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void showPoint(){
        System.out.println("x : " + x + ", y : " + y +
                ", 색상 : " + color);
    }
}

/*
class Point3D {
    int x;
    int y;
    int z;
    String color;

    public void showPoint(){
        System.out.println("x : " + x + ", y : " + y +
                ", z : " + z + ", 색상 : " + color);
    }
}
 */

class Point3d extends Point {
    int z;
    int a;

    public Point3d(){
        super();//내포된 문장. 생략 가능.
    }//기본생성자를 만들자.
    public Point3d(int x, int y, int z){
        //super.x = x;
        //super.y = y;
        super(x, y);//부모클래스의 생성자를 호출.
        this.z = z;
    }

    public Point3d(int a) {
        this.a = a;
    }

    @Override
    public void showPoint() {
        //System.out.println("x : " + x + ", y : " + y +
        //        ", z : " + z + ", 색상 : " + color);
        super.showPoint();
        System.out.println("z : " + z);
    }

    public void aprint(){
        System.out.println("부모의 a : " + super.a);
        System.out.println("a : " + a);
    }
}