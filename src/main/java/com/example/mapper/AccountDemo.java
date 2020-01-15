package com.example.mapper;

import com.example.bean.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhaohuilin
 * @create 2019-12-26 14:55
 */
@Mapper
public interface AccountDemo {
    @Select("select * from account where id=#{id}")
    Account findAccount(Integer id);
}
