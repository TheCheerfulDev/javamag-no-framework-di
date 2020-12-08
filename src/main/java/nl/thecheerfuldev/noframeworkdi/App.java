package nl.thecheerfuldev.noframeworkdi;

import nl.thecheerfuldev.noframeworkdi.service.DinerRestaurantService;
import nl.thecheerfuldev.noframeworkdi.service.RestaurantService;

public class App {
    public static void main(String[] args) {
        RestaurantService restaurantService = new DinerRestaurantService();
        restaurantService.takeOrder("Steak");
    }
}
