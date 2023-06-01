public class ThrowExceptionEx {
    public static void main(String[] args) {

        String rstr = null;

        int res = method1(10, 5);

        rstr = "결과: " + res;
        System.out.println(rstr);

        try {
            ecMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//main end

    private static int method1(int a, int b) {
        int r = 0;
        try{
            int r = a/b;
        } catch (Exception e) {
            throw new MessageException("0으로 나눌 수 없음.")
        }
        return r;
    }


    static void ecMethod() throws Exception {
        //예외사항 인스턴스 생성시 메시지를 삽입
        Exception ex = new Exception("보낼 메시지");
        //예외사항 전송
        throw ex;
    }
}//class end

//메시지 전송을 목적으로 하는 예외객체(예외가 아님)
class MessageException extends Exception {
    public MessageException(String msg){
        super(msg);
    }
}

