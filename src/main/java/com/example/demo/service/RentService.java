package com.example.demo.service;

import com.example.demo.domain.Rent;
import com.example.demo.domain.Result;
import org.springframework.validation.BindingResult;

import java.util.List;

/**
 * Created by cw on 2017/7/13.
 */
public interface RentService {
    List<Rent> findAllRent();
    Result insertRent(Rent rent, BindingResult bindingResult);
}
