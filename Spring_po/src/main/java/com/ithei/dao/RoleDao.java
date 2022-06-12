package com.ithei.dao;

import com.ithei.domain.Role;

import java.util.List;

public interface RoleDao {
    List<Role> findALL();

    List<Role> findByUserid(Long id);
}

