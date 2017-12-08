package com.lyap.service.impl;

import com.lyap.entity.Demo;
import com.lyap.mapper.DemoMapper;
import com.lyap.page.PageResult;
import com.lyap.page.PageUtil;
import com.lyap.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yeyang.lj on 2017/10/20.
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public List<Demo> findAll() {
        return demoMapper.findAll();
    }

    private List<Demo> findAllByJdbcTemplate() {
        String sql = "select * from demo";
        BeanPropertyRowMapper<Demo> rowMapper = new BeanPropertyRowMapper<>(Demo.class);
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public PageResult<Demo> findByPage() {
        return PageUtil.queryByPage(demoMapper::countAll, demoMapper::findAll);
    }
}
