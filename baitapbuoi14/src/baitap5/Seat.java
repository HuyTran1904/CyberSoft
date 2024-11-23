package baitap5;

public abstract class Seat {
    protected String seatNumber;
    protected double price;
    protected String status;

    public Seat(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        this.status = "trống";
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getStatus() {
        return status;
    }

    public void bookSeat() {
        if (status.equals("trống")) {
            status = "đã đặt";
        } else {
            System.out.println("Ghế đã đặt, không thể đặt lại.");
        }
    }

    public abstract double calculateFinalPrice();
}

