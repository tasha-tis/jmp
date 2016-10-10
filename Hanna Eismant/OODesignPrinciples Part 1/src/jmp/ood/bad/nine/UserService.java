package jmp.ood.bad.nine;

public interface UserService {

    User find(final String login);

    Basket getBasketForUser(final User user);

}
