import java.util.ArrayList;

public class ProductUseClass {
    static ArrayList<ProductInfo> pList = new ArrayList<>();

    public static void main(String[] args) {
        //ArrayList<FoodInfo> fList = new ArrayList<>();
        //ArrayList<ElectInfo> eList = new ArrayList<>();
        //=> 두 상품을 통합관리.

        int a = 100;
        float f = a;//형변환
        //class는 '사용자(개발자) 정의 자료형'이다.
        FoodInfo food1 = new FoodInfo();
        food1.setProdName("사과");
        food1.setProdPrice(500);
        food1.setProdAmount(10000);
        food1.setProdDate("2023-04-24");
        food1.setFoodOrigin("청송");

        ProductInfo pInfo = food1;//(자동)형변환. up-casting

        //System.out.println(pInfo.getFoodOrigin());
        //getFoodOrigin()는 ProductInfo에는 없는 메소드.
        //System.out.println(pInfo.getProdName());
        //ProductInfo에 있는 메소드는 사용 가능.

        FoodInfo food2 = (FoodInfo) pInfo;//원상복구.
        //System.out.println(food2.getFoodOrigin());
        //(강제)형변환. down-casting.

        pList.add(food1);

        FoodInfo food3 = new FoodInfo();
        food3.setProdName("배");
        food3.setProdPrice(1000);
        food3.setProdAmount(10000);
        food3.setProdDate("2023-04-24");
        food3.setFoodOrigin("나주");
        pList.add(food3);

        ElectInfo elt1 = new ElectInfo();
        elt1.setProdName("TV");
        elt1.setProdPrice(1000000);
        elt1.setProdAmount(10);
        elt1.setProdDate("2025-04-17");
        elt1.setElectSerial(12345);
        elt1.setElectBrand("LG");
        pList.add(elt1);

        outProduct();//메소드 호출
    }//main end

    public static void outProduct(){
        //목록의 제품을 사용하는 메소드.
        FoodInfo fInfo;
        ElectInfo eInfo;
        //p는 어떤 상품인가?
        //꺼낸 인스턴스를 원래의 참조변수에 담아줘야 함.
        //꺼낸 인스턴스는 어떤 클래스로 만든 것인가?
        // instanceof 연산자.
        for(ProductInfo p : pList){
            if(p instanceof FoodInfo){
                fInfo = (FoodInfo) p;
                System.out.println(fInfo.getFoodOrigin());
            }
            else {
                eInfo = (ElectInfo) p;
                System.out.println(eInfo.getElectBrand());
                System.out.println(eInfo.getElectSerial());
            }
        }

    }
}//class end
