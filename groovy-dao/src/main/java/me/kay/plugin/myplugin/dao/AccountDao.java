package me.kay.plugin.myplugin.dao;

import me.kay.plugin.myplugin.entity.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {
    List<Account> findAll();
}
