package OpenClosed.NotificationService.After;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Notification> notifications = new ArrayList<>();

        EmailNotification en = new EmailNotification();
        notifications.add(en);

        SMSNotification sms = new SMSNotification();
        notifications.add(sms);

        NotificationService ns = new NotificationService(notifications);
        ns.sendNotification("this is a test notification");
    }

}
