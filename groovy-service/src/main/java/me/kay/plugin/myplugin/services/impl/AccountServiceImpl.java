package me.kay.plugin.myplugin.services.impl;

import me.kay.plugin.myplugin.dao.AccountDao;
import me.kay.plugin.myplugin.entity.Account;
import me.kay.plugin.myplugin.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("find all account.");
        return null;
    }
}
