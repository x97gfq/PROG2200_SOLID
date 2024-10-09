package DependencyInversion.Example4.After;

class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        // Business logic
        userRepository.save(user);
    }
}
