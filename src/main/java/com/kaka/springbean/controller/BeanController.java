package com.kaka.springbean.controller;

import com.kaka.springbean.service.BeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gonglu
 * 2020/12/4
 */
@RestController
public class BeanController {

    @Autowired
    @Qualifier("beanServiceImpl")
    private BeanService beanService;

    @Autowired
    @Qualifier("beanServiceImpl2")
    private BeanService beanService2;

    @RequestMapping("/test")
    public void test() {
        beanService.print();
        beanService2.print();
    }

}
