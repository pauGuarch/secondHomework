package com.ironhack.crm.dao.manager.implementation;
import com.ironhack.crm.dao.manager.AccountManager;
import com.ironhack.crm.domain.models.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountManagerImpl implements AccountManager {
    private List<Account> accounts = new ArrayList<>();
    @Override
    public void createAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public List<Account> checkAccounts() {
        return accounts;
    }
}
