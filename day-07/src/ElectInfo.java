public class ElectInfo extends ProductInfo {
    private int electSerial;
    private String electBrand;

    public int getElectSerial() {
        return electSerial;
    }

    public void setElectSerial(int electSerial) {
        this.electSerial = electSerial;
    }

    public String getElectBrand() {
        return electBrand;
    }

    public void setElectBrand(String electBrand) {
        this.electBrand = electBrand;
    }
    //Generate... > Getter and Setter
    @Override
    public String toString() {
        return super.toString()
                + "일련번호 : " + electSerial + "\n"
                + "제조사 : " + electBrand + "\n";
    }
}//class end
