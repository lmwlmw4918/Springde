package com.ithei.dao.imp;

import com.ithei.dao.RoleDao;
import com.ithei.domain.Role;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RoleDaoImp implements RoleDao {


    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Role> findALL() {
        return  jdbcTemplate.query("select * from sys_role", new BeanPropertyRowMapper<Role>(Role.class));

    }

    @Override
    public List<Role> findByUserid(Long id) {
        return  jdbcTemplate.query("select * from sys_user_role ur,sys_role r where ur.roleId=r.id and ur.userId=?",new BeanPropertyRowMapper<Role>(Role.class),id);
    }
}
