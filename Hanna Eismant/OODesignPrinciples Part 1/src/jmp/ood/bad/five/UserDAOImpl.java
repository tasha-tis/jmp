package jmp.ood.bad.five;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {

    private static List<UserModel> users = new ArrayList<>();

    @Override
    public UserModel find(final String login) {
        return users.stream().filter(user -> user.getName().equals(login)).findFirst().get();
    }

}
