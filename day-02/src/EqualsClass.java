import java.util.Scanner;

public class EqualsClass {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        boolean res = (a ==b);
        System.out.println(res);

        int c = 10;
        float d = 10.0f;
        res = (c ==d);
        System.out.println(res);

        String s1 = "abcd";
        String s2 = "abcd";
        res = (s1 == s2);
        System.out.println(res);

        Scanner scanner = new Scanner(System.in);
        System.out.print("s1 : ");
        s1 = scanner.nextLine();
        System.out.print("s2 : ");
        s2 = scanner.nextLine();

        res = (s1 == s2); //문자열의 같음 비교는 못함.
        System.out.println("문자열비교2 : " + res);
        //두 문자열이 같은지의 비교를 위한 메소드
        //equals()
        res = s1.equals(s2);
        System.out.println("문자열비교3 : " + res);



    }
}
