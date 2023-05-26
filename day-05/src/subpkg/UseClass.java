package subpkg;

public class UseClass {
    private int aaa;
    int bbb;//default 접근제어.
    public int ccc;

    void method(){
        aaa = 1;//private는 클래스 내에서만 사용.
        bbb = 2;
        ccc = 3;
    }
}
