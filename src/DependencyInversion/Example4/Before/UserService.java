package DependencyInversion.Example4.Before;

class UserService {
    private UserRepository userRepository = new UserRepository();

    public void registerUser(User user) {
        // Business logic
        userRepository.save(user);
    }
}