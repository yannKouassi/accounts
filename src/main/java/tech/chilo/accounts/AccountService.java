package tech.chilo.accounts;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
@RequestMapping("accounts")
public class AccountService {
    private final AccountRepository accountRepository;


    public void create(Account account){
        this.accountRepository.save(account);
    }

    public List<Account> search() {
        return this.accountRepository.findAll();
    }

}
