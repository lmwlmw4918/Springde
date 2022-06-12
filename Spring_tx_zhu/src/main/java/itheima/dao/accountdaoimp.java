package itheima.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("accountDao")
public class accountdaoimp implements accountdao{
        @Autowired
        private JdbcTemplate jdbcTemplate;

//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public void in(String name, String namec, int money) {
        jdbcTemplate.update("update account set  money=money+? where name=?",money,name);
    }

    @Override
    public void outc(String name, String namec, int money) {
        jdbcTemplate.update("update account  set money=money-? where name=?",money,namec);

    }
}
