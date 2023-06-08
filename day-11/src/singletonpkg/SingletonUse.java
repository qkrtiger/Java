package singletonpkg;

public class SingletonUse {
    public static void main(String[] args) {
        //SingletonClass sc = new SingletonClass();
        SingletonClass sc = SingletonClass.getInstance();

        sc.setNum1(10);
        System.out.println(sc.getNum1());

    }
}
