package com.ironhack.crm.dao.manager.implementation;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironhack.crm.dao.manager.AccountManager;
import com.ironhack.crm.domain.models.Account;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    private static void readAccounts(List<Account> accounts) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("./src/main/resources/data/account.json"));
            accounts = new Gson().fromJson(reader, new TypeToken<List<Account>>() {}.getType());
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
