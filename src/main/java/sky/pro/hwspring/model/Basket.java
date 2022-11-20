package sky.pro.hwspring.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@SessionScope
@Component
public class Basket {

    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    private final Integer id;
    private List<Integer> listId = new ArrayList<>();

    public Basket() {
        id = COUNTER.getAndIncrement();
    }

    public int getId() {
        return id;
    }

    public List<Integer> getListID() {
        return listId;
    }

    public void addIdToList (Integer id) {
        listId.add(id);
    }

}
