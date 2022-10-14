package com.yellow.mybatis.mapper;

import com.yellow.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author yellow
 * @version 1.0
 * MyBatis获取参数值的两种方式:#{}和${}
 * 1.若mappper接口方法的参数为单个的字面量类型
 * 此时可以通过#{}和${}以任意的内容获取参数值,一定要注意${}的单引号问题
 *
 * 2.若mapper接口方法的参数为多个的字面量类型
 * 此时Mybatis会将参数放在map集合中,以两种方式存储数据
 * a>以arg0,arg1为键,以参数为值
 * b>以param1,param2为键,以参数为值
 * 因此,只需要通过#{}和${}访问map集合的键,就可以获取相对应的值
 *
 * 3.若mapper接口方法的参数为map集合类型的参数
 * 只需要通过#{}和${}访问map集合的键,就可以获取相对应的值
 *
 * 4.若mapper接口方法的参数为实体类类型的参数
 * 只需要通过#{}和${}访问实体类中的属性名,就可以获取相对应的属性值
 *
 * 5.可以在mapper接口方法的参数上设置@Param注解
 * 此时MyBatis会将这些参数放在map中,以两种方式进行存储
 * a>以@Param注解的value属性值为键,以参数为值
 * b>以param1,param2为键,以参数为值
 */
public interface UserMapper {
    /**
     * 根据用户名查询用户文件
     * @param username
     * @return
     */
    User getUserByUsername(String username);


    User checkLogin(String username,String password);

    User checkLoginByMap(Map<String,Object> map);

    int insertUser(User user);

    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
