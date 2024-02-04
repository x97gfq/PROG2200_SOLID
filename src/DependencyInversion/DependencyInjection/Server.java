package DependencyInversion.DependencyInjection;

import java.util.Date;

public class Server {

    public Server() {
        System.out.println("NEW INSTANCE OF SERVER CREATED.");
    }
    public Date getServerDate() {
        Date d = new Date();
        return d;
    }

}
