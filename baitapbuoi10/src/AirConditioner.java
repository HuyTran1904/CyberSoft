public class AirConditioner extends ElectricDevice {
    String feature;
    public AirConditioner(String eName, int eCapacity, String feature) {
        super(eName, eCapacity);
        this.feature = feature;
    }

    public void ePrint(){
        System.out.println("--THÔNG TIN MÁY LẠNH--");
        System.out.println("Tính năng: " + feature);
        super.ePrint();
    }
}
