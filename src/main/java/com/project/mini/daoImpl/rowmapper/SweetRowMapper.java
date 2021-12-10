package com.project.mini.daoImpl.rowmapper;



import com.project.mini.model.SweetItem;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SweetRowMapper<T> implements RowMapper<SweetItem> {

    @Override
    public SweetItem mapRow(ResultSet rs, int rowNum) throws SQLException {
        SweetItem item = new SweetItem();

        item.setId(rs.getInt(1));
        item.setName(rs.getString(2));
        item.setImg(rs.getString(3));
        item.setQty(rs.getString(4));
        item.setPrice(rs.getDouble(5));

        return item;

    }
}
