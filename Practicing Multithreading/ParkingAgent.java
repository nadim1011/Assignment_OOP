public class ParkingAgent extends Thread {

    private final ParkingPool parkingPool;
    private final int agentId;

    public ParkingAgent(int agentId, ParkingPool parkingPool) {
        this.agentId = agentId;
        this.parkingPool = parkingPool;
    }

    @Override
    public void run() {
        try {
            while (true) {
                RegistrarParking request = parkingPool.takeRequest();
                System.out.println("Agent-" + agentId + " processing: " + request);

                Thread.sleep(1000); // simulate parking time

                System.out.println("Agent-" + agentId + " parked Car-" + request.getCarId());
            }
        } catch (InterruptedException e) {
            System.out.println("Agent-" + agentId + " stopped.");
        }
    }
}
