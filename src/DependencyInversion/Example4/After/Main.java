package DependencyInversion.Example4.After;

public class Main {

    public static void main(String[] args) {

        // Here, UserService depends on the UserRepository interface rather than a concrete implementation.
        // This allows for different implementations of UserRepository to be used without changing the UserService class.
        User user = new User();

        UserRepositoryImpl userRepository = new UserRepositoryImpl();

        UserService userService = new UserService(userRepository);

        userService.registerUser(user);

    }
}
