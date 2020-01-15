package com.example.contellor;

import com.example.bean.Department;
import com.example.mapper.DepartmentDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhaohuilin
 * @create 2019-12-26 13:55
 */
@RestController
public class DepartmentContrlellor {
    @Autowired
    DepartmentDemo departmentDemo;

    @GetMapping("/department")
    public Department insertDept(Department department) {
        departmentDemo.insertDept(department);
        return department;


    }

    @GetMapping("/find")
    public List<Department> findAll() {
        List<Department> all = departmentDemo.findAll();
        return all;
    }

    @GetMapping("/find/{id}")
    public String findById(@PathVariable("id") Integer id) {
        return departmentDemo.findById(id);
    }

}
