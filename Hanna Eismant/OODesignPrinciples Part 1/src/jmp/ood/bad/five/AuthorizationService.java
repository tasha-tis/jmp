package jmp.ood.bad.five;

public interface AuthorizationService {

    boolean credentialsAreCorrect(final String login, final String password);

}
