package com.microservice.accountservice.repository;

import com.microservice.accountservice.model.Account;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CassandraRepository<Account,String > {
}
