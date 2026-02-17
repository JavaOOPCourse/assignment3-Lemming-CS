public class StreamingService extends Service
        implements PremiumFeature {

    // TODO: declare premium field
    private boolean isPremium = false;

    // TODO: constructor
    public StreamingService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {

        // TODO:
        // check if service is active
        if (super.getIsActive()) {
            // print different message for premium and normal
            if (isPremium) {
                System.out.println("Premium streaming service " + super.getServiceName() + " is performing");
            }
            else {
                System.out.println("Streaming service " + super.getServiceName() + " is performing");
            }
        }
        else {
            System.out.println("Streaming service " + super.getServiceName() + " is NOT active");
        }


    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // set premium = true
        isPremium = true;
        // print message
        System.out.println("Upgraded "+ super.getServiceName() + " to premium ");

    }
}