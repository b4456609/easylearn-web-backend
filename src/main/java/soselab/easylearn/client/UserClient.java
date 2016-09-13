package soselab.easylearn.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import soselab.easylearn.dto.UserDTO;

import java.util.List;

/**
 * Created by bernie on 2016/9/13.
 */
@FeignClient("easylearn-user")
public interface UserClient {
    @RequestMapping(method = RequestMethod.GET, value = "/user/{userId}/pack")
    UserDTO getUser(@PathVariable("userId") String userId);
}
