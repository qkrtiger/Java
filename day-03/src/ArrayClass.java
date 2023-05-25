import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {
        //배열 선언(정수 배열)
        int intArray[];
        //배열 생성
        intArray = new int[5];

        int iArray[] = new int[5];

        for(int i = 0; i<5; i++){
            System.out.println(intArray[i]);

        boolean bArr[] = new boolean[5];
            for(int j =0; j<5; j++){
                System.out.println(bArr[j]);
            }
        }

        intArray[0] = 10;
        System.out.println(intArray[0]);
        //번지수(순번)는 0으로 시작.

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        //배열 생성
        int score[] = new int[num];

        for(int k =0; k < scorep.length; k++){
            System.out.print((k+1)+"번 학생 점수 : ");
            score[k] = scan.nextInt();
        }

    }
}
