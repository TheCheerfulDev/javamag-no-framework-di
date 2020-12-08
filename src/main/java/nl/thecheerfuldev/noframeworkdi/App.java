package nl.thecheerfuldev.noframeworkdi;

import nl.thecheerfuldev.noframeworkdi.factory.DinerRestaurantFactory;
import nl.thecheerfuldev.noframeworkdi.service.RestaurantService;

public class App {
    public static void main(String[] args) {
        RestaurantService restaurantService = DinerRestaurantFactory.createRestaurantService();
        restaurantService.takeOrder("Steak");
    }
}
