package com.example.demo.service.impl;

import com.example.demo.domain.Client;
import com.example.demo.domain.Rent;
import com.example.demo.domain.Repository.BookRepository;
import com.example.demo.domain.Repository.ClientRepository;
import com.example.demo.domain.Repository.RentRepository;
import com.example.demo.domain.Result;
import com.example.demo.service.RentService;
import com.example.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by cw on 2017/7/13.
 */
@Service
public class RentServiceImp implements RentService {

    @Autowired
    private RentRepository rentRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Rent> findAllRent() {
        return null;
    }

    @Override
    @Transactional
    public Result insertRent(@Valid  Rent rent, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return ResultUtil.error(0, bindingResult.getFieldError().getDefaultMessage());
        }

        //根据图书Id获取图书名称
        rent.setBook_name(bookRepository.findOne(rent.getBook_id()).getName());
        //根据人员Id获取图书名称
        rent.setClient_name(clientRepository.findOne(rent.getClient_id()).getClientname());

        return ResultUtil.success(rentRepository.save(rent));
    }


}
