package com.lyap.mapper;

import com.lyap.entity.NewIO;

import java.util.List;

public interface NewIOMapper {

    void insert(NewIO newIO);

    List<NewIO> findAll();

}
