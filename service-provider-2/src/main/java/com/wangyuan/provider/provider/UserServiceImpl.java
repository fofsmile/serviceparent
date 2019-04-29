package com.wangyuan.provider.provider;

import com.wangyuan.core.model.User;
import com.wangyuan.service.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        return new User(1L,"ribbon-provider3","123456","i am ribbon");
    }
}
