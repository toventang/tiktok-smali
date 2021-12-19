package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;

public enum as {
    TEST("TEST"),
    FIRE("FIRE"),
    GOOGLE("GooglePay"),
    DIAMOND("DIAMOND"),
    ONECARD("OneCard"),
    VISA("Visa"),
    MASTERCARD("MasterCard"),
    BOKU("Pay by mobile"),
    HUOLI("Huoli"),
    CJ("CJ"),
    UNKNOWN("UNKNOWN");
    
    String value;

    public final String getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(11323);
    }

    private as(String str) {
        this.value = str;
    }
}
