package SingleResponsibility.Activities.Activity1;

public class Main {

    public static void main(String[] args) {

        User user = new User();

        user.sendEmailToUser("Hello World");

        user.saveUserToDatabase();

    }
}
