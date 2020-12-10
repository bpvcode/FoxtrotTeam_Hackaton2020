package org.aguilerasTeam.shout;

import org.aguilerasTeam.shout.models.Events;
import org.aguilerasTeam.shout.models.ONG;
import org.aguilerasTeam.shout.models.Products;
import org.aguilerasTeam.shout.models.Users;
import org.aguilerasTeam.shout.services.*;
import org.h2.engine.User;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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


        /*AuthServices authServices = new AuthServices();
        MenuServices menuServices = new MenuServices();
        UsersServices usersServices = new UsersServices();

        authServices.setMenuServices(menuServices);


        Date date = new Date();



        Users user1 = new Users("bpvcode", "xxx", "Bruno", "Vilar", "bruno@gmail.com", 100);
        authServices.registUser(user1);


        authServices.authenticateUser("bpvcode","xxx");

        menuServices.distributeCurrentUser();

        System.out.println(usersServices.getCurrentUser().getAccount());
        usersServices.addMoney(50);
        System.out.println(usersServices.getCurrentUser().getAccount());


        usersServices.getCurrentUser().getEventsList().add(new Events("OLA", 5,"hey",date,1));

        EventsServices eventsServices = new EventsServices();

        System.out.println("====================================");
        System.out.println(date);

        System.out.println("EVENTS LIST"+usersServices.getCurrentUser().getEventsList().size());

        eventsServices.creteNewEvent("BEBIANAS GONNA BEBIATE", 20, "Hackaton", date, 0);

        System.out.println("EVENTS LIST"+usersServices.getCurrentUser().getEventsList().size());

        Users user2 = new Users("nuriaFOfinha", "fofi", "Nuria", "Pinto", "nuria@gmail.com", 0);

        System.out.println("USER LIST"+eventsServices.getEventsList().get(1).getUserList().size());

        eventsServices.addUser("BEBIANAS GONNA BEBIATE",user2);

        System.out.println("USER LIST"+eventsServices.getEventsList().get(1).getUserList().size());

        System.out.println(usersServices.getCurrentUser().getEventsList().get(1).getName());

        List<Users> usersList = eventsServices.getEventsList().get(1).getUserList();

        for (Users user : usersList
             ) {
            System.out.println(user.getFirstName());
        }*/
        Date date = new Date();
        Users user1 = new Users("bpvcode", "xxx", "Bruno", "Vilar", "bruno@gmail.com", 100);
        Users user2 = new Users("nuriaFOfinha", "fofi", "Nuria", "Pinto", "nuria@gmail.com", 0);
        Users user3 = new Users("asdggasd", "fasdgfi", "adfg", "Piadfg", "nfdga@gmail.com", 555);
        AuthServices authServices = new AuthServices();
        MenuServices menuServices = new MenuServices();
        UsersServices usersServices = new UsersServices();
        EventsServices eventsServices = new EventsServices();
        ONGServices ongServices = new ONGServices();
        ProductsServices productsServices = new ProductsServices();

        authServices.setMenuServices(menuServices);

        menuServices.setUsersServices(usersServices);
        menuServices.setEventsServices(eventsServices);
        menuServices.setOngServices(ongServices);
        menuServices.setProductsServices(productsServices);

        authServices.registUser(user1);
        authServices.registUser(user2);
        authServices.registUser(user3);
        authServices.authenticateUser("bpvcode","xxx");
        menuServices.distributeCurrentUser();

        eventsServices.createNewEvent("BEBIANAS GONNA BEBIATE", 20, "Hackaton", date, 0);
        eventsServices.addUser("BEBIANAS GONNA BEBIATE",user2);
        eventsServices.addUser("BEBIANAS GONNA BEBIATE",user3);
        menuServices.distributeEvents();

        ONG ong1 = new ONG("bancoalimentar","917tiratirametemete@gmail.com");
        ongServices.addNewOng(ong1);
        menuServices.distributeONG();

        Products pro1 = new Products("dildo", 10,eventsServices.getOngList().get(0));
        Products pro2 = new Products("vibrador",25,eventsServices.getOngList().get(0));
        Products pro3 = new Products("anal beads",15,eventsServices.getOngList().get(0));
        productsServices.addProduct(pro1);
        productsServices.addProduct(pro2);
        productsServices.addProduct(pro3);
        productsServices.addNewProduct(pro1,pro2,pro3,0);

        eventsServices.finishEvent(0);

        System.out.println(user2.getUsersList());
        System.out.println(user2.getEventsList());
        System.out.println(user1.getUsersList());
        System.out.println(user1.getEventsList());

    }
}
