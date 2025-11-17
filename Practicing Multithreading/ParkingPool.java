import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ParkingPool {

    private final BlockingQueue<RegistrarParking> parkingQueue = new LinkedBlockingQueue<>();

    // Add request to queue
    public void addParkingRequest(RegistrarParking request) throws InterruptedException {
        parkingQueue.put(request);
        System.out.println("Added → " + request);
    }

    // Take request for processing
    public RegistrarParking takeRequest() throws InterruptedException {
        return parkingQueue.take();
    }
}
