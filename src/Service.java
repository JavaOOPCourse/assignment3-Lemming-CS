public abstract class Service {

    // TODO: declare private fields
    // serviceName
    private String serviceName;
    // serviceId
    private int serviceId;
    // isActive
    private boolean isActive = false;


    // TODO: constructor
    public Service(String serviceName, int serviceId) {
        this.serviceName = serviceName;
        this.serviceId = serviceId;
    }

    // TODO: activateService()
    public void activateService() {
        this.isActive = true;
        System.out.println("Service " + this.serviceName + " Activated");
    }

    // TODO: deactivateService()
    public void deactivateService() {
        this.isActive = false;
        System.out.println("Service " + this.serviceName + " Deactivated");
    }


    // TODO: getter for serviceName
    public String getServiceName() {
        return serviceName;
    }

    // TODO: getter for isActive
    public boolean getIsActive() {
        return isActive;
    }

    // TODO: abstract method performService()
    abstract public void performService();
}