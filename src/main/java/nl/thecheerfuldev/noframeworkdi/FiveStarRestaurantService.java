package nl.thecheerfuldev.noframeworkdi;

public class FiveStarRestaurantService implements RestaurantService {

    private Chef chef = new SousChef();

    public void takeOrder(String order) {
        chef.prepareOrder(order);
    }
}
