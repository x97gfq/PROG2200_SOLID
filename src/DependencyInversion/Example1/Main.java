package DependencyInversion.Example1;

public class Main {
    public static void main(String[] args) {
        // Dependency Injection to provide the specific notification service
        NotificationService emailNotifier = new EmailNotifier();
        NotificationService smsSender = new SMSSender();

        // Clients use the high-level NotificationService interface
        NotificationClient emailClient = new NotificationClient(emailNotifier);
        NotificationClient smsClient = new NotificationClient(smsSender);

        emailClient.sendNotification("Hello, this is an email message.");
        smsClient.sendNotification("Hello, this is an SMS message.");
    }
}