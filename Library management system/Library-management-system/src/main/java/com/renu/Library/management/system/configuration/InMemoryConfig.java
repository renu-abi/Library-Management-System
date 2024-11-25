package com.renu.Library.management.system.configuration;

import com.renu.Library.management.system.dal.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("inmemory")
public class InMemoryConfig {

    @Bean
    public BookDao inmemoryBookDao(){
        return new InMemoryBookDao();
    }
    @Bean
    public MemberDao inmemoryMemberDao(){
        return new InMemoryMemberDao();
    }
    @Bean
    public BorrowListDao inmemoryBorrowListDao(){
        return new InMemoryBorrowListDao();
    }

}
