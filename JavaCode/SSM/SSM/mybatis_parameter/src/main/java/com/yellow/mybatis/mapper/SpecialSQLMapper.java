package com.yellow.mybatis.mapper;

import com.yellow.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yellow
 * @version 1.0
 */
public interface SpecialSQLMapper {

    public List<User> getUserByLike(String mohu);

    public void deleteMoreUser(@Param("ids") String ids);

    public List<User> getUserList(@Param("tablename") String tablename);

    void insertUser(User user);
}
