package com.example.demo.domain.Repository;

import com.example.demo.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cw on 2017/7/13.
 */
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
