package jmp.ood.bad.nine;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private User user;

    private List<Product> productsInBasket = new ArrayList<>();

    public User getUser() {
        return user;
    }

    public void setUser(final User user) {
        this.user = user;
    }

    public List<Product> getProductsInBasket() {
        return productsInBasket;
    }
}
