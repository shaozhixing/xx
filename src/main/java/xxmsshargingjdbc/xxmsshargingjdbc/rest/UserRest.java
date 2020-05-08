package xxmsshargingjdbc.xxmsshargingjdbc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xxmsshargingjdbc.xxmsshargingjdbc.model.User;
import xxmsshargingjdbc.xxmsshargingjdbc.service.UserService;

/**
 * @author: shaozhixing
 * @date: 2020/4/30 15:22
 * @copyright: gofun
 */
@RestController
@RequestMapping("/user")
public class UserRest {

    @Autowired
    private UserService userService;

    @GetMapping("/selectById")
    public User selectById (@RequestParam(value = "userId") String userId) {
        return userService.selectById(userId);
    }

}
