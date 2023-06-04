import java.util.*;

public class MapExample {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();

            //리스트 활용 방법
            //List<Integer> list2 = new ArrayList<Integer>();
            //ArrayList<Integer> list3 = new ArrayList<>();
            list.add("치킨");
            list.add("피자");

            System.out.println(list);

            //리스트에서 값 삭제하기 : 값, 인덱스 번호
            list.remove("치킨");
            //list.remove(0);

            //값 변경하기
            //list.set(1,"통닭");

            //리스트 만들기
            List<String> foods = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                String food = scanner.nextLine();

                if (food.equals("0")) {
                    break;
                }

                if (foods.contains(food)) {
                    System.out.println("이미 목록에 있습니다.");
                } else {
                    foods.add(food);
                }
            }
            //리스트 정렬하기
            Collections.sort(foods);
            Collections.reverse(foods); //리스트 뒤집기
            Collections.shuffle(foods); //랜덤 섞기

            System.out.println(foods);

            //리스트에 요소 추가하기
            List<String> names = Arrays.asList("가","나","다");
            names.add("라");
            names.add("마");
            names.add("바");
        }
}//class end