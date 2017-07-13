package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by cw on 2017/7/13.
 */
@Entity
public class Client {

    @Id
    @GeneratedValue
    private Integer client_id;

    private String clientname;
    private String clientaddress;

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getClientaddress() {
        return clientaddress;
    }

    public void setClientaddress(String clientaddress) {
        this.clientaddress = clientaddress;
    }
}
