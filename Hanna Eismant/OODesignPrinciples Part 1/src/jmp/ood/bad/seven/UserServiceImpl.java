package jmp.ood.bad.seven;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public void userIsFound(final User user) {
        System.out.println(user.getLogin());
    }

    @Override
    public void findUser(final String login) {
        userDAO.find(login, this);
    }
}
