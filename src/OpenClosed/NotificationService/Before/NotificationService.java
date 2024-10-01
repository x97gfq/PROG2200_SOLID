package OpenClosed.NotificationService.Before;

class NotificationService {
    private EmailNotification emailNotification = new EmailNotification();

    public void sendNotification(String message) {
        emailNotification.sendEmail(message);
    }
}
