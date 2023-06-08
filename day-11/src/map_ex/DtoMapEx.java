package map_ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DtoMapEx {
    public static void main(String[] args) {
        Map<String, DataDto> pList = new HashMap<>();

        //개별적인 데이터 묶음 생성
        DataDto d1 = new DataDto();
        d1.setName("홍길동");
        d1.setAge(25);
        d1.setAddress("인천시 남동구");

        pList.put("hong1", d1);

        DataDto d2 = new DataDto();
        d2.setName("전우치");
        d2.setAge(30);
        d2.setAddress("인천시 미추홀구");

        pList.put("june01", d2);
        System.out.println(pList.get("hong01"));

        List<Integer> iList = new ArrayList<>();
        iList.add(1);
        iList.add(3);
        iList.add(5);
        iList.add(7);

        //Map에 List를 추가
        Map<String, List<Integer>> iMap = new HashMap<>();
        iMap.put("정수목록", iList);

        System.out.println(iMap.get("정수목록"));

        List<Map<String , DataDto>> localList = new ArrayList<>();

        localList.add(pList);

    }//main end
}//class end
