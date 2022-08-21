package com.ironhack.crm.dao.manager.implementation;
import com.ironhack.crm.dao.manager.AccountManager;
import com.ironhack.crm.domain.models.Account;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.ironhack.crm.utils.Utils.readAccounts;
import static com.ironhack.crm.utils.Utils.writeAccountsJSON;

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
        accounts.add(account);
        try {
            writeAccountsJSON(this.accounts);
        } catch (IOException e) {
            e.printStackTrace();
        }
        checkAccounts();
    }

    @Override
    public List<Account> checkAccounts() {
        return this.accounts = readAccounts();
    }
}
