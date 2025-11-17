public class MainClass {

    public static void main(String[] args) throws Exception {

        ParkingPool parkingPool = new ParkingPool();

        // Number of agents working
        int NUMBER_OF_AGENTS = 3;

        // Start agent threads
        for (int i = 1; i <= NUMBER_OF_AGENTS; i++) {
            new ParkingAgent(i, parkingPool).start();
        }

        // Simulate N car arrivals
        int TOTAL_CARS = 10;
        for (int car = 1; car <= TOTAL_CARS; car++) {
            RegistrarParking req = new RegistrarParking(car);
            parkingPool.addParkingRequest(req);

            Thread.sleep(300); // new car arriving every 0.3 sec
        }

        // Main thread ends, workers continue
    }
}
