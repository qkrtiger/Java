public class BitOpClass {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("a & b :" + (a & b));
        System.out.println("a | b :" + (a | b));
        System.out.println("a ^ b :" + (a ^ b));

        //bit shift 연산
        int c = 1;
        int d = 1 ;
        int e = c << d;

        System.out.println(c + "d << " + d + " => e : " + e );
        d = 2;
        e = c <<d;
        System.out.println(c + "d << " + d + " => e : " + e );

        c = 32;
        d = 1;
        e = c >> d;
        System.out.println(c + " >> " + d + " => e : " + e);

        byte c2 = -8;
        d = 1;
        e = c2 >> d;
        System.out.println(c + " >> " + d + " => e : " + e);

    }
}
