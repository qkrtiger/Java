package mainpkg;

import subpkg.UseClass;

public class MainClass {
    public static void main(String[] args) {
        UseClass uc = new UseClass();
        //uc.aaa = 1000;//private.
        //uc.bbb = 2000;//default.
        uc.ccc = 3000;
    }
}
