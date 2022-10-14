package com.yellow.mybatis.mapper;

import com.yellow.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author yellow
 * @version 1.0
 */
public interface EmpMapper {

    Emp getEmpByEmpId(@Param("empId") Integer empId);
}
