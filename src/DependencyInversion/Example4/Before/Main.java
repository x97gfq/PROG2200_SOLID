package DependencyInversion.Example4.Before;

public class Main {

    public static void main(String[] args) {

        // In this example, UserService directly depends on the concrete
        // implementation of UserRepository, which violates the DIP.

        User user = new User();

        UserService us = new UserService();

        us.registerUser(user);

    }
}
