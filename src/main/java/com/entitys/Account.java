package com.entitys;

public class Account {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.money
     *
     * @mbggenerated
     */
    private Integer money;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.id
     *
     * @return the value of account.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.id
     *
     * @param id the value for account.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.money
     *
     * @return the value of account.money
     *
     * @mbggenerated
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.money
     *
     * @param money the value for account.money
     *
     * @mbggenerated
     */
    public void setMoney(Integer money) {
        this.money = money;
    }
}