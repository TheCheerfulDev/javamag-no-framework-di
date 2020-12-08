package nl.thecheerfuldev.noframeworkdi.service;

import nl.thecheerfuldev.noframeworkdi.Chef;
import nl.thecheerfuldev.noframeworkdi.repository.OrderRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class DinerRestaurantServiceTest {

    private Chef chefMock;
    private OrderRepository orderRepositoryMock;
    private DinerRestaurantService sut;

    @BeforeEach
    void setUp() {
        chefMock = Mockito.mock(Chef.class);
        orderRepositoryMock = Mockito.mock(OrderRepository.class);
        sut = new DinerRestaurantService(chefMock, orderRepositoryMock);
    }

    @Test
    void whenTakingOrderChefAndRepoAreCalled() {
        sut.takeOrder("Fries");
        Mockito.verify(chefMock, Mockito.times(1)).prepareOrder("Fries");
        Mockito.verify(orderRepositoryMock, Mockito.times(1)).save("Fries");
    }
}