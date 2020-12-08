package nl.thecheerfuldev.noframeworkdi.service;

import nl.thecheerfuldev.noframeworkdi.Chef;
import nl.thecheerfuldev.noframeworkdi.SousChef;

public class FiveStarRestaurantService implements RestaurantService {

    private Chef chef = new SousChef();

    public void takeOrder(String order) {
        chef.prepareOrder(order);
    }
}
