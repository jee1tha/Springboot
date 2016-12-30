package employeeManager.controller;

import employeeManager.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * Created by jee1tha on 12/30/16.
 */
@Controller
public class userController {

    @Autowired
    private userService userService;

    public String setupForm(Map<String, Object> map){

        return "user";
    }
}
