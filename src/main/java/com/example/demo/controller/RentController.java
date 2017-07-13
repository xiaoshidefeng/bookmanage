package com.example.demo.controller;

import com.example.demo.domain.Rent;
import com.example.demo.domain.Repository.RentRepository;
import com.example.demo.domain.Result;
import com.example.demo.service.impl.RentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by cw on 2017/7/13.
 */
@RestController
@RequestMapping("/api")
public class RentController {

    @Autowired
    private RentRepository rentRepository;

    @Autowired
    private RentServiceImp rentServiceImp;

    /**
     * 查询所有借书信息
     * @return
     */
    @GetMapping("/rents")
    public List<Rent> rents() {
        return rentRepository.findAll();
    }

    @PostMapping("/rentBook")
    public Result rentBook(Rent rent, BindingResult bindingResult) {
        return rentServiceImp.insertRent(rent, bindingResult);
    }
}
