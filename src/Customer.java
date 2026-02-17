public class Customer extends User {

    // TODO: constructor
    public Customer(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageService(Service s) {

        // TODO:
        // print that customer cannot manage services
        System.out.println("Customer can't manage services");

    }

    @Override
    public void useService(Service s) {

        // TODO:
        // print customer using message
        System.out.println("Customer using service " + s.getServiceName());
        // call performService()
        s.performService();

    }
}