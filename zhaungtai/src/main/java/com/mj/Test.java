package com.mj;

public class Test {
    public static void main(String[] args) {
        ContextState contextState = new ContextState(new AlreadySignedOrderState());
        contextState.switchStateOrder();
    }
}
