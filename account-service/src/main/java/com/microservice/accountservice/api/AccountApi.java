package com.microservice.accountservice.api;

import com.microservice.accountservice.model.Account;
import com.microservice.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
/*
localhost:8080/account
 */

public class AccountApi {

   /* @Autowired //IOC  de  anastasyonlar(service,component) sayesinde oluşan instance ları buraya inject ediyoruz.
    AccountService accountService;
    */

    //    Constructor Injection:Önerilen.Daha performanslı

    private final AccountService accountService;

    public AccountApi(AccountService accountService) {
        this.accountService = accountService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable("id") String id) {
        Account account = accountService.get(id);
        return new ResponseEntity<Account>(account, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Account> save(Account account) {
        Account accountSave = accountService.save(account);
        return new ResponseEntity<Account>(accountSave, HttpStatus.CREATED);
    }


    public ResponseEntity<Account> update(Account account) {

        Account accountUpdate = accountService.update(account);
        return new ResponseEntity<Account>(accountUpdate, HttpStatus.CREATED);

    }


    public void delete(String id) {
        accountService.delete(id);
    }

    public ResponseEntity<Account> pagination() {
        return null;
    }


}



