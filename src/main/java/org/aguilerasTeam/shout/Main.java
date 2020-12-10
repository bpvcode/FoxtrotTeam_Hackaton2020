package org.aguilerasTeam.shout;

import org.aguilerasTeam.shout.models.Events;
import org.aguilerasTeam.shout.models.Users;
import org.aguilerasTeam.shout.services.AuthServices;
import org.aguilerasTeam.shout.services.EventsServices;
import org.aguilerasTeam.shout.services.MenuServices;
import org.aguilerasTeam.shout.services.UsersServices;

import java.util.Date;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        /*Users user1 = new Users("bpvcode", "xxx", "Bruno", "Vilar", "bruno@gmail.com", 100);

        Users user2 = new Users("nuriaFOfinha", "fofi", "Nuria", "Pinto", "nuria@gmail.com", 0);

        Date date = new Date();

        Events events = new Events("ANDerdogs", 200, "Lindo evento", date);

        ONG ong = new ONG("Banco Alimentar", "banco@gmail.com");

        Products playstation =  new Products("Playstation",100,ong,15);
        Products xBox =  new Products("XBox",50,ong,15);
        Products boneco =  new Products("boneco",150,ong,15);

        Products[] products = new Products[]{playstation,xBox,boneco};

        UsersServices usersServices;

        AuthServices authServices = new AuthServices();

        authServices.registUser(user1);
        authServices.registUser(user2);

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

         */


        AuthServices authServices = new AuthServices();
        MenuServices menuServices = new MenuServices();
        UsersServices usersServices = new UsersServices();

        authServices.setMenuServices(menuServices);


        Date date = new Date();



        Users user1 = new Users("bpvcode", "xxx", "Bruno", "Vilar", "bruno@gmail.com", 100);
        authServices.registUser(user1);


        authServices.authenticateUser("bpvcode","xxx");

        menuServices.distributeCurrentUser();

        System.out.println(UsersServices.currentUser.getAccount());
        usersServices.addMoney(50);
        System.out.println(UsersServices.currentUser.getAccount());


        UsersServices.currentUser.getEventsList().add(new Events("OLA", 5,"hey",date));

        EventsServices eventsServices = new EventsServices();

        System.out.println("====================================");
        System.out.println(date);

        System.out.println("EVENTS LIST"+UsersServices.currentUser.getEventsList().size());

        eventsServices.creteNewEvent("BEBIANAS GONNA BEBIATE", 20, "Hackaton", date);

        System.out.println("EVENTS LIST"+UsersServices.currentUser.getEventsList().size());

        Users user2 = new Users("nuriaFOfinha", "fofi", "Nuria", "Pinto", "nuria@gmail.com", 0);

        System.out.println("USER LIST"+eventsServices.getEventsList().get(1).getUserList().size());

        eventsServices.addUser("BEBIANAS GONNA BEBIATE",user2);

        System.out.println("USER LIST"+eventsServices.getEventsList().get(1).getUserList().size());

        System.out.println(UsersServices.currentUser.getEventsList().get(1).getName());

        List<Users> usersList = eventsServices.getEventsList().get(1).getUserList();

        for (Users user : usersList
             ) {
            System.out.println(user.getFirstName());
        }


    }
}
