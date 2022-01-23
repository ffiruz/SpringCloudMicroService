package com.microservice.accountservice.service;

import com.microservice.accountservice.model.Account;
import com.microservice.accountservice.repository.AccountRepository;
import jdk.nashorn.internal.runtime.options.Option;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Service //Belli iş mantığını barındıra metodların buludnduğu anatatasyon.
/*
IOC (Spring Context içerisinde  bir classın instance ını oluşturmak için kullanılan anatasyonlar.
Component->Web bileşenleri içinde utility classlarının kullnması gereken anatasyon
Repository->Entegrasyon noktaların dakullnılan bir anatasyon.Veri tabanı gibi
 */
@RequiredArgsConstructor
public class AccountService {


    private final AccountRepository accountRepository;

    public Account get(String id) {
        return accountRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
        //Optional türünde bir değer döner.Bulursa datanın kendisini , bulamazsa IllegalArgumentException dönecek.
    }

    public Account save(Account account) {
        return accountRepository.save(account);
    }

    public Account update(String id ,Account account) {
        Assert.isNull(id,"Id can not be null..");
        Account accountUpdated=get(id);
        accountUpdated=account;
        return accountRepository.save(account);
    }


    public void delete(String id) {
        return;
    }

    public Account pagination() {
        return null;
    }


}
