package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class Barrage {
    @c(a = "content")
    private String content;
    @c(a = "left_diamond")
    private int leftDiamond;
    @c(a = "msg_id")
    private long msgId;
    @c(a = "order_id")
    private String orderId;
    @c(a = "msg")
    private String screenChatMsg;

    static {
        Covode.recordClassIndex(8661);
    }

    public String getContent() {
        return this.content;
    }

    public int getLeftDiamond() {
        return this.leftDiamond;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getScreenChatMsg() {
        return this.screenChatMsg;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setLeftDiamond(int i2) {
        this.leftDiamond = i2;
    }

    public void setMsgId(long j2) {
        this.msgId = j2;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setScreenChatMsg(String str) {
        this.screenChatMsg = str;
    }
}
