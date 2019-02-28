package com.mythghost.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mythghost.dubbo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getName() {
        return "mythghost";
    }
}
