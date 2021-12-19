package com.bytedance.globalpayment.iap.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.enums.OrderStateEnum;

public class OrderStateInfo {
    private String orderId;
    private OrderStateEnum orderState;
    private String productId;

    static {
        Covode.recordClassIndex(17666);
    }

    public String getOrderId() {
        return this.orderId;
    }

    public OrderStateEnum getOrderState() {
        return this.orderState;
    }

    public String getProductId() {
        return this.productId;
    }

    public OrderStateInfo setOrderId(String str) {
        this.orderId = str;
        return this;
    }

    public OrderStateInfo setOrderState(OrderStateEnum orderStateEnum) {
        this.orderState = orderStateEnum;
        return this;
    }

    public OrderStateInfo setProductId(String str) {
        this.productId = str;
        return this;
    }
}
