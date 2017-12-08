package com.lyap.service;

import java.util.List;

import com.lyap.entity.Demo;
import com.lyap.page.PageResult;

/**
 * Created by yeyang.lj on 2017/10/20.
 */
public interface DemoService {
    List<Demo> findAll();

    PageResult<Demo> findByPage();
}
