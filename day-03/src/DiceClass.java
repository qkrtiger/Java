import java.util.Random;

public class DiceClass {
    public static void main(String[] args) {
        //난수 생성하는 객체 Random
        Random random = new Random();

        int r = random.nextInt(10); //범위 지정(0~9)
        //nextInt(최대값) - 범위 : 0 ~ 최대값 - 1

        //System.out.println(r);

        switch (r){
            case 1:
                System.out.println("1이 나왔습니다.");
                break;
            case 2:
                System.out.println("2가 나왔습니다.");
                break;
            case 3:
                System.out.println("3이 나왔습니다.");
                break;
            case 4:
                System.out.println("4가 나왔습니다.");
                break;
            case 5:
                System.out.println("5가 나왔습니다.");
                break;
            default:
                System.out.println("6이 나왔습니다.");

        }
    }
}
