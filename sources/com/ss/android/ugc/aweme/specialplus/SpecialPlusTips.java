package com.ss.android.ugc.aweme.specialplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class SpecialPlusTips {
    @c(a = "try_tip")
    private String tryTip = "";

    static {
        Covode.recordClassIndex(87971);
    }

    public final String getTryTip() {
        return this.tryTip;
    }

    public final void setTryTip(String str) {
        l.d(str, "");
        this.tryTip = str;
    }
}
