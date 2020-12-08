package nl.thecheerfuldev.noframeworkdi;

public class DinerRestaurantService implements RestaurantService {

    private Chef chef = new DinerChef();

    public void takeOrder(String order) {
        chef.prepareOrder(order);
    }
}
