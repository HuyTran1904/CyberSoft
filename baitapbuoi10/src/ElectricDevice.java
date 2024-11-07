public class ElectricDevice {
    String eName;
    int eCapacity;
    public ElectricDevice(String eName, int eCapacity){
        this.eCapacity = eCapacity;
        this.eName = eName;
    }
    public void ePrint(){
        System.out.println("Tên thiết bị: " + eName);
        System.out.println("Công suất: " + eCapacity);
    }
}
