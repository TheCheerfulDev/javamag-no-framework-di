package nl.thecheerfuldev.noframeworkdi.service;

import nl.thecheerfuldev.noframeworkdi.Chef;
import nl.thecheerfuldev.noframeworkdi.SousChef;
import nl.thecheerfuldev.noframeworkdi.repository.InMemoryOrderRepository;
import nl.thecheerfuldev.noframeworkdi.repository.OrderRepository;

public class FiveStarRestaurantService implements RestaurantService {

    private final Chef chef;
    private final OrderRepository orderRepository;

    public FiveStarRestaurantService(Chef chef, OrderRepository orderRepository) {
        this.chef = chef;
        this.orderRepository = orderRepository;
    }

    public static FiveStarRestaurantService getInstance() {
        return new FiveStarRestaurantService(new SousChef(), new InMemoryOrderRepository());
    }

    public void takeOrder(String order) {
        chef.prepareOrder(order);
        orderRepository.save(order);
    }
}
