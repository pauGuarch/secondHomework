package com.ironhack.crm.dao.manager.implementation;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironhack.crm.dao.manager.AccountManager;
import com.ironhack.crm.domain.models.Account;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static com.ironhack.crm.utils.Utils.readAccounts;

public class AccountManagerImpl implements AccountManager {
    private static AccountManagerImpl accountManager;
    private List<Account> accounts;

    private AccountManagerImpl() {
        this.accounts = checkAccounts();
    }

    public static AccountManagerImpl getInstance() {
        if (accountManager == null) {
            accountManager = new AccountManagerImpl();
        }
        return accountManager;
    }


    @Override
    public void createAccount(Account account) {

    }

    @Override
    public List<Account> checkAccounts() {
        return this.accounts = readAccounts();
    }
}
