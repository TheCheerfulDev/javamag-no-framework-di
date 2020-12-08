package nl.thecheerfuldev.noframeworkdi.factory;

import nl.thecheerfuldev.noframeworkdi.Chef;
import nl.thecheerfuldev.noframeworkdi.DinerChef;
import nl.thecheerfuldev.noframeworkdi.repository.InMemoryOrderRepository;
import nl.thecheerfuldev.noframeworkdi.repository.OrderRepository;
import nl.thecheerfuldev.noframeworkdi.service.DinerRestaurantService;
import nl.thecheerfuldev.noframeworkdi.service.RestaurantService;

public class DinerRestaurantFactory {

    public static RestaurantService createRestaurantService() {
        return new DinerRestaurantService(getDinerChef(), createOrderRepository());
    }

    public static OrderRepository createOrderRepository() {
        return new InMemoryOrderRepository();
    }

    public static Chef getDinerChef() {
        return new DinerChef();
    }
}
