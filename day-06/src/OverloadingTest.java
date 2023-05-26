public class OverloadingTest {
    public static void main(String[] args) {
        SimpleCal sc = new SimpleCal();
        //정수 + 정수 연산
        int res = sc.add(4, 3);
        //정수 + 실수 연산
        int res2 = sc.add(5, 3.14f);
    }
}

class SimpleCal {
    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, float b){
        return (int)(a + b);
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    /* 오버로딩 아님. 메소드 중복 정의 오류
    public double add(int a, int b){
        return (double) a + b;
    } */
}
