package com.yellow.mybatis.mapper;

import com.yellow.mybatis.pojo.User;

import java.util.List;

/**
 * @author yellow
 * @version 1.0
 */
public interface UserMapper {
    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 根据查询单个用户信息
     * @return
     */
    User getUserById();

    List<User> getAllUser();
}
