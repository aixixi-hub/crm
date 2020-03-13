package com.crm.web.controller;

import com.crm.bean.Role;
import com.crm.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crm.enums.ExceptionEnums;
import com.crm.exception.CrmException;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/selectById")
    public ResponseEntity selectById(Long id){
            Role role = roleService.findById(id);
            return ResponseEntity.status(200).body(role);

    }
}
