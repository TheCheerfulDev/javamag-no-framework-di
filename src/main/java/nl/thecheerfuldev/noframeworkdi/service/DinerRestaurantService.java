package nl.thecheerfuldev.noframeworkdi.service;

import nl.thecheerfuldev.noframeworkdi.Chef;
import nl.thecheerfuldev.noframeworkdi.DinerChef;
import nl.thecheerfuldev.noframeworkdi.repository.InMemoryOrderRepository;
import nl.thecheerfuldev.noframeworkdi.repository.OrderRepository;

public class DinerRestaurantService implements RestaurantService {

    private Chef chef = new DinerChef();
    private OrderRepository orderRepository = new InMemoryOrderRepository();

    @Override
    public void takeOrder(String order) {
        chef.prepareOrder(order);
        orderRepository.save(order);
    }
}
