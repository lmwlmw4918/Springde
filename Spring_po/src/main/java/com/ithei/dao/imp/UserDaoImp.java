package com.ithei.dao.imp;

import com.ithei.dao.UserDao;
import com.ithei.domain.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.List;

public class UserDaoImp implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> findAll() {
        List<User> userList = jdbcTemplate.query("select * from sys_user", new BeanPropertyRowMapper<User>(User.class));
        return userList;
    }

    @Override
    public long save(User user) {
//        jdbcTemplate.update("insert into sys_user (?,?,?,?,?)",null,
//        user.getUsername(),user.getEmail(),user.getPassword(),user.getPhoneNum());

        PreparedStatementCreator creator = new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                //使用原始jdbc完成有个prepare statement的组键；
                PreparedStatement preparedStatement = con.prepareStatement("insert  into  sys_user values (?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
                preparedStatement.setObject(1, null);
                preparedStatement.setString(2, user.getUsername());
                preparedStatement.setString(3, user.getEmail());
                preparedStatement.setString(4, user.getPassword());
                preparedStatement.setString(5, user.getPhoneNum());
                return preparedStatement;
            }
        };
        //创建keyholder
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(creator, keyHolder);
        //获得生成的主键
        long userid = keyHolder.getKey().longValue();
        return userid;
    }

    @Override
    public void saveUserRoleRel(Long userId, long[] roleIds) {
        for (long roleId : roleIds) {
            jdbcTemplate.update("insert  into sys_user_role values (?,?)", userId, roleId);
        }


    }


    @Override
    public void deluser(Long userId) {
        jdbcTemplate.update("delete  from sys_user where id=?", userId);
    }

    @Override
    public void delUserRolerel(Long userId) {
        jdbcTemplate.update("delete  from sys_user_role where userId=?", userId);

    }

    @Override
    public User findByUsernameAndPassword(String username, String password) throws EmptyResultDataAccessException {
        User user = jdbcTemplate.queryForObject("select * from sys_user where username=? and password=?", new BeanPropertyRowMapper<User>(User.class), username, password);
        return user;
    }
}
