package soselab.easylearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import soselab.easylearn.client.UserClient;
import soselab.easylearn.dto.UserDTO;

import javax.ws.rs.PathParam;

/**
 * Created by bernie on 2016/9/13.
 */
@RestController
public class LoginController {

    @Autowired
    UserClient userClient;

    @RequestMapping(path = "/user/{userId}", method = RequestMethod.GET)
    public UserDTO login(@PathVariable String userId){
        return userClient.getUser(userId);
    }
}
