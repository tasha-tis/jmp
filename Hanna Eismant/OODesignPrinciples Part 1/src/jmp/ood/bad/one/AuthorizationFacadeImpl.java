package jmp.ood.bad.one;

public class AuthorizationFacadeImpl implements AuthorizationFacade {

    private UserService userService = new UserServiceImpl();

    @Override
    public User find(final String login) {
        return userService.find(login);
    }

}
