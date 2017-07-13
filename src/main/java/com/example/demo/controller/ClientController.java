package com.example.demo.controller;

import com.example.demo.domain.Client;
import com.example.demo.domain.Repository.ClientRepository;
import com.example.demo.domain.Result;
import com.example.demo.service.ClientService;
import com.example.demo.service.impl.ClientServiceImp;
import com.example.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * Created by cw on 2017/7/13.
 */
@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientServiceImp clientServiceImp;

    /**
     * 查询所有人员
     * @return
     */
    @GetMapping("/clients")
    public List<Client> clients() {
        return clientRepository.findAll();
    }


    /**
     * 添加一个人员
     * @param client
     * @param bindingResult
     * @return
     */
    @PostMapping("/insertClient")
    public Result insertClient(Client client, BindingResult bindingResult) {
        return clientServiceImp.insertClient(client, bindingResult);
    }

    /**
     * 删除一个人员
     * @param client_id
     */
    @PostMapping("deleteClient")
    public void deleteClient(@RequestParam("client_id") Integer client_id) {
        clientRepository.delete(client_id);
    }

    /**
     * 更新人员
     * @param client_id
     * @param client
     * @param bindingResult
     * @return
     */
    @PostMapping("/updateClient/{client_id}")
    public Result updateClient(@PathVariable("client_id") Integer client_id,
                               Client client, BindingResult bindingResult) {
        client.setClient_id(client_id);
        return clientServiceImp.updateClient(client, bindingResult);
    }

}
