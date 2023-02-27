package com.code.Challenges.Class;

import java.math.BigDecimal;

public class Customer {
    public String name;
    public BigDecimal money;
    public String time;
    public String beginTime;
    public String endTime;
    public void setName(String name) {
        this.name = name;
    }
    public void setMoney(String money) {
        this.money = new BigDecimal(money);
    }
    public void setBeginTime(String time) {
        this.beginTime = time;
    }
    public void setEndTime(String time) {
        this.endTime = time;
    }

}
