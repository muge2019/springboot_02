package com.example.mapper;

import com.example.bean.Department;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhaohuilin
 * @create 2019-12-24 16:56
 */
@Mapper
public interface DepartmentDemo {
    @Select("select * from department where id=#{id}")
    Department findDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department (departmentName) values(#{departmentName})")
    int insertDept(Department department);

    @Select("select * from department")
    List<Department> findAll();

    @Select("select departmentName from department where id=#{id}")
    String findById(Integer id);

}
