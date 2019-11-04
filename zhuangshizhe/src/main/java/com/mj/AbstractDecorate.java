package com.mj;

/**
 * @program: 24_design_pattern
 * @description: 抽象装饰类
 * @author: 马 洁
 * @create: 2019-11-04 23:35
 **/
public class AbstractDecorate extends GatewayCommonBehavior{

    private GatewayCommonBehavior gatewayCommonBehavior;

    public AbstractDecorate(GatewayCommonBehavior gatewayCommonBehavior){
        this.gatewayCommonBehavior=gatewayCommonBehavior;
    }

    @Override
    public void service() {
        if (gatewayCommonBehavior!=null){
            gatewayCommonBehavior.service();
        }
    }
}
