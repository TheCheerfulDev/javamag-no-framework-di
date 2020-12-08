package nl.thecheerfuldev.noframeworkdi;

import nl.thecheerfuldev.noframeworkdi.repository.InMemoryOrderRepository;
import nl.thecheerfuldev.noframeworkdi.repository.OrderRepository;
import nl.thecheerfuldev.noframeworkdi.service.DinerRestaurantService;
import nl.thecheerfuldev.noframeworkdi.service.RestaurantService;

public class App {
    public static void main(String[] args) {
        Chef chef = new DinerChef();
        OrderRepository orderRepository = new InMemoryOrderRepository();
        RestaurantService restaurantService = new DinerRestaurantService(chef, orderRepository);
        restaurantService.takeOrder("Steak");
    }
}
