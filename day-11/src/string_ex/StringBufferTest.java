package string_ex;

public class StringBufferTest {
    public static void main(String[] args) {
        //기본 생성법(16칸의 공백 공간을 형성)
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        //원하는 크기로 공간 생성
        StringBuffer sb2 = new StringBuffer(100);
        System.out.println(sb2.capacity());
        //글자를 넣은 상태로 공간 생성
        StringBuffer sb3 = new StringBuffer("abcd");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());

        //sb1에 문자열을 추가
        sb1.append("abcdefghijk");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        sb1.reverse();
        System.out.println(sb1);

        //특정 문자열을 역순으로 만드는 단계
        //1. 문자열을 기본값으로 하는 StringBuffer 생성.
        //2. StringBuffer에 reverse() 사용.
        //3. reverse한 StringBuffer의 toString
        //   메소드를 사용하여 문자열로 변환.
    }
}
