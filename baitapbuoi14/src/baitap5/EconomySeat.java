package baitap5;

public class EconomySeat extends Seat {
    public EconomySeat(String seatNumber, double price) {
        super(seatNumber, price);
    }

    @Override
    public double calculateFinalPrice() {
        return price;
    }
}
