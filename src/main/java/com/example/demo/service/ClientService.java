package com.example.demo.service;

import com.example.demo.domain.Client;
import com.example.demo.domain.Result;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * Created by cw on 2017/7/13.
 */
public interface ClientService {
    public List<Client> findAllClient();
    public Result insertClient(Client client, BindingResult bindingResult);
    public void deleteClient(Integer id);
    public Result updateClient(Client client, BindingResult bindingResult);
}
