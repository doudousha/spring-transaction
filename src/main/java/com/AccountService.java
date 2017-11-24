package com;

import com.entitys.Account;
import com.mappers.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountService {


    @Autowired
    private TransactionTemplate txTemplate ;
    @Autowired
    private AccountMapper accountMapper ;

    public void transfer(final Account inAccount , final Account outAccount , final int money) {

        txTemplate.execute(new TransactionCallback<Void>() {
            public Void doInTransaction(TransactionStatus transactionStatus) {


                try {
                    inAccount.setMoney(outAccount.getMoney()+money);
                    inAccount.setMoney(inAccount.getMoney()-money);
                    accountMapper.updateByPrimaryKey(inAccount);
                    accountMapper.updateByPrimaryKey(outAccount);

                } catch (Exception e) {
                    e.printStackTrace();
                    transactionStatus.setRollbackOnly();
                }


                return null;
            }
        });
    }
}
