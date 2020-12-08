package nl.thecheerfuldev.noframeworkdi;

public class SousChef implements Chef {
    public void prepareOrder(String order) {
        System.out.println("Preparing " + order + ", making it look like a feast.");
    }
}
