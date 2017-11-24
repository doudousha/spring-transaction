package com.wangqing;


import com.entitys.Account;
import com.mappers.AccountMapper;

import com.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(value = {"classpath:conf/settings/spring-db.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService ;


    @Autowired
    private AccountMapper  accountMapper ;

    @Test
    public void transfer_test() {
        Account inAccount = accountMapper.selectByPrimaryKey(1L);
        Account outAccount = accountMapper.selectByPrimaryKey(2L);
        accountService.transfer(inAccount,outAccount ,20);
    }

    @Test
    public void test() {
        System.out.println(accountMapper==null);
    }
}
