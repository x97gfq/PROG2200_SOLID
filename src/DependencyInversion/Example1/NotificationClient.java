package DependencyInversion.Example1;

// Low-level module
class NotificationClient {
    private NotificationService notificationService;

    public NotificationClient(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String message) {
        notificationService.sendNotification(message);
    }
}