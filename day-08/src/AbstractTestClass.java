public class AbstractTestClass {
    public static void main(String[] args) {
        //Animal ani = new Animal(); //인스턴스 생성 불가
        Monkey mong = new Monkey();
        mong.howl();
        Cat cat = new Cat();
        cat.howl();
        Dog dog = new Dog();
        dog.howl();

        //////////////////인터페이스 예
        //TestInterface tif = new TestInterface();//생성불가
        System.out.println(TestInterface.a);//상수 사용가능.
        TestImp ti = new TestImp();
        ti.method1();
        System.out.println(ti.d);
        TestInterface tif2 = ti;//다형성
        //부모 인터페이스 참조변수로 자식 클래스의 인스턴스
        //저장 가능.
        //ArrayList 클래스는 List 인터페이스의 자식 클래스.
        //List의 자식 클래스에는 LinkedList도 있음.
        //파라미터로 목록을 전달할 때나 반환값을 받아주는
        //참조변수는 부모 인터페이스를 사용
    }
}//class end

//추상 클래스(부모 클래스)
abstract class Animal {
    String name;
    int age;
    String gender;

    abstract void howl();//추상 메소드

    void sleep(){//일반 메소드
        System.out.println("잔다..");
    }//void end
}//abstract class end

class Monkey extends Animal {
    @Override
    void howl() {
        System.out.println("끽끽~");
    }
}//class end

class Cat extends Animal {

    @Override
    void howl() {
        System.out.println("야옹~~~~");
    }
}//class end

class Dog extends Animal {

    @Override
    void howl() {
        System.out.println("왈왈~~");
    }
}//class end

interface TestInterface {
    //모든 것은 상수다!
    public static final int a = 10;//정식 표현
    final int b = 20;
    static int c = 30;
    int d = 40;

    //모든 메소드는 추상 메소드다!
    public abstract void method1();
    public void method2();
    void method3();
}

class TestImp implements TestInterface {

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}