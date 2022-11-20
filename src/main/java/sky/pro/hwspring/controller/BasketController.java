package sky.pro.hwspring.controller;
import org.springframework.web.bind.annotation.*;
import sky.pro.hwspring.model.Basket;
import sky.pro.hwspring.service.BasketService;

import java.util.List;

@RestController
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/store/order/get")
    public List<Basket> getOrder() {
        return this.basketService.getAllBaskets();
    }

    @GetMapping("/store/order/add")
    @ResponseBody
    public String addBasket(@RequestParam List<Integer> item) {
        this.basketService.addBasket(item);
        return "Корзины успешно добавлены ";
    }

}
