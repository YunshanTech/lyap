CREATE TABLE
    `lyap`.user
    (
        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
        user_id VARCHAR(6) NOT NULL COMMENT '用户编号',
        username VARCHAR(10) NOT NULL COMMENT '账户名',
        password VARCHAR(8) NOT NULL COMMENT '密码',
        create_time DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
        last_mod_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL COMMENT '上次修改时间',
        mod_user_id VARCHAR(6) COMMENT '修改人编号',
        remarks VARCHAR(60) DEFAULT '' COMMENT '备注',
        PRIMARY KEY (id),
        UNIQUE INDEX idx_u_user_user_id(user_id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';



CREATE TABLE
    `lyap`.lock
    (
        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
        lock_id VARCHAR(8) NOT NULL COMMENT '门锁序号',
        power VARCHAR(2) NOT NULL COMMENT '电量',
        hardware_version VARCHAR(8) NOT NULL COMMENT '硬件版本',
        software_version VARCHAR(8) NOT NULL COMMENT '软件版本',
        password1 VARCHAR(6) COMMENT '密码1(非必填)',
        password2 VARCHAR(6) COMMENT '密码2(非必填)',
        cardno1 VARCHAR(8) COMMENT '刷卡卡号1(非必填)',
        cardno2 VARCHAR(8) COMMENT '刷卡卡号2(非必填)',
        status TINYINT(1) NOT NULL COMMENT '状态',
        create_time DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
        last_mod_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL COMMENT '上次修改时间',
        mod_user_id VARCHAR(6) COMMENT '修改人编号',
        remarks VARCHAR(60) DEFAULT '' COMMENT '备注(非必填)',
        PRIMARY KEY (id),
        UNIQUE INDEX idx_u_lock_lock_id(lock_id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='门锁表';



CREATE TABLE
    `lyap`.gatewaybox
    (
        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
        gatewaybox_id VARCHAR(8) NOT NULL COMMENT '网关盒序号',
        product_code VARCHAR(8) NOT NULL COMMENT '产品编码',
        hardware_version VARCHAR(8) NOT NULL COMMENT '硬件版本',
        software_version VARCHAR(8) NOT NULL COMMENT '软件版本',
        related_lock_id VARCHAR(8) COMMENT '关联门锁序号(非必填)',
        status TINYINT(1) NOT NULL COMMENT '状态',
        create_time DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
        last_mod_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL COMMENT '上次修改时间',
        mod_user_id VARCHAR(6) COMMENT '修改人编号',
        remarks VARCHAR(60) DEFAULT '' COMMENT '备注(非必填)',
        PRIMARY KEY (id),
        UNIQUE INDEX idx_u_gatewaybox_gatewaybox_id(gatewaybox_id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='网关盒表';



CREATE TABLE
    `lyap`.command
    (
        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
        command_function TINYINT(2) NOT NULL COMMENT '命令类型',
        command_description VARCHAR(24) NOT NULL COMMENT '命令描述',
        return_data_description VARCHAR(24) NOT NULL COMMENT '返回值描述',
        create_time DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
        last_mod_time DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL COMMENT '上次修改时间',
        mod_user_id VARCHAR(6) COMMENT '修改人编号',
        remarks VARCHAR(60) DEFAULT '' COMMENT '备注(非必填)',
        PRIMARY KEY (id),
        UNIQUE INDEX idx_u_command_command_function(command_function)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='命令表';

    

CREATE TABLE
    `lyap`.command_record
    (
        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
        command_function TINYINT(2) NOT NULL COMMENT '命令类型',
        return_data VARCHAR(24) COMMENT '返回值(非必填)',
        return_status TINYINT(1) NOT NULL COMMENT '返回状态',
        time DATETIME NOT NULL COMMENT '时间',
        remarks VARCHAR(60) DEFAULT '' COMMENT '备注(非必填)',
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='命令下达记录表';



CREATE TABLE
    `lyap`.dooroperation_record
    (
        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
        operation_function TINYINT(2) NOT NULL COMMENT '操作类型',
        operation_description VARCHAR(24) NOT NULL COMMENT '操作描述',
        operation_status TINYINT(1) NOT NULL COMMENT '操作状态',
        password VARCHAR(6) COMMENT '密码(非必填)',
        cardno VARCHAR(8) COMMENT '刷卡卡号(非必填)',
        time DATETIME NOT NULL COMMENT '时间',
        remarks VARCHAR(60) DEFAULT '' COMMENT '备注(非必填)',
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='开关门操作记录表';



CREATE TABLE
    `lyap`.heartbeat_record
    (
        id INT UNSIGNED NOT NULL AUTO_INCREMENT,
        gatewaybox_id VARCHAR(8) NOT NULL COMMENT '网关盒序号',
        heartbeat_time DATETIME NOT NULL COMMENT '心跳时间',
        dooroperation_record_id INT UNSIGNED COMMENT '开门操作记录序号(非必填)',
        powerdown_warning TINYINT(1) NOT NULL COMMENT '掉电警告',
        return_function TINYINT(2) COMMENT '返回类型(非必填)',
        return_status TINYINT(1) COMMENT '返回状态(非必填)',
        return_data VARCHAR(24) COMMENT '返回值(非必填)',
        remarks VARCHAR(60) DEFAULT '' COMMENT '备注(非必填)',
        PRIMARY KEY (id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='心跳记录表';

