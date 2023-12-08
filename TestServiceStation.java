//import java.util.Iterator;
//import java.util.LinkedList;
//
//public class TestServiceStation {
//    private LinkedList<Service> services = new LinkedList<>();
//    private LinkedList<Technician> technicians = new LinkedList<>();
//    private ServiceStation serviceStation = new ServiceStation();
//    private Services servicesList = new Services();
//
//    private Technicians techniciansList = new Technicians();
//
//    public TestServiceStation() {
//        // Adding some services
//        services.add(new Service(1, "Oil Change", "Toyota", "2023-04-07", ServiceType.FULL_SERVICE, Status.Booked));
//        services.add(new Service(2, "Tire Replacement", "Honda", "2023-04-08", ServiceType.BODYWASH, Status.Started));
//
//        // Adding some technicians
//        technicians.add(new Technician(1, "John Doe", "1234567890", "Senior"));
//        technicians.add(new Technician(2, "Jane Smith", "0987654321", "Junior"));
//
//        // Simulating operations
//        addServices(services);
//        addTechnicians();
//        editService();
//        editTechnician();
//        showRecords();
//    }
//
//    public static void main(String[] args) {
//        new TestServiceStation();
//    }
//
//    private void addServices(services) {
//        Iterator<Service> serviceIterator = services.iterator();
//        while (serviceIterator.hasNext()) {
//            Service service = serviceIterator.next();
//            serviceStation.addService();
//        }
//    }
//
//    private void addTechnicians() {
//        Iterator<Technician> technicianIterator = technicians.iterator();
//        while (technicianIterator.hasNext()) {
//            Technician technician = technicianIterator.next();
//            serviceStation.addTechnician();
//        }
//    }
//
//    private void editService() {
//        // Simulate editing a service
//        Service serviceToEdit = services.getFirst();
//        serviceToEdit.setModel("Ford");
//        serviceToEdit.setDate("2023-04-09");
//        serviceToEdit.setServiceType(ServiceType.OIL_CHANGE);
//        serviceToEdit.setStatus(Status.Finished);
//        serviceStation.editService();
//    }
//
//    private void editTechnician() {
//        // Simulate editing a technician
//        Technician technicianToEdit = technicians.getFirst();
//        technicianToEdit.setContactNumber("1122334455");
//        technicianToEdit.setLevel("Expert");
//        serviceStation.editTechnician();
//    }
//
//    private void showRecords() {
//        // Display all services and technicians
//        servicesList.show();
//        techniciansList.show();
//    }
//
//
//}
