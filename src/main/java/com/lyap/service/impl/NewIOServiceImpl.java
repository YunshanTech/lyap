package com.lyap.service.impl;

import com.lyap.entity.NewIO;
import com.lyap.mapper.NewIOMapper;
import com.lyap.service.NewIOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewIOServiceImpl implements NewIOService {
    @Autowired
    private NewIOMapper newIOMapper;

    @Override
    public void insert(NewIO newIO) {
        this.newIOMapper.insert(newIO);
    }

    @Override
    public List<NewIO> findAll() {
        return this.newIOMapper.findAll();
    }
}
