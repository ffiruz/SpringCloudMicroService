package com.microservice.accountservice.service;

import com.microservice.accountservice.model.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Service //Belli iş mantığını barındıra metodların buludnduğu anatatasyon.
/*
IOC (Spring Context içerisinde  bir classın instance ını oluşturmak için kullanılan anatasyonlar.
Component->Web bileşenleri içinde utility classlarının kullnması gereken anatasyon
Repository->Entegrasyon noktaların dakullnılan bir anatasyon.Veri tabanı gibi
 */
public class AccountService {


    public Account get(@PathVariable("id") String id)
    {
        return null;
    }


    public Account save(Account account)
    {
        return null;
    }


    public Account update(Account account)
    {
        return null;
    }


    public void delete(String id)
    {
        return;
    }

    public Account pagination()
    {
        return null;
    }




}
