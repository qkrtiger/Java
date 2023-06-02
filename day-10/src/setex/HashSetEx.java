package setex;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        //정수형 집합
        Set<Integer> iSet = new HashSet<>();
        //집합에 데이터 입력 : add(값)
        iSet.add(1);
        iSet.add(2);
        iSet.add(3);
        iSet.add(4);
        iSet.add(5);
        System.out.println(iSet);
        System.out.println("원소개수 : " + iSet.size());

        //이런 사용법은 옳지 않다.(100% 보장안됨)
        for(int a : iSet){
            System.out.println(a);
        }

        //집합의 데이터 유무 확인 메소드:contains();
        boolean b = iSet.contains(7);
        System.out.println(b);
        //int i = iSet.indexOf(3);//순서가 없어서..

        //원소의 삭제 : remove(데이터);
        iSet.remove(5);
        System.out.println(iSet);

        //Set 원소의 순차적인 사용 : iterator로 변환 후.
        Iterator<Integer> iter = iSet.iterator();

        while(iter.hasNext()){
            int n = iter.next();//원소 꺼내기
            System.out.println(n);
            if(n == 3){
                iter.remove();//원소 제거
                break;
            }
        }//while end
        System.out.println(iSet);

    }//main end
}//class end
