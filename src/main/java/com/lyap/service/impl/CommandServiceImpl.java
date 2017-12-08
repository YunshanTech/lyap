package com.lyap.service.impl;

import com.lyap.entity.Command;
import com.lyap.entity.CommandExample;
import com.lyap.mapper.CommandMapper;
import com.lyap.page.PageResult;
import com.lyap.page.PageUtil;
import com.lyap.service.CommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandServiceImpl implements CommandService {
    @Autowired
    private CommandMapper commandMapper;

    @Override
    public PageResult<Command> findByPage(CommandExample example) {
        return PageUtil.queryByPage(() -> commandMapper.countByExample(example), () -> commandMapper.selectByExample(example));
    }

    @Override
    public Command findById(Integer id) {
        return commandMapper.selectByPrimaryKey(id);
    }

    @Override
    public Command insertOrUpdate(Command command) {
        if(command.getId() == null) {
            commandMapper.insertSelective(command);
        } else {
            commandMapper.updateByPrimaryKeySelective(command);
        }
        return command;
    }

    @Override
    public int deleteById(Integer id) {
        return commandMapper.deleteByPrimaryKey(id);
    }
}
