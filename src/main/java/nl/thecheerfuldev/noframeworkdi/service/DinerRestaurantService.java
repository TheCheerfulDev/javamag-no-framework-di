package nl.thecheerfuldev.noframeworkdi.service;

import nl.thecheerfuldev.noframeworkdi.Chef;
import nl.thecheerfuldev.noframeworkdi.DinerChef;

public class DinerRestaurantService implements RestaurantService {

    private Chef chef = new DinerChef();

    public void takeOrder(String order) {
        chef.prepareOrder(order);
    }
}
