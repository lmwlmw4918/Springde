package com.ithei.service.imp;

import com.ithei.dao.RoleDao;
import com.ithei.domain.Role;
import com.ithei.service.RoleService;

import java.util.List;

public class RoleServiceImp implements RoleService {



    private RoleDao roleDao;

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public List<Role> list() {
        List<Role> roleList=roleDao.findALL();
        return roleList;
    }
}
