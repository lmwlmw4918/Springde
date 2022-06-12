package com.itheima.domain;

import java.util.Date;

public class Order {
    private int id;
    private Date ordertime;
    private double total;
    private User user;

    public Order() {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private int uid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrdetime() {
        return ordertime;
    }

    public void setOrdetime(Date ordetime) {
        this.ordertime = ordetime;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordetime=" + ordertime +
                ", total=" + total +
                ", user=" + user +
                ", uid=" + uid +
                '}';
    }
}
