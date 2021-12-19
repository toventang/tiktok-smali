package com.ss.android.ugc.aweme.account;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class f implements Serializable {
    @c(a = "ftc")
    private final String ftc;
    @c(a = "normal")
    private final String normal;

    static {
        Covode.recordClassIndex(38824);
    }

    public final String getFtc() {
        return this.ftc;
    }

    public final String getNormal() {
        return this.normal;
    }
}
