package com.example.accecingdatawithmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email){
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return userRepository.findAll(); // This returns a JSON or XML with the users
    }
}
