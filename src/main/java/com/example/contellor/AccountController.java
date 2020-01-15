package com.example.contellor;

import com.example.bean.Account;
import com.example.mapper.AccountDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaohuilin
 * @create 2019-12-26 14:54
 */
@RestController
public class AccountController {
    @Autowired
    AccountDemo accountDemo;

    @GetMapping("/account/{id}")
    public Account findAccount(@PathVariable("id") Integer id) {
        return accountDemo.findAccount(id);
    }
}
