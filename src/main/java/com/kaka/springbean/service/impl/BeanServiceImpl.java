package com.kaka.springbean.service.impl;

import com.kaka.springbean.config.CPSConfig;
import com.kaka.springbean.service.BeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gonglu
 * 2020/12/4
 */
@Service("beanServiceImpl")
public class BeanServiceImpl implements BeanService {

    @Autowired
    private CPSConfig config;

    public void print() {
        System.out.println(config.getBase());
    }

}
