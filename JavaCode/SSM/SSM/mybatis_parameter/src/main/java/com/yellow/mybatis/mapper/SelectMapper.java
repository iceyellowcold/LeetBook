package com.yellow.mybatis.mapper;

import com.yellow.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author yellow
 * @version 1.0
 */
public interface SelectMapper {

    /**
     * 若sql语句查询的结果为多条时,一定不能以实体类类型作为方法的返回值
     * 否则会抛出异常
     * 若sql语句查询的结果为一条时,此时可以使用实体类类型或List集合类型作为方法的返回值
     */

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    /**
     * 查询用户的总数量
     *
     * @return
     */
    Integer getCount();

    /**
     * 根据id查询用户信息为map集合
     *
     * @param id
     * @return
     */
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有的User信息为Map集合
     * @return
     */
//    List<Map<String,Object>> getAllUserToMap();

    /**
     * 查询所有的用户信息为map集合
     * 若查询的数据有多条时,并且要将每条数据转换为map集合
     * 此时有两种解决方案:
     * 1.将mapper接口方法的返回值设置为泛型是map集合的list集合
     * List<Map<String,Object>> getAllUserToMap();
     * 2.可以将每条数据转换的map集合放在一个大的map中,但是必须要通过@Mapkey注解
     * 将查询的某个字段的值作为大的map的键
     * @return
     */
    @MapKey("id")
    Map<String,Object> getAllUserToMap();
}
