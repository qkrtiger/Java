package list_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRemoveEx {
    public static void main(String[] args) {
        List<Integer> iList = new ArrayList<>();

        iList.add(1);
        iList.add(2);
        iList.add(7);
        iList.add(2);
        iList.add(2);
        iList.add(2);
        iList.add(3);
        iList.add(3);
        iList.add(4);
        iList.add(5);
        iList.add(6);
        System.out.println(iList);

        //문제. 모든 2를 지워라.
        //시도1.
        iList.remove(2); //순번. 즉, 3번째 데이터 삭제
        System.out.println(iList);

        //시도2. 모든 원소를 삭제할 수 없음.
        //iList.remove(new Integer(2));
        //System.out.println(iList);

        //시도3.forEach - 삭제 시 사용금지(read only)
        //for(int n : iList){
        //    if(n ==2 ){
        //        iList.remove(new Integer(2));
        //    }
        //}
        //시도4. 일반 for문 사용
        //for(int i = 0; i < iList.size(); i++){
        //    if(iList.get(i) == 2){
        //        iList.remove(i);
        //        i--;
        //    }
        //}
        //System.out.println(iList);

        //시도5. iterator 사용(안전한 삭제)
        Iterator<Integer> iter = iList.iterator();
        while (iter.hasNext()){
            if(iter.next() ==2 ){
                iter.remove();
            }
        }
        System.out.println(iList);
    }//main end
}//class end
