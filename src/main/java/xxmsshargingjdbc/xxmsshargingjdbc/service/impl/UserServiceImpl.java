package xxmsshargingjdbc.xxmsshargingjdbc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xxmsshargingjdbc.xxmsshargingjdbc.mapper.UserMapper;
import xxmsshargingjdbc.xxmsshargingjdbc.model.User;
import xxmsshargingjdbc.xxmsshargingjdbc.service.UserService;

/**
 * @author: shaozhixing
 * @date: 2020/4/30 14:59
 * @copyright: gofun
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(String userId) {
        return userMapper.selectById(userId);
    }
}
