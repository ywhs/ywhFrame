package com.ywh.security.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ywh.security.entity.SysRoleEntity;
import com.ywh.security.dao.SysRoleDao;
import com.ywh.security.service.SysRoleService;
import com.ywh.common.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * CreateTime: 2019-01-25
 * ClassName: SysRoleServiceImpl
 * Package: com.ywh.security.service.impl
 * Describe:
 *  业务逻辑接口的实现类
 * @author YWH
 */
@Service
public class SysRoleServiceImpl extends BaseServiceImpl<SysRoleDao, SysRoleEntity> implements SysRoleService {

    private static final Logger log = LoggerFactory.getLogger(SysRoleServiceImpl.class);

    @Autowired
    private SysRoleDao dao;

}
