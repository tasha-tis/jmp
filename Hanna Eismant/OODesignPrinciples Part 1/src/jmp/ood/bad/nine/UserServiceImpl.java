package jmp.ood.bad.nine;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<>();
    private List<Basket> baskets = new ArrayList<>();

    @Override
    public User find(final String login) {
        return users.stream().filter(user -> user.getLogin().equals(login)).findFirst().get();
    }

    @Override
    public Basket getBasketForUser(final User user) {
        return baskets.stream().filter(basket -> basket.getUser().equals(user)).findFirst().get();
    }

}
