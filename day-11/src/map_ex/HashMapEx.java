package map_ex;

import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        //초간단 사전 : 단어 - 뜻
        Map<String, String> dic = new HashMap<>();
        //dic(map) 데이터 입력 : put
        dic.put("one", "하나");
        dic.put("Apple", "사과");
        dic.put("Grape", "포도");
        dic.put("Pear", "배");
        dic.put("Ship", "배");
        dic.put("Ship", "돛단배");
        //키가 중복되면 이전 데이터를 덮어쓰기 한다.
        System.out.println(dic);

        //map의 데이터 읽어오기 : get(key)
        System.out.println(dic.get("사과"));
        //key에 해당하는 value가 없을 경우 null.

        //키나 값의 존재 여부 확인 - true/false
        //키 - containsKey(key)
        boolean b = dic.containsKey("Banana");
        System.out.println(b);
        //값 - containsValue(value)
        b = dic.containsKey("배");
        System.out.println(b);

        //key에는 어떤 것들이 있는가? 키집합 구하기
        Set<String> kSet = dic.keySet();
        System.out.println(kSet);
        System.out.println(dic.get("one"));

        //값의 집합 구하기 : values();
        Collection<String> vSet = dic.values();
        System.out.println(vSet);

        //값을 가지고 키를 구하자. 뜻으로 단어 찾기.
        //1. 찾고자 하는 값이 맵에 존재하는가?
        //2. 키 집합을 생성한다.
        //3. 키 집합을 순차구조로 변환(iterator)

        String s = "바나나";
        if(dic.containsValue(s)){
            Set<String> keys = dic.keySet();
            Iterator<String> kIter = keys.iterator();
            while (kIter.hasNext()){
                String k = kIter.next();
                String v = dic.get(k);
                if(v.equals(s)){
                    System.out.println(s + "의 단어는 " + k);
                } else {
                    System.out.println(s + "는(은) 사전에 없습니다.");
                }
            }
        }
    }//main end
}//class end
