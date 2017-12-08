package com.lyap.service;

import com.lyap.entity.Command;
import com.lyap.entity.CommandExample;
import com.lyap.page.PageResult;

public interface CommandService {
    PageResult<Command> findByPage(CommandExample example);

    Command findById(Integer id);

    Command insertOrUpdate(Command command);

    int deleteById(Integer id);
}
