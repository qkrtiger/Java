public class StaticTestClass {
    //main 메소드(부장)
    public static void main(String[] args) {
        //프로그램 인스턴스가 없어도 시작을 해야하기 때문에
        //main에는 static이 붙는다.

        //메소드의 호출은 반드시 메소드 안에서 해야 한다.
        int r = addNum(10,20);

        //클래스 자신의 인스턴스를 스스로 생성.
        StaticTestClass stc = new StaticTestClass();
        int r2 = stc.subNum();
    }

    //메소드(대리) - 두 수를 더하는 메소드. - 메소드를 스태틱으로 만들자.
    static int addNum(int a, int b){
        int res = a +b;
        return res;
    }//method end

    //인스턴스 메소드
    int subNum(){
       int a, b;
       a = 30;
       b = 10;
       return a-b;
    }//method end

}//class end


