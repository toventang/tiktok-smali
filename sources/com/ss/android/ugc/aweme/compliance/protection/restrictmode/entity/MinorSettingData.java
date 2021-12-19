package com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class MinorSettingData {
    @c(a = "event_type")
    private int eventType;
    @c(a = "event_value")
    private String eventValue;
    @c(a = "password")
    private String password;

    static {
        Covode.recordClassIndex(48361);
    }

    public int getEventType() {
        return this.eventType;
    }

    public String getEventValue() {
        return this.eventValue;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEventType(int i2) {
        this.eventType = i2;
    }

    public void setEventValue(String str) {
        this.eventValue = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }
}
