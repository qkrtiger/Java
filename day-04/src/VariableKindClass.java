public class VariableKindClass {
    int instMember; //인스턴스 멤버 변수
    static int statMember; //스태틱 멤버 변수.(클래스변수)
    String strMember = "ABC"; //인스턴스 멤버 참조변수
    static  String statStrMember = "XYZ"; //스태틱 멤버 참조변수
    //스태틱은 지역 변수에서는 사용하지 않는다.

    public static void main(String[] args) {
        String str = "abcd";//지역변수
        //static은 지역변수에는 사용하지 않는다.
        // -> 메소드 내부에서는 사용하지 않는다.
    }
    int method1(int a){//매개변수
        int b = 10; //지역변수
        String str = "wxyz";//지역 참조변수
        return a+b;
    }//method1 end


    //한 클래스 파일 내부에 다른 클래스를 작성할 수 있다.
    class SomeClass {
        static float vf;//스태틱 변수
        int vi;

        SomeClass.vf = 100.0f;
        //클래스명으로 사용할 수 있는 변수 -> 클래스변수.

    }

}//main end

//한 파일에 여러개의 class를 작성하는 경우의 주의할 사항.
//주 클래스(파일명과 같은 클래스)만 public을 붙인다.