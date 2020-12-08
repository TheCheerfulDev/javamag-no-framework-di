package nl.thecheerfuldev.noframeworkdi.repository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryOrderRepository implements OrderRepository {

    private final List<String> orders = new ArrayList<>();

    @Override
    public void save(String order) {
        orders.add(order);
    }
}
