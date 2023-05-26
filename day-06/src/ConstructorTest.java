import java.util.Scanner;

public class ConstructorTest {
    public static void main(String[] args) {
        Car mycar = new Car();
        System.out.println(mycar.getGearType());
        System.out.println(mycar.getDoor());
        mycar.setColor("빨간색");
        System.out.println(mycar.getColor());

        Car car2 = new Car("회색");
        System.out.println(car2.getColor());
        Car car3 = new Car("흰색", "수동");
        System.out.println(car3.getColor()
            + ", " + car3.getGearType());

        //어떤 소스로부터 입력을 받을 건지
        //인스턴스 생성 시 지정되어야 한다.
        Scanner scan = new Scanner(System.in);

        System.out.println(mycar);
        System.out.println(car2);
        System.out.println(car3);
        String aaa = "abc";
        System.out.println(aaa);
    }
}

class Car {
    private String color;
    private String gearType;
    private int door;

    //1) setter 사용
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    //기본 생성자
    public Car(){
        //this.color = "검정";
        //this.gearType = "자동";
        //this.door = 4;
        this("검정");
    }

    //색상만 지정하는 인스턴스 생성자.
    public Car(String color){
        //this.color = color;
        //this.gearType = "자동";
        //this.door = 4;
        this(color, "자동");
    }
    //기어만 지정하는 인스턴스 생성자.(X)
    public Car(String color, String gearType){
        //this.color = color;
        //this.gearType = gearType;
        //this.door = 4;
        this(color, gearType, 4);
    }

    public Car(String color, String gearType,
               int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public String getGearType(){
        return gearType;
    }
    public int getDoor(){
        return door;
    }

    @Override
    public String toString() {
        String str = "색상 : " + color + "\n"
                + "기어 : " + gearType + "\n"
                + "문개수 : " + door + "\n";
        return str;
    }
}//class end