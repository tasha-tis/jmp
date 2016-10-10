package jmp.ood.bad.one;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
     private static List<User> users = new ArrayList<>();

     @Override
     public User find(final String login) {
        return users.stream().filter(user -> user.getLogin().equals(login)).findFirst().get();
     }
}
