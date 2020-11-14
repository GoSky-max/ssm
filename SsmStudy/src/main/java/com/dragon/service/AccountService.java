package com.dragon.service;

import com.dragon.pojo.Account;

import java.util.List;

/**
 * @author Dragon
 * @create 2020-10-04-13:26
 */
public interface AccountService {
    public List<Account> findAll();

    public void saveAccount(Account account);
}
