package subpkg;

//UseClass와 같은 패키지기 때문에 import 안함.

public class UseClass2 {
    void method1(){
        UseClass uc = new UseClass();
        //uc.aaa = 10;//private로 외부 접근 거부.
        uc.bbb = 100;//사용가능.(default)
        uc.ccc = 200;//사용가능.(public)
    }
}
