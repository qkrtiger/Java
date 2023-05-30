package package2;

import package1.Parent1;

public class UseClass2 {
    Parent1 p2 = new Parent1();

    void method2(){
        p2.a = 10000;//public
        //p2.b = 20000;//protected
        //p2.c = 30000;//default
        //p2.d = 40000;//private
    }
}
