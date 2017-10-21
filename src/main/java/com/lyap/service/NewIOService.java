package com.lyap.service;

import com.lyap.entity.NewIO;

import java.util.List;

public interface NewIOService {
    void insert(NewIO newIO);

    List<NewIO> findAll();
}
