public class PrintOperation {
    public static void main(String[] args) {
        int a = 10;
        float b = 3.14f;
        String s = "hello";

        System.out.print(a+" "+b+" "+s);
        System.out.println();
        System.out.print("a : " +a);
        System.out.println();
        System.out.print("b : " + b);
        System.out.println();
        System.out.println("s : " +s);
        System.out.println();

        //printf
        System.out.println(a + " " + b + " " + s);
        System.out.printf("변수들의 값은 %d, %f, %s 입니다.\n", a,b,s );

        System.out.printf("a : %10d\n", a);
        System.out.printf("a : %010dz\n", a);

        for(int i = 1; i <10; i++){
            System.out.printf("2* %d = %02d\n", i, (i*2));
        }

        System.out.printf("%7.2f\n", b);
    }
}
