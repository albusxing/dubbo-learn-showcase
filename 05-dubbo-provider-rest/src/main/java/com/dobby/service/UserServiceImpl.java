package com.dobby.service;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author liguoqing
 */
public class UserServiceImpl implements UserService {

    /**
     * 生成用户id
     */
    private final AtomicLong idGen = new AtomicLong();

    @Override
    public User getUser(Long id) {
        System.out.println("UserServiceImpl Provider {id} : " + id);
        return new User(id, "username" + id);
    }

    @Override
    public Long registerUser(User user) {
        System.out.println("Username is " + user.getName());
        return idGen.incrementAndGet();
    }
}
