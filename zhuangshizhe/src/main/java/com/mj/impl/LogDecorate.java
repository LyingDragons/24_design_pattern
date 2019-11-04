package com.mj.impl;

import com.mj.AbstractDecorate;
import com.mj.GatewayCommonBehavior;

/**
 * @program: 24_design_pattern
 * @description: 日志分析装饰类
 * @author: 马 洁
 * @create: 2019-11-04 23:43
 **/
public class LogDecorate extends AbstractDecorate {

    public LogDecorate(GatewayCommonBehavior gatewayCommonBehavior){
        super(gatewayCommonBehavior);
    }

    @Override
    public void service() {
        super.service();
        System.out.println("第2步，日志保留");
    }
}
