package com.project.mini.dao;


import com.project.mini.model.SweetItem;

import java.util.List;

public interface SweetDao {

    public List<SweetItem> getAllSweets();

    public String addSweets(SweetItem item);

    public String updateSweets(String id, SweetItem item);
}
