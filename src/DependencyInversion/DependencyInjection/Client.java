package DependencyInversion.DependencyInjection;

import java.util.Date;

public class Client {

    Server serv;

    public Client(Server server) {
        serv = server;
    }

    public Date GetServerDate() {
        Date d = serv.getServerDate();
        return d;
    }
}
