package com.ironhack.crm.dao.manager;
import com.ironhack.crm.domain.models.Account;
import java.util.List;

public interface AccountManager {
    void createAccount(Account account);
    List<Account> checkAccounts();
}
