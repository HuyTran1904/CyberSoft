package baitap5;

public class FirstClassSeat extends Seat {
    private static final double PREMIUM_FEE = 100.0;

    public FirstClassSeat(String seatNumber, double price) {
        super(seatNumber, price);
    }

    @Override
    public double calculateFinalPrice() {
        return price + PREMIUM_FEE;
    }
}
