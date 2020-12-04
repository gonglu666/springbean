package com.kaka.springbean.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by gonglu
 * 2020/12/4
 */
@Component
@ConfigurationProperties("zhiyuan")
public class CPSConfig {

    private String base;

    private String baseSec;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getBaseSec() {
        return baseSec;
    }

    public void setBaseSec(String baseSec) {
        this.baseSec = baseSec;
    }
}
