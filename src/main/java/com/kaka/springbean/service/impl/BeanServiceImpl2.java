package com.kaka.springbean.service.impl;

import com.kaka.springbean.config.CPSConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gonglu
 * 2020/12/4
 */
@Service("beanServiceImpl2")
public class BeanServiceImpl2 extends BeanServiceImpl{

    @Autowired
    private CPSConfig cpsConfig;


}

