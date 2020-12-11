package org.aguilerasTeam.shout.controllers;

import org.aguilerasTeam.shout.services.AuthServices;
import org.aguilerasTeam.shout.services.MenuServices;
import org.aguilerasTeam.shout.services.UsersServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AuthServiceControllers {

    private AuthServices authServices;
    private UsersServices usersServices;
    private MenuServices menuServices;

    /*@RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String showAuthenticate(Model model) {
        model.addAttribute("user" , new Users("bpvcode", "xxx", "Bruno", "Vilar", "bruno@gmail.com", 100));
        return "/login";
    }
     */

    @RequestMapping(method = RequestMethod.GET, path = {"/login", ""})
    public String showAuthenticate(Model model) {
        return "/login";
    }

    /*@RequestMapping(method = RequestMethod.POST, path = {"/menu"} , params = "action=Sign In")
    public String authenticate(@Valid @ModelAttribute("user") Users user, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "/login";
        }

        if(authServices
                .authenticateUser(
                        user
                .getUsername(),
                user
                .getPassword())){
            menuServices.setCurrentUser(user);
            menuServices.distributeCurrentUser(user);
            return "/menu";
        }

        return "/menu";
    }

     */

    @RequestMapping(method = RequestMethod.GET, path = {"/menu"})
    public String showMenu(Model model) {
        return "/menu";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/menu1"})
    public String showMenu1(Model model) {
        return "/menu1";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/menu2"})
    public String showMenu2(Model model) {
        return "/menu2";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/newwishlist"})
    public String newWishList(Model model) {
        return "/newWhishlist";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/settings"})
    public String showSettings(Model model) {
        return "/settings";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/wishlists"})
    public String showWishList(Model model) {
        return "/whishlists";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/wishlists1"})
    public String showWishList1(Model model) {
        return "/whishlists1";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/events"})
    public String showEvents(Model model) {
        return "events";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/events1"})
    public String showEvents1(Model model) {
        return "/events1";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/newEvent"})
    public String shownewEvent(Model model) {
        return "/newEvent";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/newEvent1"})
    public String shownewEvent1(Model model) {
        return "/newEvent1";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/ngo"})
    public String shownngo(Model model) {
        return "/ngo";
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/anderdogs"})
    public String showAnderdogs(Model model) {
        return "/anderdogs";
    }


}
