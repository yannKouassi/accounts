package tech.chilo.accounts;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;


    public void createAccount(Account account){
        this.accountRepository.save(account);
    }

    public List<Account> search() {
        return this.accountRepository.findAll();
    }

}
