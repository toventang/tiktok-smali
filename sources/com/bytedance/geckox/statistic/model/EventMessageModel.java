package com.bytedance.geckox.statistic.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class EventMessageModel {
    @c(a = "duration")
    private long duration;
    @c(a = "err_msg")
    private String errMsg;
    @c(a = "event_type")
    private int eventType;
    @c(a = "extra")
    private String extra;
    @c(a = "sub_type")
    private int subType;

    static {
        Covode.recordClassIndex(17473);
    }

    public void setDuration(long j2) {
        this.duration = j2;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setEventType(int i2) {
        this.eventType = i2;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setSubType(int i2) {
        this.subType = i2;
    }

    public EventMessageModel(int i2, int i3) {
        this.eventType = i2;
        this.subType = i3;
    }
}
