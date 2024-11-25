package com.renu.Library.management.system.configuration;

import com.renu.Library.management.system.dal.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("mongodb")
public class MongodbConfig {
    @Bean
    public BookDao mongodbBookDao(){
        return new MongodbBookDao();
    }
    @Bean
    public MemberDao mongodbMemberDao(){
        return new MongodbMemberDao();
    }
    @Bean
    public BorrowListDao mongodbBorrowListDao(){
        return new MongodbBorrowListDao();

    }
}
