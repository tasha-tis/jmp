package jmp.ood.bad.four;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDAOImpl implements UserDAO {

    private static List<User> users = new ArrayList<>();

    @Override
    public User find(final String login) {
        Optional<User> first = users.stream().filter(user -> user.getLogin().equals(login)).findFirst();
        return !first.isPresent() ? new User(login) : first.get();
    }

}
