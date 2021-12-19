package com.ss.android.ugc.aweme.music.presenter;

import com.bytedance.covode.number.Covode;
import h.f.a.b;

final /* synthetic */ class u implements b {

    /* renamed from: a  reason: collision with root package name */
    private final int f111627a;

    static {
        Covode.recordClassIndex(71725);
    }

    u(int i2) {
        this.f111627a = i2;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        int i2 = this.f111627a;
        if (((Integer) obj).intValue() == 0) {
            return Integer.valueOf(i2);
        }
        return Integer.valueOf(i2 + 1);
    }
}
