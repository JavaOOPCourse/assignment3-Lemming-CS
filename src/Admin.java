public class Admin extends User {

    // TODO: constructor
    public Admin(String name, int id) {
        super(name, id);
    }

    @Override
    public void manageService(Service s) {

        // TODO:
        // print admin managing message
        System.out.println("Admin managing service " + s.getServiceName());

    }

    @Override
    public void useService(Service s) {

        // TODO:
        // print admin using message
        System.out.println("Admin using service " + s.getServiceName());
        // call performService()
        s.performService();

    }
}