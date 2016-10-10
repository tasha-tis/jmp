package jmp.ood.bad.seven;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    private List<User> users = new ArrayList<>();

    @Override
    public void find(final String login, final UserService userService) {
        User user1 = users.stream().filter(user -> user.getLogin().equals(login)).findFirst().get();
        userService.userIsFound(user1);
    }

}
