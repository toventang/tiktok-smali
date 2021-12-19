package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import h.f.a.m;

final /* synthetic */ class r implements m {

    /* renamed from: a  reason: collision with root package name */
    private final p f94994a;

    static {
        Covode.recordClassIndex(60244);
    }

    r(p pVar) {
        this.f94994a = pVar;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        p pVar = this.f94994a;
        Float f2 = (Float) obj2;
        boolean z = true;
        if (Math.abs(f2.floatValue()) <= Math.abs(((Float) obj).floatValue()) || (f2.floatValue() >= 0.0f && pVar.q.Y == 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
