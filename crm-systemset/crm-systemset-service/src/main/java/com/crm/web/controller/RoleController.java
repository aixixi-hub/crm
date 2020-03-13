package com.crm.web.controller;

import com.crm.bean.Role;
import com.crm.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crm.enums.ExceptionEnums;
import com.crm.exception.CrmException;

@RestController
@RequestMapping("/role")
@Api(value = "crm-systemset",tags = {"角色管理"})
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/selectById")
    @ApiOperation("根据ID查询角色")
    public ResponseEntity selectById(Long id){
            Role role = roleService.findById(id);
            return ResponseEntity.status(200).body(role);

    }

    @GetMapping("/getAll")
    @ApiOperation("查询所有角色")
    public ResponseEntity selectAll(){
        return ResponseEntity.ok(roleService);
    }

}
