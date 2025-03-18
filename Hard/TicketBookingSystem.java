class TicketBooking implements Runnable {
    private static final int TOTAL_SEATS = 10;
    private static boolean[] seats = new boolean[TOTAL_SEATS];
    private static final Object lock = new Object();
    private int seatNumber;
    private boolean isVIP;

    public TicketBooking(int seatNumber, boolean isVIP) {
        this.seatNumber = seatNumber;
        this.isVIP = isVIP;
    }

    @Override
    public void run() {
        synchronized (lock) {
            if (seatNumber < 0 || seatNumber >= TOTAL_SEATS || seats[seatNumber]) {
                System.out.println("Error: Seat already booked or invalid seat!");
                return;
            }
            seats[seatNumber] = true;
            System.out.println((isVIP ? "VIP Booking: " : "Regular Booking: ") + "Seat " + seatNumber + " confirmed.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Thread vipThread = new Thread(new TicketBooking(1, true));
        Thread regularThread = new Thread(new TicketBooking(1, false));

        vipThread.setPriority(Thread.MAX_PRIORITY);
        regularThread.setPriority(Thread.MIN_PRIORITY);

        vipThread.start();
        regularThread.start();
    }
}
