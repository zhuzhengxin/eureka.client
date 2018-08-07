package eureka.client.controller;

import eureka.client.model.User;
import eureka.client.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "user")
public class UserController {
    @Resource
    private UserService userService;


@RequestMapping(value = "/get")
public User getUser(@RequestParam Integer id){
    return userService.selectByPrimaryKey(1);
}


}
