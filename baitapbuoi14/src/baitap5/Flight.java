package baitap5;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private List<Seat> seats;

    public Flight() {
        seats = new ArrayList<>();
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public void bookSeat(String seatNumber) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                if (seat.getStatus().equals("trống")) {
                    seat.bookSeat();
                    System.out.println("Ghế " + seatNumber + " đã đặt thành công.");
                    return;
                } else {
                    System.out.println("Ghế " + seatNumber + " đã đặt trước đó.");
                    return;
                }
            }
        }
        System.out.println("Ghế " + seatNumber + " không tồn tại.");
    }

    public double calculateTotalRevenue() {
        double totalRevenue = 0;
        for (Seat seat : seats) {
            if (seat.getStatus().equals("đã đặt")) {
                totalRevenue += seat.calculateFinalPrice();
            }
        }
        return totalRevenue;
    }

    public void displaySeats() {
        for (Seat seat : seats) {
            System.out.println("Ghế: " + seat.getSeatNumber() + ", Giá: " + seat.calculateFinalPrice() + ", Trạng thái: " + seat.getStatus());
        }
    }
}