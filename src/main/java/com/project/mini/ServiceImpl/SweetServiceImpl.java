package com.project.mini.ServiceImpl;

import com.project.mini.Service.SweetService;
import com.project.mini.dao.SweetDao;
import com.project.mini.model.SweetItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SweetServiceImpl implements SweetService {

    @Autowired
    SweetDao sweetDao;

    @Override
    public List<SweetItem> getAllSweets() {
        return sweetDao.getAllSweets();
    }

    @Override
    public String addSweets(SweetItem item) {
        return sweetDao.addSweets(item);
    }

    @Override
    public String updateSweets(String id, SweetItem item) {
        return sweetDao.updateSweets(id,item);
    }


}
