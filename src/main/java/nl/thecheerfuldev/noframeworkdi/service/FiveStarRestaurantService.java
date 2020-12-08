package nl.thecheerfuldev.noframeworkdi.service;

import nl.thecheerfuldev.noframeworkdi.Chef;
import nl.thecheerfuldev.noframeworkdi.SousChef;
import nl.thecheerfuldev.noframeworkdi.repository.InMemoryOrderRepository;
import nl.thecheerfuldev.noframeworkdi.repository.OrderRepository;

public class FiveStarRestaurantService implements RestaurantService {

    private Chef chef = new SousChef();
    private OrderRepository orderRepository = new InMemoryOrderRepository();

    public void takeOrder(String order) {
        chef.prepareOrder(order);
        orderRepository.save(order);
    }
}
