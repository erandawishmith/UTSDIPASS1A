public class ServiceStationTest extends Records {

    @Override
    public Service find(int id) {
        return (Service) super.find(id);
    }

    private static Services servicesList = new Services();
    public void main(String[] args) {
        // Create an instance of ServiceStation
        ServiceStation serviceStation = new ServiceStation();

        // Test adding a service using the addService method
        testAddService(serviceStation);
    }

    private void testAddService(ServiceStation serviceStation) {
        System.out.println("Testing addService method:");

        // Sample data for testing
        Service service = new Service(++id,
        "John Doe",
        "Car Model",
        "2023-01-05",
        ServiceType.FULL_SERVICE,
        Status.Processing);

        // Add service using the addService method
        super.add(service);
    }
}
