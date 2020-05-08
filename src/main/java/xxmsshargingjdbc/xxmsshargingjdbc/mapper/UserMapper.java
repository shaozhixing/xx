package xxmsshargingjdbc.xxmsshargingjdbc.mapper;

import xxmsshargingjdbc.xxmsshargingjdbc.model.User;

/**
 * @author: shaozhixing
 * @date: 2020/4/30 15:04
 * @copyright: gofun
 */
public interface UserMapper {

    public User selectById(String userId);

    int insert (User user);

}
