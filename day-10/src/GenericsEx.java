import java.util.ArrayList;

public class GenericsEx {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.name = "IoT";
        b1.price = 10000;

        Cloth c1 = new Cloth();
        c1.brand = "나이키";
        c1.size = "XL";
        c1.kind = "점퍼";

        Box box1 = new Box();
        box1.setItem(b1);//책상자

        Box box2 = new Box();
        box2.setItem(c1);//옷상자

        //.... 여기는 다른 메소드라고 가정
        //책을 꺼내서 사용
        Object obj = box1.getItem();
        if(obj instanceof Book){
            Book b2 = (Book) obj;
            //이후에 책을 사용
        } else if(obj instanceof Cloth){
            Cloth c2 = (Cloth) obj;
            //이후에 옷을 입음
        }
        ////////////////////////////////
        //제네릭스 박스를 사용
        Gbox<Book> box3 = new Gbox<>();
        Gbox<Cloth> box4 = new Gbox<>();
        box3.setItem(b1);
        box4.setItem(c1);

        Book b3 = box3.getItem();
        Cloth c3 = box4.getItem();

        ArrayList<Book> bList = new ArrayList<>();
        bList.add(b1);
    }
}

class Book {
    String name;
    int price;
}

class Cloth {
    String brand;
    String size;
    String kind;

}

//다형성을 활용하여 어떤 인스턴스라도 저장 가능한 상자.
class Box {
    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}

//제네릭스를 활용한 box 클래스
class Gbox<T>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
