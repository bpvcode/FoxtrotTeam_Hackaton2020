package org.aguilerasTeam.shout.controllers;

import org.aguilerasTeam.shout.services.AuthServices;
import org.aguilerasTeam.shout.services.UsersServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class AuthServiceControllers {

    private AuthServices authServices;
    private UsersServices usersServices;

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String showAuthenticate(Model model) {
        return "/login";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/menu"})
    public String showMenu(Model model) {
        return "/menu";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/newwishlist"})
    public String newWishList(Model model) {
        return "/newWhishlist";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/settings"})
    public String showSettings(Model model) {
        return "/settings";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/wishlist"})
    public String showWishList(Model model) {
        return "/whishlists";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/events"})
    public String showEvents(Model model) {
        return "/events";
    }


}
