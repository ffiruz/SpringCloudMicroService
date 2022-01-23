package com.microservice.accountservice.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration  //Bir konfigurasyon dosyası olduğunu Springe tanıtıyoruz.
@EnableCassandraRepositories //Cssandra repositorsini enable ediyoruz.
public class CassandraConfiguration extends AbstractCassandraConfiguration {
    //AbstractCassandraConfiguration ile Cassandra db konfigurasyonlarını içerir.
    // Biz buradaki bazı alanları override edebiliriz.port ve contactPoint gibi.
    //keyspaceName metodu ise override edilmek zorunda.
    //Bütün konfigurasyonumuz bu class aracılığıyla olacak.Ve db config e aracılık edecek.

    @Value("${spcloud.cassandra.keyspace.name}") //apllcation-properties içindeki alandan alıyor.
    private String keyspaceName;

    @Value("${spcloud.cassandra.contact.point}") //apllcation-properties içindeki alandan alıyor.
    private String contactPoint;

    @Value("${spcloud.cassandra.port}") //apllcation-properties içindeki alandan alıyor.
    private int port;

    @Override
    protected String getKeyspaceName() {
        return keyspaceName;
    }

    @Override
    protected String getContactPoints() {
        return contactPoint;
    }

    @Override
    protected int getPort() {
        return port;
    }

    @Override
    public SchemaAction getSchemaAction() {  //Şemamızı konfigurasyona bağlıyoruz.
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{"com.microservice.accountservice"};
    }
    @Override
    public  CassandraClusterFactoryBean cluster()
    {

    }
}
