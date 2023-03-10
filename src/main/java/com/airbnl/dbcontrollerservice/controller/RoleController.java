package com.airbnl.dbcontrollerservice.controller;

import com.airbnl.dbcontrollerservice.model.Role;
import com.airbnl.dbcontrollerservice.service.interfaces.IRoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    private final IRoleService roleService;

    public RoleController(IRoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/getAllRoles")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/getRoleById")
    public Role getRoleById(@RequestParam("roleId") long roleId) {
        return roleService.getRoleById(roleId);
    }
}
