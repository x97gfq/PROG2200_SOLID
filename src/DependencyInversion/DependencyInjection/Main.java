package DependencyInversion.DependencyInjection;

public class Main {

    public static void main(String[] args) {

        Server serv = new Server();

        Client c = new Client(serv);
        System.out.println(c.GetServerDate());

        Client c1 = new Client(serv);
        System.out.println(c1.GetServerDate());

        Client c2 = new Client(serv);
        System.out.println(c2.GetServerDate());

        Client c3 = new Client(serv);
        System.out.println(c3.GetServerDate());

        Client c4 = new Client(serv);
        System.out.println(c4.GetServerDate());

    }

}
