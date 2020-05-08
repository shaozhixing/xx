package xxmsshargingjdbc.xxmsshargingjdbc.service;

import xxmsshargingjdbc.xxmsshargingjdbc.model.User;

/**
 * @author: shaozhixing
 * @date: 2020/4/30 14:59
 * @copyright: gofun
 */
public interface UserService {

    User selectById (String userId);

}
