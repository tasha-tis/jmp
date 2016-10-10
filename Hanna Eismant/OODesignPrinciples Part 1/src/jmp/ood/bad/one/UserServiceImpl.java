package jmp.ood.bad.one;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public User find(final String login) {
        return userDAO.find(login);
    }
}
