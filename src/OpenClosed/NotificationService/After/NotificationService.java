package OpenClosed.NotificationService.After;

import java.util.ArrayList;

class NotificationService {
    private ArrayList<Notification> notifications;

    public NotificationService(ArrayList<Notification> notifications) {
        this.notifications = notifications;
    }

    public void sendNotification(String message) {
        for (Notification notification : notifications) {
            notification.send(message);
        }
    }
}