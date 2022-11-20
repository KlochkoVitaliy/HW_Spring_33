package sky.pro.hwspring.service;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import sky.pro.hwspring.model.Basket;

import java.util.*;

@Service
public class BasketService {

    private final Basket basket;
    private final List<Basket> baskets = new ArrayList<>();

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public List<Basket> getAllBaskets() {
        return this.baskets;
    }

    public void addBasket(List<Integer> id) {
        Basket basket = new Basket();
        BasketService basketService = new BasketService(basket);
        for (Integer number : id) {
            basketService.basket.addIdToList(number);
        }
        this.baskets.add(basket);
    }
}
