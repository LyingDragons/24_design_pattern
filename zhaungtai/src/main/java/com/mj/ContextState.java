package com.mj;

public class ContextState  {

    private OrderState orderState;

    public ContextState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void switchStateOrder() {
        orderState.orderService();
    }

}
