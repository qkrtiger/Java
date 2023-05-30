package package2;

import package1.Parent1;

public class Child1 extends Parent1 {
    void someMethod(){
        a = 1000;//public
        b = 2000;//protected
        //c = 3000;//default
        //d = 4000;//private
    }
}
