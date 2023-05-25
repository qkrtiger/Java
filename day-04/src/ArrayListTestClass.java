import java.util.ArrayList;

public class ArrayListTestClass {
    public static void main(String[] args) {
        ArrayList<Integer> intArry = new ArrayList<>();

        //원소 추가 : add()
        intArry.add(10);
        intArry.add(20);
        intArry.add(30);
        intArry.add(1,40);

        System.out.println(intArry);
        System.out.println(intArry.size());

        //원소 하나씩 사용.(반복 출력)
        for(int i = 0; i<intArry.size(); i++){
            System.out.println(intArry.get(i));
        }
        //원소 변경 : set
        intArry.set(2,50);
        System.out.println(intArry);

        //원소 찾기 : indexOf(), contains()
        System.out.println(intArry.indexOf(10)); //없을 경우 -1, 있으면 0
        System.out.println(intArry.contains(60));

        intArry.remove(new Integer(10));
        System.out.println(intArry);

        intArry.clear();
        System.out.println(intArry);

        //정수 객체 생성
        //Integer iv = new Integer(10);
        //실수 객체 생성
        Float fv = new Float(1.5);

        int idx = intArry.indexOf(70);

        if(idx != -1){ //-1이 아니면(원소가 맞으면)
            intArry.remove(idx); //위치의 원소 삭제
        }
        else {
            System.out.println("찾는 원소 없음.");
        }
        System.out.println(intArry);

        //문자열 ArrayList
        ArrayList<String> strArr = new ArrayList<>();

        strArr.add("사과");
        strArr.add("배");
        strArr.add("포도");

        System.out.println(strArr);

        for(String s : strArr){
            System.out.println(s);
        }
    }
}
