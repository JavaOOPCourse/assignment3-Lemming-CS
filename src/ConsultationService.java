public class ConsultationService extends Service
        implements Billable {

    // TODO: constructor
    public ConsultationService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {

        // TODO:
        // check active
        if (super.getIsActive()) {
            // print consultation message
            System.out.println("Consultating Service " + super.getServiceName() + " is performing");
        }
        else {
            System.out.println("Consulting Service " + super.getServiceName() + " is not active");
        }



    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Generating the Bill for consultation service " + super.getServiceName());
    }
}