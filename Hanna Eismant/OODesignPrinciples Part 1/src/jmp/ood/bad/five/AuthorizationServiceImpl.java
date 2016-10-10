package jmp.ood.bad.five;

public class AuthorizationServiceImpl implements AuthorizationService {
    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public boolean credentialsAreCorrect(final String login, final String password) {
        UserModel userModel = userDAO.find(login);
        return userModel.checkPassword(password);
    }
}
