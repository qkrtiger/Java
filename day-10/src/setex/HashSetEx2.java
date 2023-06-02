package setex;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {
    public static void main(String[] args) {
        //정수형 집합
        Set<Integer> iSet = new HashSet<>();
        //집합에 데이터 입력 : add(값)
        iSet.add(1);
        iSet.add(2);
        iSet.add(2);
        iSet.add(2);
        iSet.add(2);
        System.out.println(iSet);
        System.out.println("원소개수 : " + iSet.size());

    }//main end
}
