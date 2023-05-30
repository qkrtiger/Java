//상품 정보를 저장하는 객체의 부모클래스
public class ProductInfo {
    //이름, 단가, 수량, 기한(날짜)
    private String prodName;
    private int prodPrice;
    private int prodAmount;
    private String prodDate;

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getProdAmount() {
        return prodAmount;
    }

    public void setProdAmount(int prodAmount) {
        this.prodAmount = prodAmount;
    }

    public String getProdDate() {
        return prodDate;
    }

    public void setProdDate(String prodDate) {
        this.prodDate = prodDate;
    }

    @Override//이 메소드로 각 필드의 값을 출력.
    public String toString() {
        return "제품명 : " + prodName + "\n"
                + "단가 : " + prodPrice + "\n"
                + "수량 : " + prodAmount + "\n"
                + "기한 : " + prodDate + "\n";
    }
}//class end
