package org.aguilerasTeam.shout;

import org.aguilerasTeam.shout.models.Events;
import org.aguilerasTeam.shout.models.ONG;
import org.aguilerasTeam.shout.models.Products;
import org.aguilerasTeam.shout.models.Users;


import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date date = new Date();

        Users user1 = new Users("bpvcode", "xxx", "Bruno", "Vilar", "bruno@gmail.com", 100);

        Users user2 = new Users("nuriaFOfinha", "fofi", "Nuria", "Pinto", "nuria@gmail.com", 0);

        Events events = new Events("ANDerdogs", 200, "Lindo evento", date);

        ONG ong = new ONG("Banco Alimentar", "banco@gmail.com");

        Products playstation =  new Products("Playstation",100,ong,15);
        Products xBox =  new Products("XBox",50,ong,15);
        Products boneco =  new Products("boneco",150,ong,15);

        Products[] products = new Products[]{playstation,xBox,boneco};

        user1.addEvent(events);
        user1.createWhishList(products);

        user2.addEvent(events);
        user2.createWhishList(products);

        events.addUser(user2);
        events.addUser(user1);


        System.out.println(user1.getAccount());
        user1.buyGift(playstation.getPrice());
        System.out.println(user1.getAccount());

        System.out.println(events.getUserList().size());
        System.out.println(user2.getEventsList().size());
        System.out.println(user1.getEventsList().size());
        System.out.println(user1.getWishList());
        System.out.println(user2.getWishList());

    }
}
