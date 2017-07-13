package com.example.demo.domain.Repository;

import com.example.demo.domain.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cw on 2017/7/13.
 */
public interface RentRepository extends JpaRepository<Rent, Integer> {

}
