public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;
        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", "
                + c1.number + "이며, 크기는 ("
                + c1.width + ", " + c1.height + ")");

        System.out.println("c2은 " + c2.kind + ", "
                + c2.number + "이며, 크기는 ("
                + c2.width + ", " + c2.height + ")");

        Card c3 = new Card();
        System.out.println("c3은 " + c3.kind + ", "
                + c3.number + "이며, 크기는 ("
                + c3.width + ", " + c3.height + ")");

        c1.width = 50;
        c2.height = 80;

        System.out.println("c1은 " + c1.kind + ", "
                + c1.number + "이며, 크기는 ("
                + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", "
                + c2.number + "이며, 크기는 ("
                + c2.width + ", " + c2.height + ")");
        System.out.println("c3은 " + c3.kind + ", "
                + c3.number + "이며, 크기는 ("
                + c3.width + ", " + c3.height + ")");

        Card.width = 200;
        Card.height = 500;

        System.out.println("c1은 " + c1.kind + ", "
                + c1.number + "이며, 크기는 ("
                + c1.width + ", " + c1.height + ")");
        System.out.println("c2은 " + c2.kind + ", "
                + c2.number + "이며, 크기는 ("
                + c2.width + ", " + c2.height + ")");
        System.out.println("c3은 " + c3.kind + ", "
                + c3.number + "이며, 크기는 ("
                + c3.width + ", " + c3.height + ")");
    }
}

//카드 클래스
class Card {
    String kind = "Diamond";//카드의 모양
    int number = 1;//카드의 숫자

    static int width = 100;//카드의 너비
    static int height = 250;//카드의 높이
}