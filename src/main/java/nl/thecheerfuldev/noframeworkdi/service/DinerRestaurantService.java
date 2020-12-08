package nl.thecheerfuldev.noframeworkdi.service;

import nl.thecheerfuldev.noframeworkdi.Chef;
import nl.thecheerfuldev.noframeworkdi.DinerChef;
import nl.thecheerfuldev.noframeworkdi.repository.InMemoryOrderRepository;
import nl.thecheerfuldev.noframeworkdi.repository.OrderRepository;

public class DinerRestaurantService implements RestaurantService {

    private final Chef chef;
    private final OrderRepository orderRepository;

    public DinerRestaurantService(Chef chef, OrderRepository orderRepository) {
        this.chef = chef;
        this.orderRepository = orderRepository;
    }

    public static DinerRestaurantService getInstance() {
        return new DinerRestaurantService(new DinerChef(), new InMemoryOrderRepository());
    }

    public void takeOrder(String order) {
        chef.prepareOrder(order);
        orderRepository.save(order);
    }
}
