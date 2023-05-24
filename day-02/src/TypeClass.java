public class TypeClass {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue; //자동 형변환

        long longValue = 5000000000L;
        float floatValue = longValue;
        double doubleValue = floatValue;

        char charValue = 'A'; //65라는 숫자를 저장.
        int intValue2 =  charValue;
        System.out.println(intValue2);
        System.out.println(charValue);

        char charValue2 = 68;
        System.out.println(charValue2);

        for (byte i = 65; i < 91; i++){
            char c = (char) i;
            System.out.println(c);
        }
        //숫자 -> 문자열, 문자열 -> 숫자 : 특별한 방법이 필요

        byte x = 10;
        byte y = 20;
        byte result = (byte) (x+y);

        int x1 = 10;
        int y1 = 20;

    }
}

//클래스는 하나의 로봇을 만드는 설계도라고 생각하자.