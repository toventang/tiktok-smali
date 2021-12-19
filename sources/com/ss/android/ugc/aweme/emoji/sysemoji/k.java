package com.ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public final class k implements Serializable {
    @c(a = "d")

    /* renamed from: d  reason: collision with root package name */
    private List<? extends a> f89403d;
    @c(a = "v")
    private String v;

    static {
        Covode.recordClassIndex(56176);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.emoji.sysemoji.a>, java.util.List<com.ss.android.ugc.aweme.emoji.sysemoji.a> */
    public final List<a> getD() {
        return this.f89403d;
    }

    public final String getV() {
        return this.v;
    }

    public final void setD(List<? extends a> list) {
        this.f89403d = list;
    }

    public final void setV(String str) {
        this.v = str;
    }
}
