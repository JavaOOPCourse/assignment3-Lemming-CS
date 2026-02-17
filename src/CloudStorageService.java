public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    private boolean isPremium = false;

    // TODO: constructor
    public CloudStorageService(String serviceName, int serviceId) {
        super(serviceName, serviceId);
    }

    @Override
    public void performService() {

        // TODO:
        // check if active
        if (super.getIsActive()) {
            if (isPremium) {
                System.out.println("Accessing premium cloud storage service " + super.getServiceName());
            }
            else {
                // print cloud access message
                System.out.println("Accessing cloud storage service " + super.getServiceName());
            }

        }
        else {
            System.out.println("Cloud storage service" + super.getServiceName() + " not active");
        }


    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // enable premium
        isPremium = true;
        // print message
        System.out.println("Upgraded "+ super.getServiceName() + " to premium");

    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Generating the bill for cloud storage service " + super.getServiceName());
    }
}