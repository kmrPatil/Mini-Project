package com.project.mini.Service;

import com.project.mini.model.SweetItem;

import java.util.List;

public interface SweetService {

    public List<SweetItem> getAllSweets();

    public String addSweets(SweetItem item);

    public String updateSweets(String id, SweetItem item);
}
