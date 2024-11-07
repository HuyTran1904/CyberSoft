public class Dryer extends ElectricDevice {
    String dryingTime;
    public Dryer(String eName, int eCapacity, String dryingTime) {
        super(eName, eCapacity);
        this.dryingTime = dryingTime;
    }

    public void ePrint(){
        System.out.println("--THÔNG TIN MÁY SẤY--");
        System.out.println("Sấy với thời gian " + dryingTime);
        super.ePrint();
    }
}
