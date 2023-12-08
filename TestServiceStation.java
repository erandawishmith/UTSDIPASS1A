import java.util.LinkedList;

public class TestServiceStation {
    private LinkedList<Service> services = new LinkedList<>();
    private LinkedList<Technician> technicians = new LinkedList<>();
    private ServiceStation serviceStation = new ServiceStation();

    public TestServiceStation() {
        // Adding some services
        services.add(new Service(1, "Oil Change", "Toyota", "2023-04-07", ServiceType.BODYWASH, Status.Booked));
        services.add(new Service(2, "Tire Replacement", "Honda", "2023-04-08", ServiceType.FULL_SERVICE, Status.Started));

        // Adding some technicians
        technicians.add(new Technician(1, "John Doe", "1234567890", "Senior"));
        technicians.add(new Technician(2, "Jane Smith", "0987654321", "Junior"));

        // Simulating operations
        addServices();
        addTechnicians();
        editService();
        editTechnician();
        showRecords();
    }

    private void addServices() {
        for (Service service : services) {
            serviceStation.addService(service);
        }
    }

    private void addTechnicians() {
        for (Technician technician : technicians) {
            serviceStation.addTechnician(technician);
        }
    }

    private void editService() {
        // Simulate editing a service
        Service serviceToEdit = services.getFirst();
        serviceToEdit.setModel("Ford");
        serviceToEdit.setDate("2023-04-09");
        serviceToEdit.setServiceType(ServiceType.OIL_CHANGE);
        serviceToEdit.setStatus(Status.Finished);
        serviceStation.editService(serviceToEdit);
    }

    private void editTechnician() {
        // Simulate editing a technician
        Technician technicianToEdit = technicians.getFirst();
        technicianToEdit.setContactNumber("1122334455");
        technicianToEdit.setLevel("Expert");
        serviceStation.editTechnician(technicianToEdit);
    }

    private void showRecords() {
        // Display all services and technicians
        serviceStation.showServices();
        serviceStation.showTechnicians();
    }

    public static void main(String[] args) {
        new TestServiceStation();
    }
}
