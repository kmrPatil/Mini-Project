package com.project.mini.daoImpl;

import com.project.mini.dao.SweetDao;

import com.project.mini.daoImpl.rowmapper.SweetRowMapper;
import com.project.mini.model.SweetItem;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
public class SweetDaoImpl implements SweetDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<SweetItem> getAllSweets() {
       List<SweetItem> items =  jdbcTemplate.query("SELECT * FROM TBL_SWEETS", new SweetRowMapper<SweetItem>());
       return items;
    }

    @Override
    public String addSweets(SweetItem item) {

       int count = jdbcTemplate.update("INSERT INTO TBL_SWEETS (name, img, qty, price) VALUES (?,?,?,?)", new Object[]{item.getName(),item.getImg(),item.getQty(),item.getPrice()});
        log.info("Sweet added : {}",count);

        return  count>0 ? "Successfully added": "Something went wrong";
    }

    @Override
    public String updateSweets(String id, SweetItem item) {
        int count = jdbcTemplate.update("UPDATE  TBL_SWEETS SET name=?, price=?, qty=?, img=? where id=?",
                                new Object[]{item.getName(),item.getPrice(),item.getQty(),item.getImg(),id});
        log.info("Sweet updated : {}",count);
        return  count>0 ? "Successfully added": "Something went wrong";
    }
}
