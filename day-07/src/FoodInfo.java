public class FoodInfo extends ProductInfo {
    //추가되는 필드만 작성.
    private String foodOrigin;

    public String getFoodOrigin() {
        return foodOrigin;
    }

    public void setFoodOrigin(String foodOrigin) {
        this.foodOrigin = foodOrigin;
    }

    @Override
    public String toString() {
        return super.toString()
                + "원산지 : " + foodOrigin + "\n";
    }
}//class end
