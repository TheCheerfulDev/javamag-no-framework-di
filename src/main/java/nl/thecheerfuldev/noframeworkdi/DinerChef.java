package nl.thecheerfuldev.noframeworkdi;

public class DinerChef implements Chef {

    public void prepareOrder(String order) {
        System.out.println("Preparing " + order);
    }
}
