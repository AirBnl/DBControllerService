package com.airbnl.dbcontrollerservice.controller;

import com.airbnl.dbcontrollerservice.model.Role;
import com.airbnl.dbcontrollerservice.service.interfaces.IRoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    private final IRoleService roleService;

    public RoleController(IRoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/getAll")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/getById")
    public Role getRoleById(@RequestParam("roleId") long roleId) {
        return roleService.getRoleById(roleId);
    }
    @PostMapping
    public Role save(@RequestBody Role role){
        return roleService.save(role);
    }
}
