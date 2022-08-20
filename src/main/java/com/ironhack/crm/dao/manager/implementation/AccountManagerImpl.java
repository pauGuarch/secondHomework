package com.ironhack.crm.dao.manager.implementation;
import com.ironhack.crm.dao.manager.AccountManager;
import com.ironhack.crm.domain.models.Account;

import java.util.List;

public class AccountManagerImpl implements AccountManager {
    private List<Account> accounts = checkAccounts();
    @Override
    public void createAccount(Account account) {

    }

    @Override
    public List<Account> checkAccounts() {
        return null;
    }
}
