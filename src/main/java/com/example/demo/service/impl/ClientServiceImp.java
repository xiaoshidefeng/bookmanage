package com.example.demo.service.impl;

import com.example.demo.domain.Client;
import com.example.demo.domain.Repository.BookRepository;
import com.example.demo.domain.Repository.ClientRepository;
import com.example.demo.domain.Result;
import com.example.demo.service.ClientService;
import com.example.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by cw on 2017/7/13.
 */
@Service
public class ClientServiceImp implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> findAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Result insertClient(@Valid Client client, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return ResultUtil.error(0, bindingResult.getFieldError().getDefaultMessage());
        }

        return ResultUtil.success(clientRepository.save(client));
    }

    @Override
    public void deleteClient(Integer id) {

    }

    @Override
    public Result updateClient(@Valid Client client, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return ResultUtil.error(0, bindingResult.getFieldError().getDefaultMessage());
        }

        return ResultUtil.success(clientRepository.save(client));
    }

}
