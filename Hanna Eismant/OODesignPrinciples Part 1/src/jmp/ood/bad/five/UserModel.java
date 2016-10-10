package jmp.ood.bad.five;

public class UserModel {

    private String id;
    private String name;
    private String password;


    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }


    public boolean checkPassword(final String password) {
        return this.password.equals(password);
    }
}
