package com.bytedance.android.livesdk.c;

import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public g[] f14858a;

    /* renamed from: b  reason: collision with root package name */
    protected g[] f14859b;

    static {
        Covode.recordClassIndex(8232);
    }

    public abstract g a(float f2);

    public c(List<g> list) {
        this.f14858a = new g[list.size()];
        this.f14859b = new g[list.size()];
        list.toArray(this.f14858a);
    }
}
