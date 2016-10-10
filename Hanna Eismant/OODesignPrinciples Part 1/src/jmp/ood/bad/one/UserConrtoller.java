package jmp.ood.bad.one;

public class UserConrtoller {

    private AuthorizationFacade authorizationFacade = new AuthorizationFacadeImpl();

    public String login(final String login, final String password) {
        User user = authorizationFacade.find(login);
        return user.getPassword().equals(password) ? "success" : "error";
    }
}
