package com.bytedance.android.live.liveinteract.linkroom.a.c;

import com.bytedance.covode.number.Covode;
import f.a.d.g;

final /* synthetic */ class k implements g {

    /* renamed from: a  reason: collision with root package name */
    private final int f10517a;

    static {
        Covode.recordClassIndex(5601);
    }

    k(int i2) {
        this.f10517a = i2;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        return Long.valueOf(((long) this.f10517a) - ((Long) obj).longValue());
    }
}
